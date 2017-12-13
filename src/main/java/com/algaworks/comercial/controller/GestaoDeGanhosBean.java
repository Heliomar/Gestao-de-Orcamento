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
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


/**
 *
 * @author Helio
 */
@Named
@ViewScoped
public class GestaoDeGanhosBean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private GestaoGanhos gestaoGanhos;    

    private Ganho ganho = new Ganho();
    
    private TiposGanhos item;

    
    
    @SuppressWarnings("UnusedAssignment")
    public void salvaGanhos(Ganho ganho)
    {
        try{
            if(ganho == null)
                ganho = new Ganho();
        gestaoGanhos.SalvarGanhos(ganho);
//  
        
        FacesMessage msg = new FacesMessage("Gestão de  Ganhos com sucesso!");
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
    
    ganho.getItens().add(item);//.addAll((Collection<? extends TiposGanhos>) item); //.add(item);
    item.setGanho(ganho);//setGanho(ganho);
    
    }
   /**
     * @return the ganho
     */
    
    
    public Ganho getGanho() {
        return ganho;
    }
    
    
    /**
     * @return the tipagem
    
    */
    
    
    public TiposGanhos getItem() {
        
        return item;
    }

    
 
    
}
