/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Helio
 */
//@ManagedBean
@Entity
@Table(name = "perda")
public class Perda{

    @Id
    @Column(name="Id_Perda")
    private Integer Id_Perda;
   
    @NotEmpty
    @Column(name = "Diurese")
    private String Diurese;

    @NotEmpty
    @Column(name = "SondaNaso")
    private String SondaNaso;

    @Column(name = "dreno")
    private String Dreno;

    @Column(name = "hemodialise")
    private String Hemodialise;

    @OneToMany(mappedBy = "perda", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PerdaItem> itens = new ArrayList<>();

    /**
     * @return the Diurese
     */
    public String getDiurese() {
        return Diurese;
    }

    /**
     * @param Diurese the Diurese to set
     */
    public void setDiurese(String Diurese) {
        this.Diurese = Diurese;
    }

    /**
     * @return the SondaNaso
     */
    public String getSondaNaso() {
        return SondaNaso;
    }

    /**
     * @param SondaNaso the SondaNaso to set
     */
    public void setSondaNaso(String SondaNaso) {
        this.SondaNaso = SondaNaso;
    }

    /**
     * @return the Dreno
     */
    public String getDreno() {
        return Dreno;
    }

    /**
     * @param Dreno the Dreno to set
     */
    public void setDreno(String Dreno) {
        this.Dreno = Dreno;
    }

    /**
     * @return the Hemodialise
     */
    public String getHemodialise() {
        return Hemodialise;
    }

    /**
     * @param Hemodialise the Hemodialise to set
     */
    public void setHemodialise(String Hemodialise) {
        this.Hemodialise = Hemodialise;
    }

    /**
     * @return the itens
     */
    public List<PerdaItem> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(List<PerdaItem> itens) {
        this.itens = itens;
    }

    /**
     * @return the Id_Perda
     */
    public Integer getId_Perda() {
        return Id_Perda;
    }

    /**
     * @param Id_Perda the Id_Perda to set
     */
    public void setId_Perda(Integer Id_Perda) {
        this.Id_Perda = Id_Perda;
    }

    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id_Perda == null) ? 0 : Id_Perda.hashCode());
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
		Perda other = (Perda) obj;
		if (Id_Perda == null) {
			if (other.Id_Perda != null)
				return false;
		} else if (!Id_Perda.equals(other.Id_Perda))
			return false;
		return true;
	}
}
