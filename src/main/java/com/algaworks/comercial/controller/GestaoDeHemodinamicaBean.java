/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.controller;

import com.algaworks.comercial.model.Dao.Hemodinamica;
import com.algaworks.comercial.service.GestaoHemodinamicas;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Helio
 */

@Named
@ViewScoped
public class GestaoDeHemodinamicaBean implements Serializable {
    
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private GestaoHemodinamicas gestaoHemodinamicas;

    @PostConstruct
    public void Init(){
    hemodinamica = new Hemodinamica();
    }
    private Hemodinamica hemodinamica;// = new Hemodinamica();
    
    
    //private HemodinamicaItem item;
   
   public void salvarHemodinamica(Hemodinamica hemodinamica)
   {
   
     
       gestaoHemodinamicas.salvar(hemodinamica);
       hemodinamica = new Hemodinamica();
   }
   
   public Hemodinamica getHemodinamica()
   {
   
       return hemodinamica;
   }
    
}