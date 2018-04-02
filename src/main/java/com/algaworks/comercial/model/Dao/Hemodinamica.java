package com.algaworks.comercial.model.Dao;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "hemodinamica")
public class Hemodinamica implements Serializable{

    private static final long serialVersionUID = 1L;

    public Hemodinamica() {
    }

 
    public Hemodinamica(String PressaoA,String PressaoAMedia,String FrequenciaRespir,String FrequenciaCardio,String Temperatura,
            String Saturacao,String HemoGT,String Pia,String Pvc) { 
        this.PressaoA = PressaoA;
        this.PressaoAMedia = PressaoAMedia;
        this.FrequenciaRespir = FrequenciaRespir;
        this.FrequenciaCardio = FrequenciaCardio;
        this.Temperatura = Temperatura;
        this.Saturacao = Saturacao;
        this.HemoGT =HemoGT;
        this.Pia = Pia;
        this.Pvc = Pvc;
    }
    
    private Long Id_Hemodinamica;
    private String PressaoA;
    private String PressaoAMedia;
    private String FrequenciaRespir;
    private String FrequenciaCardio;
    private String Temperatura;
    private String Saturacao;
    private String HemoGT;
    private String Pia;
    private String Pvc;

    /**
     * @return the Id_Hemodinamica
     */
    @Id
    @Column(name = "Id_Hemodinamica")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId_Hemodinamica() {
        return Id_Hemodinamica;
    }

    /**
     * @param Id_Hemodinamica the Id_Hemodinamica to set
     */
    public void setId_Hemodinamica(Long Id_Hemodinamica) {
        this.Id_Hemodinamica = Id_Hemodinamica;
    }

    /**
     * @return the PressaoA
     */
    @NotNull
    @Column(name = "pressaoA", nullable = false)
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
    @NotNull
    @Column(name = "PressaoAM", nullable= false)
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
     * @return the FrequenciaRespir
     */
     @NotNull
    @Column(name = "frequenciaRespir", nullable = false)
    public String getFrequenciaRespir() {
        return FrequenciaRespir;
    }

    /**
     * @param FrequenciaRespir the FrequenciaRespir to set
     */
    public void setFrequenciaRespir(String FrequenciaRespir) {
        this.FrequenciaRespir = FrequenciaRespir;
    }

    /**
     * @return the FrequenciaCardio
     */
     @NotNull
    @Column(name = "frequenciaCardio", nullable = false)
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
     @NotNull
    @Column(name = "temperatura", nullable = false)
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
     @NotNull
    @Column(name = "saturacao" ,nullable = false)
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
    @NotNull
    @Column(name = "hemoGt" , nullable = false)
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
    @NotNull
    @Column(name = "pia", nullable = false)
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
    
    @NotNull
    @Column(name = "pvc", nullable = false)
    public String getPvc() {
        return Pvc;
    }

    /**
     * @param Pvc the Pvc to set
     */
    public void setPvc(String Pvc) {
        this.Pvc = Pvc;
    }
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id_Hemodinamica == null) ? 0 : Id_Hemodinamica.hashCode());
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
		Hemodinamica other = (Hemodinamica) obj;
		if (Id_Hemodinamica == null) {
			if (other.Id_Hemodinamica != null)
				return false;
		} else if (!Id_Hemodinamica.equals(other.Id_Hemodinamica))
			return false;
		return true;
	}

}
