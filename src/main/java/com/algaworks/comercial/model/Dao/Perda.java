/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dao;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Helio
 */

@ViewScoped
@ManagedBean
@Entity
@Table(name="Perda")
public class Perda{
    
    @NotEmpty
    @Column(name="Diurese")
    private String Diurese;
    
    @NotEmpty
    @Column(name="SondaNaso")
    private String SondaNaso;
    
    @Column(name="dreno")
    private String Dreno;
    
    @Column(name="hemodialise")
    private String Hemodialise;

     Perda(String diurese, String sondaNaso, String dreno, String hemodialise){
    
         this.Diurese = diurese;
         this.Dreno = dreno;
         this.Hemodialise = hemodialise;
         this.SondaNaso = sondaNaso;
        }
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
    
}
