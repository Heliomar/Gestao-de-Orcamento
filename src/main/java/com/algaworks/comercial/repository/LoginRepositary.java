/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.repository;

import com.algaworks.comercial.model.Dao.Login;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Helio
 */
public class LoginRepositary implements Serializable{
 
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private EntityManager manager;
    
   
    
     public Login  guardarLogin(Login login){
        
         if(login != null){
             
           manager.persist(login);
           
          FacesMessage fm = new FacesMessage("Login Persiste com Sucesso..!");
            FacesContext.getCurrentInstance().addMessage("Login", fm);
           
            manager.close();
         }
         //manager.getTransaction().commit();
        
         return manager.merge(login);
       
        
        }
}
