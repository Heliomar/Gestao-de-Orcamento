package com.algaworks.comercial.service;

import com.algaworks.comercial.model.Dao.Usuario;
import com.algaworks.comercial.repository.UsuarioRepository;
import com.algaworks.comercial.util.Transacional;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.New;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Helio
 */

public class GestaoUsuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioRepository usuarios;
        
        
        @PostConstruct
        public void Init(){
         
        }
        
        @Inject
        public GestaoUsuario(){
        }
        
	
	@Transacional
	public void salvar(Usuario usuario) {
            
            try{
            if(usuario != null)
               usuarios.guardarUsuario(usuario);
                
              FacesMessage msg = new FacesMessage("Usuarios salvo com sucesso....!");
		FacesContext.getCurrentInstance().addMessage("Usuario", msg);
                
           
               
            }catch(Exception ex){
                    
                    System.out.println("Gestão Usuario nao salvo....!"+ex);
                    
            }
	}
        
}