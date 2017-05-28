/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dao;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Helio
 */

@ViewScoped
@ManagedBean
public class Drogas {
    
    @Column(name="descricao")
    private String descricao;
    
    @NotEmpty
    @Column(name="volume")
    private String Volume;
    
    @NotEmpty
    @Enumerated(EnumType.STRING)
    private DrogaTipo drogas;
    
    @NotEmpty
    @Column(name="nomeDroga")
    private String NomeDroga; 
    
    @OneToMany(mappedBy = "drogas", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DrogaTipo> TipoItemDroga = new ArrayList();

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
    public DrogaTipo getDrogas() {
        return drogas;
    }

    /**
     * @param drogas the drogas to set
     */
    public void setDrogas(DrogaTipo drogas) {
        this.drogas = drogas;
    }

    /**
     * @return the NomeDdroga
     */
    public String getNomeDroga() {
        return NomeDroga;
    }

    /**
     * @param NomeDroga the NomeDdroga to set
     */
    public void setNomeDdroga(String NomeDroga) {
        this.NomeDroga = NomeDroga;
    }

    /**
     * @return the TipoItemDroga
     */
    public List<DrogaTipo> getTipoItemDroga() {
        return TipoItemDroga;
    }

    /**
     * @param TipoItemDroga the TipoItemDroga to set
     */
    public void setTipoItemDroga(List<DrogaTipo> TipoItemDroga) {
        this.TipoItemDroga = TipoItemDroga;
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
    
}
