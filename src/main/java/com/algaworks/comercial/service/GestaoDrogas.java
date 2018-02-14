package com.algaworks.comercial.service;

import com.algaworks.comercial.Hibernate.HibernateUtil;
import com.algaworks.comercial.model.Dao.Drogas;
import com.algaworks.comercial.repository.DrogasRepository;
import com.algaworks.comercial.util.Transacional;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import org.hibernate.SessionFactory;

/**
 *
 * @author Helio
 */
public class GestaoDrogas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private DrogasRepository drogarias;

    private Drogas drogas;

    public GestaoDrogas() {
        this.drogas = drogas;
    }

    public void Init() {

        System.out.println("nicializando Gestao drogas..........!");
    }

    @Transacional
    public void salvar(Drogas drogas) {

        SessionFactory session = HibernateUtil.getSessionFactory();
        session.openSession().save(drogas);

        if (drogas != null) {
            drogarias.guardarDrogas(drogas);

            FacesMessage msg = new FacesMessage("Drogas Salvas com sucesso....!");
            FacesContext.getCurrentInstance().addMessage("Drogas", msg);

            session.close();

        } else if (drogas == null) {

            drogas = new Drogas();

            FacesMessage msg = new FacesMessage("Drogas Não Salvou com sucesso!");
            FacesContext.getCurrentInstance().addMessage("Drogas", msg);
          
            
        }
        
    }

}
