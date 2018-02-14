/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.controller;


import com.algaworks.comercial.model.Dao.Ganho;
import com.algaworks.comercial.model.Dto.TiposGanhos;
import com.algaworks.comercial.service.GestaoGanhos;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


@ViewScoped
@Named
public class GestaoDeGanhosBean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private GestaoGanhos gestaoGanhos;    

    private Ganho ganho;// = new Ganho();
    private TiposGanhos item;
    
    @PostConstruct
    public void Init(){
    System.out.println("inicializando Ganhos Bean...!");
    }
    
    public  GestaoDeGanhosBean(){
    ganho = new Ganho();
    System.out.println("inicializando classe Ganhos....!");
    }
    
    public void salvaGanhos(Ganho ganho)
    {
        try{
            if(ganho != null)
                
        gestaoGanhos.SalvarGanhos(ganho);
//  
        
        FacesMessage msg = new FacesMessage("Gestão de  Ganhos Salvo com sucesso!");
        FacesContext.getCurrentInstance().addMessage("Ganhos", msg);
        
        }catch(Exception ex ){
        
        System.out.println("Sistema ganhos error"+ex);
        }
    }

    public void novoGanho()
    {
       item = new TiposGanhos();
       
        item.getDescricao();
        item.getTipo();
        item.getVolume();
    
        item = new TiposGanhos();
        
        }
    
    public void adicionarGanhos(){
    
    ganho.getItens().add(item);
    item.setGanho(ganho);
    
    }
   
    public Ganho getGanho() {
        return ganho;
    }
  
    public TiposGanhos getItem() {
        
        return item;
    }

    
 
    
}
