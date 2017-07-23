/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.controller;

import com.algaworks.comercial.model.Dao.Drogas;
import com.algaworks.comercial.model.Dto.TipoItemDroga;
import com.algaworks.comercial.service.GestaoDrogas;
import java.io.Serializable;
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
@ViewScoped
public class GestaoDeDrogasBean implements Serializable{
    
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private GestaoDrogas gestaoDrogas;
    
    
    private Drogas drogas = new Drogas();
    
    
    private TipoItemDroga item;
    
    
    public void NovaDroga()
    {    
        item = new TipoItemDroga();  
    }
    
    public void AdicionarDroga()
    {
      drogas.getItem().add(item);
      item.setDrogas(drogas);
      
    }
    public Drogas getDrogas()
    {
    
        return drogas;
    }
    
    public void  SalvarDrogas()
    {
    
        gestaoDrogas.salvar(drogas);
        drogas = new Drogas();
    
    FacesMessage msg = new FacesMessage("Drogas salvas com sucesso!");
		FacesContext.getCurrentInstance().addMessage(null, msg);
    
    }

    /**
     * @return the gestaoDrogas
     */
    public GestaoDrogas getGestaoDrogas() {
        return gestaoDrogas;
    }

    /**
     * @param gestaoDrogas the gestaoDrogas to set
     */
    public void setGestaoDrogas(GestaoDrogas gestaoDrogas) {
        this.gestaoDrogas = gestaoDrogas;
    }

    /**
     * @param drogas the drogas to set
     */
    public void setDrogas(Drogas drogas) {
        this.drogas = drogas;
    }

    /**
     * @return the item
     */
    public TipoItemDroga getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(TipoItemDroga item) {
        this.item = item;
    }
}
