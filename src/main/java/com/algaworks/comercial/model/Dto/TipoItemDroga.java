/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dto;

import com.algaworks.comercial.model.Dao.Drogas;
import com.algaworks.comercial.model.Dao.TipoItem;
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
@Table(name ="tipo_ItemDroga")
public class TipoItemDroga implements Serializable {
    
    public TipoItemDroga(){
    }
    
    
    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoItem item;
    
    @NotEmpty
    private String descricao;
    
    @ManyToOne
    private Drogas drogas;
    
    @NotEmpty
    private String nome;
    
    @NotNull
    private String volume;
    
    @NotNull
    private Integer quantidade;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
     * @return the quantidade
     */
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the item
     */
    public TipoItem getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(TipoItem item) {
        this.item = item;
    }

    /**
     * @return the drogas
     */
    public Drogas getDrogas() {
        return drogas;
    }

    /**
     * @param drogas the drogas to set
     */
    public void setDrogas(Drogas drogas) {
        this.drogas = drogas;
    }

    /**
     * @return the Id
     */
    public Long getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Long Id) {
        this.Id = Id;
    }
    
    
	
}
