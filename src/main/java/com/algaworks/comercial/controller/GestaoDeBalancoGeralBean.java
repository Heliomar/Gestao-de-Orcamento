/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.controller;

import com.algaworks.comercial.model.Dao.Login;
import com.algaworks.comercial.relatorio.Relatorios;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Helio
 */

@Named
@SessionScoped
public class GestaoDeBalancoGeralBean implements Serializable{
    
      private List<Login> lista = new ArrayList<Login>();
    
    
    @PostConstruct
    public void Init(){
    System.out.println("Inicializando Balanco geral....!");
    }
    
    public GestaoDeBalancoGeralBean(){        
    }
 
    
    public void geraRelatoriosAction(){
    
        Relatorios relatorio = new Relatorios();
        relatorio.getRelatorios(lista);
    }
}