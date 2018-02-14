package com.algaworks.comercial.model.Dao;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Helio
 */

@ViewScoped
@ManagedBean
public enum TipoItem {
    
         Oral("Hipossodica"),
	 Venosa("Subcutanea");
	
         @NotEmpty
	private String descricao;

	TipoItem(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
    
}
