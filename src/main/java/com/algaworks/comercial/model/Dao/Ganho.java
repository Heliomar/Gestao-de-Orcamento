package com.algaworks.comercial.model.Dao;

import com.algaworks.comercial.model.Dto.TiposGanhos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Helio
 */

@Entity
@Table(name ="ganho")
public class Ganho implements Serializable{
      
    
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_ganho",nullable=false)
    private Long id;
    
    @NotEmpty
    @Column(name="soro",nullable=false)
    private String Soro;
    
    
    @Column(name="volume")
    private String Volume;
    
    @NotEmpty
    @Column(name="medicacao", nullable=false)
    private String Medicacao;
    
    @NotEmpty
    @Column(name="descricao", nullable=false)
    private String Descricao;
    
    @NotEmpty
    @Column(name="hemocomponente", nullable=false)
    private String Hemocomponente;
    
    @OneToMany(mappedBy = "ganho", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TiposGanhos> itens = new ArrayList<>();
   
   
   
    /**
     * @return the Soro
     */
  
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
     * @return the MedicaÃ§Ã£o
     */
    public String getMedicao() {
        return getMedicacao();
    }

    /**
     * @param Medicacao the MedicaÃ§Ã£o to set
     */
    public void setMedicao(String Medicacao) {
        this.setMedicacao(Medicacao);
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

    /**
     * @return the Itens
     */
    public List<TiposGanhos> getItens() {
        return itens;
    }

    /**
     * @param Itens the Itens to set
     */
    public void setItens(List<TiposGanhos> Itens) {
        this.itens = Itens;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    /**
     * @return the Id_Ganho
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the Id_Ganho to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the Medicacao
     */
    public String getMedicacao() {
        return Medicacao;
    }

    /**
     * @param Medicacao the Medicacao to set
     */
    public void setMedicacao(String Medicacao) {
        this.Medicacao = Medicacao;
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Ganho other = (Ganho) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

    
}
