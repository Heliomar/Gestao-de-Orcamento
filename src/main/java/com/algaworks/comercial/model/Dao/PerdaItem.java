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
    
    
     private static final long serialVersionUID = 1L;
     
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
	
        //@JoinColumn(name="perda")
	@ManyToOne
	private Perda perda;

    
        
        
    public Integer getId_Item() {
        return Id_Item;
    }

    /**
     * @param Id_Item the Id_Item to set
     */
    public void setId_Item(Integer Id_Item) {
        this.Id_Item = Id_Item;
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
    
}
