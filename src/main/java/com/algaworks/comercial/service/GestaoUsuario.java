/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.service;

import com.algaworks.comercial.model.Dao.Usuario;
import com.algaworks.comercial.repository.UsuarioRepository;
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
public class GestaoUsuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioRepository usuario;
        
        
        
        @PostConstruct
        public void Init(){
        this.usuario =  usuario;
        }
        public GestaoUsuario(){
        
        }
        
	
	@Transacional
	public void salvar(Usuario usuarios) {
            
            if(usuario != null){
                
            
            
		usuario.guardarUsuario(usuarios);
                
                 FacesMessage msg = new FacesMessage("Usuarios salvo com sucesso....!");
		FacesContext.getCurrentInstance().addMessage("Usuario", msg);
                
            }else if(usuario  == null){ 
                
                usuario = this.usuario;
                usuario.guardarUsuario(usuarios);
                FacesMessage msg = new FacesMessage("Usuarios Não salvos....!");
		FacesContext.getCurrentInstance().addMessage("Usuario", msg);
                
	}
    
        
 }
        
}