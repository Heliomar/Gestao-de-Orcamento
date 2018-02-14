/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.repository;

import com.algaworks.comercial.Hibernate.HibernateUtil;
import com.algaworks.comercial.model.Dao.Hemodinamica;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import org.hibernate.SessionFactory;

/**
 *
 * @author Helio
 */
public class HemodinamicasRepository implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    public HemodinamicasRepository() {
        this.manager = manager;

    }

    public Hemodinamica guardarHemodinamica(Hemodinamica hemodinamica) {
        SessionFactory session = HibernateUtil.getSessionFactory();
        session.openSession().beginTransaction();
        if (hemodinamica != null) {

            manager.persist(hemodinamica);
            manager.flush();
            FacesMessage fm = new FacesMessage("Hemodinamica Persiste com Sucesso..!");
            FacesContext.getCurrentInstance().addMessage("Hemodinamica", fm);
            session.close();
        } else {
            manager.persist(hemodinamica);
            manager.flush();
            FacesMessage fm = new FacesMessage("Hemodinamica Não Persiste com Sucesso..!");
            FacesContext.getCurrentInstance().addMessage("Hemodinamica", fm);

        }

        manager.close();

        return hemodinamica;
    }

}
