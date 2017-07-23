/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dao;

/**
 *
 * @author Helio
 */
public enum TipoItens {
 
    
        COMPONENTES("Medicação"),
	HEMODINAMICA("Enfermagem"),
        VOLUME("Alimentação");
	
	private String descricao;

	TipoItens(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
