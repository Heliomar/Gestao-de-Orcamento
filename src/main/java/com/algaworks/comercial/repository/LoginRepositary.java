/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.repository;

import com.algaworks.comercial.model.Dao.Login;
import java.io.Serializable;
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
    
     public Login guardarLogado(Login login){
        
            return manager.merge(login);
        
        }
}
