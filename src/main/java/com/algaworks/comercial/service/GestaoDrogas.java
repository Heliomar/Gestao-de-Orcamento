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
import javax.inject.Inject;

/**
 *
 * @author Helio
 */
public class GestaoDrogas implements Serializable{
    
    private static final long serialVersionUID = 1L;
	
	@Inject
	private DrogasRepository drogas;
	
	@Transacional
	public void salvar(Drogas droga) {
		drogas.guardarDrogas(droga);
	}
	
    
}
