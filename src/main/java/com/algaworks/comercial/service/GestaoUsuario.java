/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.service;

import com.algaworks.comercial.model.Dao.Usuario;
import com.algaworks.comercial.repository.DrogasRepository;
import com.algaworks.comercial.repository.UsuarioRepository;
import com.algaworks.comercial.util.Transacional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author Helio
 */
public class GestaoUsuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioRepository usuario;
        
        
	
	@Transacional
	public void salvar(Usuario usuarios) {
		usuario.guardarUsuario(usuarios);
	}
    
        
}
