/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.controller;

import com.algaworks.comercial.model.Dao.Drogas;
import com.algaworks.comercial.model.Dao.Login;
import com.algaworks.comercial.model.Dto.TipoItemDroga;
import com.algaworks.comercial.relatorio.Relatorios;
import com.algaworks.comercial.service.GestaoDrogas;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Helio
 */
@Named
//@ViewScoped
@SessionScoped
public class GestaoDeDrogasBean implements Serializable{
    
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private GestaoDrogas gestaoDrogas;
    
    private TipoItemDroga item;     
    private Drogas drogas;
    
    
    @PostConstruct
    public void Init(){
       System.out.println("Inicializando Gestão de Drogas  Bean....!");
    
    }
    public GestaoDeDrogasBean(){
        drogas = new Drogas();
       }
    
   
    public void NovaDroga()
    {    
        item = new TipoItemDroga();  
    }
    
    public void AdicionarDroga()
    {
      getDrogas().getItem().add(item);
      item.setDrogas(getDrogas());
      
    }
   
    public void  SalvarDrogas(Drogas drogas)
    {
        
        gestaoDrogas.salvar(drogas);
        
        FacesMessage msg = new FacesMessage("Drogas salvas com sucesso!");
	FacesContext.getCurrentInstance().addMessage("Drogas", msg);
    
    }

    

     public Drogas getDrogas()
    {
         if (drogas == null)
             drogas = new Drogas();
        return drogas;
    }
    
    public void setDrogas(Drogas drogas) {
        this.drogas = drogas;
    }

    public TipoItemDroga getItem() {
        return item;
    }

    
    public void setItem(TipoItemDroga item) {
        this.item = item;
    }
    
    
}
