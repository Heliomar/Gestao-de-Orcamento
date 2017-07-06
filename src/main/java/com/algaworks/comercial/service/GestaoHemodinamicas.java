/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.service;

import com.algaworks.comercial.model.Dao.Hemodinamica;
import com.algaworks.comercial.model.Dao.Perda;
import com.algaworks.comercial.repository.HemodinamicasRepository;
import com.algaworks.comercial.repository.PerdaRepositary;
import com.algaworks.comercial.util.Transacional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author Helio
 */
public class GestaoHemodinamicas implements Serializable {
    
    private static final long serialVersionUID = 1L;
	
	@Inject
	private HemodinamicasRepository hemodinamicas;
	
	@Transacional
	public void salvar(Hemodinamica hemodinamica) {
		hemodinamicas.guardar(hemodinamica);
	}
    
}
