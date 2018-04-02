/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.service;

import com.algaworks.comercial.model.Dao.Ganho;
import com.algaworks.comercial.repository.GanhosRepository;
import com.algaworks.comercial.util.Transacional;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Helio
 */
public class GestaoGanhos implements Serializable {
    
     private static final long serialVersionUID = 1L;
    //private static final 
  
    @Inject
    private GanhosRepository ganhos;
    
    
    @Transacional
    public void SalvarGanhos(Ganho ganho)
    {
            if(ganho == null){       
                       
            ganhos.GuardaGanho(ganho);
    
            FacesMessage msg = new FacesMessage("Gestao Ganhos Salvou com sucesso!");
	    FacesContext.getCurrentInstance().addMessage("Ganho", msg);
    
        }else{
        
        FacesMessage msg = new FacesMessage("Gestao Ganhos Não funcionou!");
	FacesContext.getCurrentInstance().addMessage("Drogas", msg);
    
        
        }
   
    
    }
}
