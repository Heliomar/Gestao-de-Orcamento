package com.algaworks.comercial.model.Dao;

import com.algaworks.comercial.model.Dto.TipoItemDroga;
import java.io.Serializable;
//import com.algaworks.comercial.model.Orcamento;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Helio
 */

//@ViewScoped
@Entity
//@ManagedBean
@Table(name="drogas")
public class Drogas implements Serializable {
    
    
     private static final long serialVersionUID = 1L;
     
    public Drogas(){
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_drogas",nullable=false)
    private Long id_Drogas;
    
   
    @Column(name="descricao")
    private String descricao;

    
    @Column(name="volume")
    private String Volume;
    
    
    @Enumerated(EnumType.STRING)
    private TipoItem tipo;  
    
  
    
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
    public Long getId_Drogas() {
        return id_Drogas;
    }

    /**
     * @param id_Drogas the Id_Drogas to set
     */
    public void setId_Drogas(Long id_Drogas) {
        this.id_Drogas = id_Drogas;
    }
    
    
    
}
