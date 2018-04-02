package com.algaworks.comercial.controller;

import com.algaworks.comercial.Hibernate.HibernateUtil;
import com.algaworks.comercial.model.Dao.Drogas;
import com.algaworks.comercial.model.Dto.TipoItemDroga;
import com.algaworks.comercial.service.GestaoDrogas;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

/**
 *
 * @author Helio
 */
@Named
@ViewScoped
//@SessionScoped
public class GestaoDeDrogasBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private FacesContext facesContext;

    @Inject
    private HttpServletResponse response;

    @Inject
    private GestaoDrogas gestaoDrogas;

    private TipoItemDroga item;
    private Drogas drogas;

    @PostConstruct
    public void Init() {
      }

    public GestaoDeDrogasBean(){
       }

    public void NovaDroga() {
        setItem(new TipoItemDroga());
    }

    public void AdicionarDroga() {
        getDrogas().getItem().add(getItem());
        getItem().setDrogas(getDrogas());

    }

    public Drogas SalvarDrogas(Drogas drogas) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        sessionFactory.openSession().getTransaction().begin();  
        try {
                   if(drogas != null)
                       sessionFactory.openSession().persist(drogas);
            this.gestaoDrogas.salvar(drogas);
            System.out.println("Salvando drogas bem....!");
            
            FacesMessage msg = new FacesMessage("Drogas salvas com sucesso!");
            FacesContext.getCurrentInstance().addMessage("Drogas", msg);

        } catch (Exception ex) {

            FacesMessage msg = new FacesMessage("Drogas não foram salvas!");
            FacesContext.getCurrentInstance().addMessage("Drogas", msg);

            System.out.println("Problemas de salvar Drogas");
        }finally{
            
            sessionFactory.close();
            
        System.out.println("finalizando drogas bem....!");
        
        }
        return drogas;
        
    }

    /**
     * @return the gestaoDrogas
     */
    public GestaoDrogas getGestaoDrogas() {
        return gestaoDrogas;
    }

    /**
     * @param gestaoDrogas the gestaoDrogas to set
     */
    public void setGestaoDrogas(GestaoDrogas gestaoDrogas) {
        this.gestaoDrogas = gestaoDrogas;
    }

    /**
     * @return the item
     */
    public TipoItemDroga getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(TipoItemDroga item) {
        this.item = item;
    }

    /**
     * @return the drogas
     */
    public Drogas getDrogas() {
        if (drogas == null) {
            drogas = new Drogas();
        }
        return drogas;
    }

    /**
     * @param drogas the drogas to set
     */
    public void setDrogas(Drogas drogas) {
        this.drogas = drogas;
    }

}
