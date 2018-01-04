/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.service;

import com.algaworks.comercial.model.Dao.Hemodinamica;
import com.algaworks.comercial.repository.HemodinamicasRepository;
import com.algaworks.comercial.util.Transacional;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Helio
 */
public class GestaoHemodinamicas implements Serializable {
    
    private static final long serialVersionUID = 1L;
	
     
    @Inject
     private HemodinamicasRepository hemodinamicas;
   
    private Hemodinamica hemodinamica;
     
   
	@Transacional
	public void salvar(Hemodinamica hemodinamica) {
            
            if (hemodinamica !=  null) {
               
              hemodinamicas.guardarHemodinamica(hemodinamica);
            
              FacesMessage fm = new FacesMessage("Hemodinamica Com Sucesso..!");
            FacesContext.getCurrentInstance().addMessage("Hemodinamica", fm);
            
	}else{
               
                System.out.println("Sem condição de salvar Hemodinamica NULL");
         }
                 
                 
        
        }
        
  }
