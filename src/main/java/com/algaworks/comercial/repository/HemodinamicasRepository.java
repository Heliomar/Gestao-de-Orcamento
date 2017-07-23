/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.repository;

import com.algaworks.comercial.model.Dao.Hemodinamica;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Helio
 */
public class HemodinamicasRepository implements Serializable{
    
     private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;
	
	public void guardarHemodinamica(Hemodinamica hemodinamica) {
            
                //manager.getTransaction().begin();
                manager.persist(hemodinamica);
               // manager.getTransaction().commit();
                manager.close();
		
            
            FacesMessage fm = new FacesMessage("Hemodinamica salva com Sucesso..!");
            FacesContext.getCurrentInstance().addMessage("Hemodinamica", fm);

            //return  manager.persist(hemodinamica);
	}
    
}
