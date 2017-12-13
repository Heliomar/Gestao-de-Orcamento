/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.controller;

import com.algaworks.comercial.model.Dao.Perda;

import com.algaworks.comercial.service.GestaoPerdas;
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
public class GestaoDePerdasBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    
    @Inject
    private GestaoPerdas gestaoPerdas;
    
    
     private Perda perda = new Perda();
     
//     private Perda  perda;
   // private PerdaItem itens;
 
   
   
    
    public void AdicionarPerda()
    {
         perda.getDiurese();
    
    }
    public void salvarPerda(Perda perda)
    {
     if (perda == null){
         
          perda = new Perda();          
          gestaoPerdas.salvar(perda);
                       
            FacesMessage msg = new FacesMessage("As Perdas salva com sucesso!");
	    FacesContext.getCurrentInstance().addMessage(null, msg);
      }else{
     
          gestaoPerdas.salvar(perda);
                       
            FacesMessage msg = new FacesMessage("As Perdas salva com sucesso!");
	    FacesContext.getCurrentInstance().addMessage(null, msg);
     }

    }
     public  Perda getPerda()
     {
        return perda;
     }
}
