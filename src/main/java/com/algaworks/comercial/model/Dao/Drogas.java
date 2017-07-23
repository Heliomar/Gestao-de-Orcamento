/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dao;

import com.algaworks.comercial.model.Dto.TipoItemDroga;
import java.io.Serializable;
//import com.algaworks.comercial.model.Orcamento;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Helio
 */

//@ViewScoped
@Entity
//@ManagedBean
@Table(name="drogas")
public class Drogas{
    
    @Id
    @Column(name="Id_Drogas")
    private Integer Id_Drogas;
    
    @NotNull
    @Column(name="descricao")
    private String descricao;
    
    @NotEmpty
    @Column(name="volume")
    private String Volume;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoItem tipo;  
    
  
    @NotNull
    @NotEmpty
    @Column(name="NomeDroga")
    private String NomeDroga; 
    
    @OneToMany(mappedBy = "drogas", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TipoItemDroga> Item  = new ArrayList();

    /**
     * @return the Volume
     */
    public String getVolume() {
        return Volume;
    }

    /**
     * @param Volume the Volume to set
     */
    public void setVolume(String Volume) {
        this.Volume = Volume;
    }

    /**
     * @return the drogas
     */
   

    /**
     * @return the NomeDdroga
     */
    public String getNomeDroga() {
        return NomeDroga;
    }

    /**
     * @param NomeDroga the NomeDdroga to set
     */
    public void setNomeDroga(String NomeDroga) {
        this.NomeDroga = NomeDroga;
    }

    /**
     * @return the TipoItemDroga
     */
    public List<TipoItemDroga> getItem() {
        return Item;
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
     * @param NomeDroga the NomeDroga to set
     */
    public void setNomedroga(String NomeDroga) {
        this.NomeDroga = NomeDroga;
    }

    /**
     * @return the Item
     */
    public List<TipoItemDroga> Item() {
        return Item;
    }

    /**
     * @param Item the Item to set
     */
    public void setItem(List<TipoItemDroga> Item) {
        this.Item = Item;
    }

    /**
     * @return the tipo
     */
    public TipoItem getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoItem tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the Id_Drogas
     */
    public Integer getId_Drogas() {
        return Id_Drogas;
    }

    /**
     * @param Id_Drogas the Id_Drogas to set
     */
    public void setId_Drogas(Integer Id_Drogas) {
        this.Id_Drogas = Id_Drogas;
    }
    
    
    
}
