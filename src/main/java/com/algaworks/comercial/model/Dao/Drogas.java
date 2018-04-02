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
//@ManagedBean
//@ViewScoped
@Entity
@Table(name="drogas")
public class Drogas implements Serializable {
    
    
   private static final long serialVersionUID = 1L;
     
    public Drogas(){
    }
    
    public Drogas(Long id_Dorgas, String descricao, String Volume,TipoItem tipo, String nomeDroga){
    this.id_Drogas=  id_Drogas;
    this.descricao = descricao;
    this.Volume = Volume;
    this.tipo= tipo;
    this.nomeDroga = nomeDroga;
    }
    
    
    private Long id_Drogas;
    private String descricao;
    private String Volume;
    private TipoItem tipo;  
    private String nomeDroga;
    
    
    @OneToMany(mappedBy = "drogas", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TipoItemDroga> Item  = new ArrayList();

    /**
     * @return the Volume
     */
    @Column(name="volume", nullable = false)
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
    @Column(name="volume", nullable = false)
    public String getNomeDroga() {
        return nomeDroga;
    }

    /**
     * @param nomeDroga the NomeDdroga to set
     */
    public void setNomeDroga(String nomeDroga) {
        this.nomeDroga = nomeDroga;
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
    @Column(name="descricao", nullable = false)
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
     * @param nomeDroga the NomeDroga to set
     */
    public void setNomedroga(String nomeDroga) {
        this.nomeDroga = nomeDroga;
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
    @Enumerated(EnumType.STRING)
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_drogas",nullable=false)
    public Long getId_Drogas() {
        return id_Drogas;
    }

    /**
     * @param id_Drogas the Id_Drogas to set
     */
    public void setId_Drogas(Long id_Drogas) {
        this.id_Drogas = id_Drogas;
    }
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_Drogas == null) ? 0 : id_Drogas.hashCode());
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
		Drogas other = (Drogas) obj;
		if (id_Drogas == null) {
			if (other.id_Drogas != null)
				return false;
		} else if (!id_Drogas.equals(other.id_Drogas))
			return false;
		return true;
	}

    
    
}
