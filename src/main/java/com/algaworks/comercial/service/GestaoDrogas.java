/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.service;

import com.algaworks.comercial.model.Dao.Drogas;
import com.algaworks.comercial.repository.DrogasRepository;
import com.algaworks.comercial.util.Transacional;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Helio
 */
public class GestaoDrogas implements Serializable{
    
    private static final long serialVersionUID = 1L;
	
	@Inject
	private DrogasRepository drogarias;
        
        private Drogas drogas;
	
       public GestaoDrogas(){
           this.drogas= drogas;
       }
       
      
        public void Init(){
        
        System.out.println("nicializando Gestao drogas..........!");
        }
                
	@Transacional
	public void salvar(Drogas drogas) {
            
            if(drogas != null){
		drogarias.guardarDrogas(drogas);
                
                FacesMessage msg = new FacesMessage("Drogas Salvas com sucesso....!");
		FacesContext.getCurrentInstance().addMessage(null, msg);
    
                
	}else if(drogas == null){
                        
            drogas = new Drogas();
            
            drogarias.guardarDrogas(drogas);
            
                FacesMessage msg = new FacesMessage("Drogas Não Salvou com sucesso!");
		FacesContext.getCurrentInstance().addMessage(null, msg);
    
            }
   }
	
    
}
