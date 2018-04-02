package com.algaworks.comercial.repository;

import com.algaworks.comercial.model.Dao.Login;
import java.io.Serializable;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
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
           manager.getTransaction().commit();
           FacesMessage fm = new FacesMessage("Login Persiste com Sucesso..!");
            FacesContext.getCurrentInstance().addMessage("Login", fm);
            
            System.out.println("  Persiste com acesso a login....!.Obrigado.!");
           
           // manager.close();
         }
         //manager.getTransaction().commit();
        
         return manager.merge(login);
       
        
        }
     public Login porId(Long Id_Login) {
		return this.manager.find(Login.class, Id_Login);
	}
	
}
