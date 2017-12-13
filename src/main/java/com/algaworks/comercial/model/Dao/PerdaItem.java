/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Helio
 */
@Entity
@Table(name = "perda_Item")
public class PerdaItem implements Serializable{
    
    public PerdaItem(){
    }
    
        
        @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id_Item;
	
	@NotEmpty
	private String descricao;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoItens tipo;
	
	@NotNull
	private String volume;
	
	@ManyToOne
	private Perda perda;

    /**
     * @return the id
     */
    public Integer getId() {
        return Id_Item;
    }

    /**
     * @param Id the id to set
     */
    public void setId(Integer Id) {
        this.Id_Item = Id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the tipo
     */
    public TipoItens getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoItens tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the volume
     */
    public String getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * @return the perda
     */
    public Perda getPerda() {
        return perda;
    }

    /**
     * @param perda the perda to set
     */
    public void setPerda(Perda perda) {
        this.perda = perda;
    }

    
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id_Item == null) ? 0 : Id_Item.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PerdaItem other = (PerdaItem) obj;
		if (Id_Item == null) {
			if (other.Id_Item != null)
				return false;
		} else if (!Id_Item.equals(other.Id_Item))
			return false;
		return true;
	}
    
}
