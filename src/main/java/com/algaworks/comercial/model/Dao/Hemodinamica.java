/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dao;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name = "hemodinamica")
public class Hemodinamica implements Serializable{
    
    
   @Id
   @NotEmpty
   @Column(name="PressaoA", nullable=false)
    private Integer PressaoA;
   
   @NotEmpty
    @Column(name="PressaoAM",nullable=false)
    private Integer PressaoAMedia;
   
   @NotEmpty
   @Column(name="frequencia", nullable=false)
    private Integer Frequencia;
   
   @NotEmpty
    @Column(name="FrequenciaCardio", nullable=false)
    private Integer FrequenciaCardio;
   
   @NotEmpty
    @Column(name="temperatura",  nullable=false)
    private Integer Temperatura;
   
   @NotEmpty
   @Column(name="saturacao",  nullable=false)
    private Integer Saturacao;
   
   @NotEmpty
    @Column(name="HemoGt",  nullable=false)
    private Integer HemoGT;
   
   @NotEmpty
    @Column(name="Pia",  nullable=false)
    private Integer Pia;
   
    @NotEmpty
    @Column(name="Pvc",  nullable=false)
    private Integer Pvc;

    /**
     * @return the PressaoA
     */
    public Integer getPressaoA() {
        return PressaoA;
    }

    /**
     * @param PressaoA the PressaoA to set
     */
    public void setPressaoA(Integer PressaoA) {
        this.PressaoA = PressaoA;
    }

    /**
     * @return the PressaoAMedia
     */
    public Integer getPressaoAMedia() {
        return PressaoAMedia;
    }

    /**
     * @param PressaoAMedia the PressaoAMedia to set
     */
    public void setPressaoAMedia(Integer PressaoAMedia) {
        this.PressaoAMedia = PressaoAMedia;
    }

    /**
     * @return the Frequencia
     */
    public Integer getFrequencia() {
        return Frequencia;
    }

    /**
     * @param Frequencia the Frequencia to set
     */
    public void setFrequencia(Integer Frequencia) {
        this.Frequencia = Frequencia;
    }

    /**
     * @return the FrequenciaCardio
     */
    public Integer getFrequenciaCardio() {
        return FrequenciaCardio;
    }

    /**
     * @param FrequenciaCardio the FrequenciaCardio to set
     */
    public void setFrequenciaCardio(Integer FrequenciaCardio) {
        this.FrequenciaCardio = FrequenciaCardio;
    }

    /**
     * @return the Temperatura
     */
    public Integer getTemperatura() {
        return Temperatura;
    }

    /**
     * @param Temperatura the Temperatura to set
     */
    public void setTemperatura(Integer Temperatura) {
        this.Temperatura = Temperatura;
    }

    /**
     * @return the Saturacao
     */
    public Integer getSaturacao() {
        return Saturacao;
    }

    /**
     * @param Saturacao the Saturacao to set
     */
    public void setSaturacao(Integer Saturacao) {
        this.Saturacao = Saturacao;
    }

    /**
     * @return the HemoGT
     */
    public Integer getHemoGT() {
        return HemoGT;
    }

    /**
     * @param HemoGT the HemoGT to set
     */
    public void setHemoGT(Integer HemoGT) {
        this.HemoGT = HemoGT;
    }

    /**
     * @return the Pia
     */
    public Integer getPia() {
        return Pia;
    }

    /**
     * @param Pia the Pia to set
     */
    public void setPia(Integer Pia) {
        this.Pia = Pia;
    }

    /**
     * @return the Pvc
     */
    public Integer getPvc() {
        return Pvc;
    }

    /**
     * @param Pvc the Pvc to set
     */
    public void setPvc(Integer Pvc) {
        this.Pvc = Pvc;
    }
    
    
}
