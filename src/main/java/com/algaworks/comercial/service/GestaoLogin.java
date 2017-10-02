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
import javax.inject.Inject;

/**
 *
 * @author Helio
 */
public class GestaoLogin implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private LoginRepositary logado;
    
    @PostConstruct
    private void Init(){
    
        Login login = new Login();
    }
    
    @Transacional
    public void salvarLogin(Login login){        
        logado.guardarLogin(login);

    
    }
    
}
