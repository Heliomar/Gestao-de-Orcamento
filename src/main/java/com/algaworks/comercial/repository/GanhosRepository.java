/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.repository;

import com.algaworks.comercial.model.Dao.Ganho;
import java.io.Serializable;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Helio
 */
public class GanhosRepository implements Serializable{
 
    
    @Inject
    private EntityManager manager;
    
    public Ganho GuardaGanho(Ganho ganho )
    {
    
       return manager.merge(ganho);
    }
    
}
