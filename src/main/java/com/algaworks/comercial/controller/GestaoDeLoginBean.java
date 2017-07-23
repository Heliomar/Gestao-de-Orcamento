/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.controller;

import com.algaworks.comercial.model.Dao.Login;
import com.algaworks.comercial.service.GestaoLogin;
import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Helio
 */

@Named
@ViewScoped

public class GestaoDeLoginBean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
   @Inject
   private GestaoLogin gestaoLogin;
    
   private Login login = new Login();
    
  
   
   public void SalvarLogin(Login login)
    {
        
        gestaoLogin.salvarLogin(login);
        login = new Login();
        
     //   login = new Login();
      
    
    }
  public Login ConfereLogin(Login login){
    String nome = null;
    
    if(!login.getNome().equals(nome)){
    
        nome = login.getNome();
    }
          
          
  
  return login;
  } 
    
    
    public Login getLogin(){
        
        return login;
    }
    public void mostraLogado(Login login){
    
       
        String nome = login.getNome();
        Long senha = login.getSenha();
        
        
        login.setNome(nome);
        login.setSenha(senha);
        
    }
    
    /**
     * @return the gestaoLogin
     */
    
   
    /**
     * @param login the login to set
     */
    public void setLogin(Login login) {
        this.login = login;
    }
    
}
