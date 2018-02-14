package com.algaworks.comercial.model.Dao;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name = "hemodinamica")
public class Hemodinamica implements Serializable{
    
     private static final long serialVersionUID = 1L;
    
    public Hemodinamica(){
    }
   
    @Id
    @Column(name="Id_Hemodinamica")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id_Hemodinamica;
    
    
    @Column(name="PressaoA")
    private String PressaoA;
   
    
    @Column(name="PressaoAM")
    private String PressaoAMedia;
   
   
    @Column(name="frequencia")
    private String Frequencia;
   
   
    @Column(name="FrequenciaCardio")
    private String FrequenciaCardio;
   
   
    @Column(name="temperatura")
    private String Temperatura;
   
  
    @Column(name="saturacao")
    private String Saturacao;
   
   
    @Column(name="HemoGt")
    private String HemoGT;
   

    @Column(name="Pia")
    private String Pia;
   
   
    @Column(name="Pvc")
    private String Pvc;

    /**
     * @return the PressaoA
     */
    public String getPressaoA() {
        return PressaoA;
    }

    /**
     * @param PressaoA the PressaoA to set
     */
    public void setPressaoA(String PressaoA) {
        this.PressaoA = PressaoA;
    }

    /**
     * @return the PressaoAMedia
     */
    public String getPressaoAMedia() {
        return PressaoAMedia;
    }

    /**
     * @param PressaoAMedia the PressaoAMedia to set
     */
    public void setPressaoAMedia(String PressaoAMedia) {
        this.PressaoAMedia = PressaoAMedia;
    }

    /**
     * @return the Frequencia
     */
    public String getFrequencia() {
        return Frequencia;
    }

    /**
     * @param Frequencia the Frequencia to set
     */
    public void setFrequencia(String Frequencia) {
        this.Frequencia = Frequencia;
    }

    /**
     * @return the FrequenciaCardio
     */
    public String getFrequenciaCardio() {
        return FrequenciaCardio;
    }

    /**
     * @param FrequenciaCardio the FrequenciaCardio to set
     */
    public void setFrequenciaCardio(String FrequenciaCardio) {
        this.FrequenciaCardio = FrequenciaCardio;
    }

    /**
     * @return the Temperatura
     */
    public String getTemperatura() {
        return Temperatura;
    }

    /**
     * @param Temperatura the Temperatura to set
     */
    public void setTemperatura(String Temperatura) {
        this.Temperatura = Temperatura;
    }

    /**
     * @return the Saturacao
     */
    public String getSaturacao() {
        return Saturacao;
    }

    /**
     * @param Saturacao the Saturacao to set
     */
    public void setSaturacao(String Saturacao) {
        this.Saturacao = Saturacao;
    }

    /**
     * @return the HemoGT
     */
    public String getHemoGT() {
        return HemoGT;
    }

    /**
     * @param HemoGT the HemoGT to set
     */
    public void setHemoGT(String HemoGT) {
        this.HemoGT = HemoGT;
    }

    /**
     * @return the Pia
     */
    public String getPia() {
        return Pia;
    }

    /**
     * @param Pia the Pia to set
     */
    public void setPia(String Pia) {
        this.Pia = Pia;
    }

    /**
     * @return the Pvc
     */
    public String getPvc() {
        return Pvc;
    }

    /**
     * @param Pvc the Pvc to set
     */
    public void setPvc(String Pvc) {
        this.Pvc = Pvc;
    }

    /**
     * @return the Id_Hemodinamica
     */
    public Long getId_Hemodinamica() {
        return Id_Hemodinamica;
    }

    /**
     * @param Id_Hemodinamica the Id_Hemodinamica to set
     */
    public void setId_Hemodinamica(Long Id_Hemodinamica) {
        this.Id_Hemodinamica = Id_Hemodinamica;
    }
    
    
}
