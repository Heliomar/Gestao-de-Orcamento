/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dto;

import com.algaworks.comercial.model.Dao.Ganho;

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
 * @author Helioarrays em java
 */
@Entity
@Table(name = "tipos_ganhos")
public class TiposGanhos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty
    private String descricao;
    
    @NotNull
    private String volume;
    
    @ManyToOne
    private Ganho ganho;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ItemGanhos tipo;

    /**
     * @return the melhora
     */
   
    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
     * @return the ganho
     */
    public Ganho getGanho() {
        return ganho;
    }

    /**
     * @param ganho the ganho to set
     */
    public void setGanho(Ganho ganho) {
        this.ganho = ganho;
    }

    /**
     * @return the Id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the Id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the tipo
     */
    public ItemGanhos getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(ItemGanhos tipo) {
        this.tipo = tipo;
    }

    public void setGanhos(Ganho ganho) {
       
     this.ganho = ganho;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		TiposGanhos other = (TiposGanhos) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

    
 
 
}
