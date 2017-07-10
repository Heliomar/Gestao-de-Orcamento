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
@ViewScoped
@Named
public class GestaoDeLoginBean implements Serializable{
    
    
    
   @Inject
   private GestaoLogin gestaoLogin;
    
    private Login login = new Login();
    
    
    
    
    public Login getLogin(){
        
        return login;
    }
    public void mostraLogado(Login login){
    
        Integer id = login.getId_login();
        String nomeLogin = login.getNome();
        Long senha = login.getSenha();
        
        login.setId_login(id);
        login.setNome(nomeLogin);
        login.setSenha(senha);
        
    }
    public void SalvarLogin()
    {
    
    login.getNome();
    login.getSenha();
    
    gestaoLogin.salvar(login);
       login = new Login();
    
    }
    
}
