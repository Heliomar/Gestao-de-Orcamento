/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.repository;

import com.algaworks.comercial.model.Dao.Perda;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Helio
 */
public class PerdaRepositary implements Serializable {
    
    
    private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;
	
	public Perda guardarPerda(Perda perda) {
            
            manager.persist(perda);
            manager.flush();
		
            FacesMessage msg = new FacesMessage(" Perdas Persiste  com sucesso!");
	      FacesContext.getCurrentInstance().addMessage("Perda", msg);
              
             return perda;
	}
}
