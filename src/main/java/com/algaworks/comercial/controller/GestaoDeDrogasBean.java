/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.controller;

import com.algaworks.comercial.model.Dao.Drogas;
import com.algaworks.comercial.service.GestaoDrogas;
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
public class GestaoDeDrogasBean implements Serializable{
    
    @Inject
    private GestaoDrogas gestaoDrogas;
    
    
    private Drogas drogas = new Drogas();
    
    
    //private DrogaItem itens;
    
    
    public Drogas getDrogas()
    {
    
        return drogas;
    }
    
    public void  SalvarDrogas()
    {
    
    gestaoDrogas.salvar(drogas);
    drogas = new Drogas();
    
    
    
    }
}
