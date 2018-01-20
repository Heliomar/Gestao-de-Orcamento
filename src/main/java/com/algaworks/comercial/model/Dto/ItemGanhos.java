/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Helio
 */
@ManagedBean
@ViewScoped
public enum ItemGanhos {
    
          ORAL("Oral"),
	  VENOSA("Venosa"),
          ALIMENTO("Alimento"),
          PIORA("Piora");
	
       
	private String descricao;

	ItemGanhos(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
