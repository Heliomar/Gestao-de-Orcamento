/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dao;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Column;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Helio
 */

@ViewScoped
@ManagedBean
public class Ganho  {
    
    @NotEmpty
    @Column(name="soro")
    private String Soro;
    
    @NotEmpty
    @Column(name="volume")
    private int Volume;
    
    @Column(name="medicacao")
    private String Medicação;
    
    @Column(name="hemocomponente")
    private String Hemocomponente;
    
    
    Ganho(String soro,int volume, String medicacao, String hemocomponente )
    {
       
       this.Soro= soro;
       this.Volume = volume;
       this.Medicação = medicacao;
       this.Hemocomponente = hemocomponente;       
    
    }
    
    

    /**
     * @return the Soro
     */
    @NotEmpty
    public String getSoro() {
        return Soro;
    }

    /**
     * @param Soro the Soro to set
     */
    public void setSoro(String Soro) {
        this.Soro = Soro;
    }

    /**
     * @return the Volume
     */
    public int getVolume() {
        return Volume;
    }

    /**
     * @param Volume the Volume to set
     */
    public void setVolume(int Volume) {
        this.Volume = Volume;
    }

    /**
     * @return the Medicação
     */
    public String getMedicação() {
        return Medicação;
    }

    /**
     * @param Medicação the Medicação to set
     */
    public void setMedicação(String Medicação) {
        this.Medicação = Medicação;
    }

    /**
     * @return the Hemocomponente
     */
    public String getHemocomponente() {
        return Hemocomponente;
    }

    /**
     * @param Hemocomponente the Hemocomponente to set
     */
    public void setHemocomponente(String Hemocomponente) {
        this.Hemocomponente = Hemocomponente;
    }
    
}
