/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    }
    
    @PostConstruct
    public void Init(){
           
        System.out.println("inicializando Gestao Login...!");
    }
    @Transacional
    public void salvarLogin(Login login){   
        
       try{
        logado.guardarLogin(login);
        
         FacesMessage fm = new FacesMessage("Logado com Sucesso..!");
            FacesContext.getCurrentInstance().addMessage("Login", fm);
           
       }catch(Exception ex){
               
           System.out.println("  Erro de acesso a login....!"+ex);
           
         }finally{
           
           System.out.println("  finalizando acesso a login....!");
       
            }
                
        }
    
    
    
}
