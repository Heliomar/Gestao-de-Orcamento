
package com.algaworks.comercial.service;

import com.algaworks.comercial.model.Dao.Login;
import com.algaworks.comercial.repository.LoginRepositary;
import com.algaworks.comercial.util.Transacional;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
//import javax.enterprise.context.Initialized.*;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Helio
 */
public class GestaoLogin implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private LoginRepositary logado;
    
    private Login login;
    
    public GestaoLogin (){  
        this.logado = logado;
    }
    

    public GestaoLogin(LoginRepositary logado, Login login) {
        this.logado = logado;
        this.login = login;
    }
    
    @PostConstruct
    public void Init(){
       
     }
    
    @Transacional
    public void salvarLogin(Login login){   
        
       try{
           if(login != null)
        logado.guardarLogin(login);
        
         FacesMessage fm = new FacesMessage("Logado com Sucesso..!");
            FacesContext.getCurrentInstance().addMessage("Login", fm);
           
       }catch(Exception ex){
               
           System.out.println("  Erro de acesso a login....!"+ex);
           
         }finally{
           
          
            }
                
        }
    
    
    
}
