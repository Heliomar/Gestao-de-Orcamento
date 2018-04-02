package com.algaworks.comercial.model.Dao;

import java.io.Serializable;
import java.util.Date;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;



/**
 *
 * @author Helio
 */

@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
    
    
     private static final long serialVersionUID = 1L;
     
     
   public Usuario(){
   } 
   
    @Id
    @Column(name="Id_Usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
   
    
    @Column(name="nomePaciente")
    private String NomePaciente;
    
    @NotNull
    @Column(name="atendimento",nullable = false)
    private String Atendimento;
    
   
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data")
    private Date data;
    
    @NotNull
    @Column(name="nomeMedico", nullable = false)
    private String NomeMedico;
    
   
    @Column(name="leito")
    private Integer Leito;

    /**
     * @return the NomePaciente
     */
    public String getNomePaciente() {
        return NomePaciente;
    }

    /**
     * @param NomePaciente the NomePaciente to set
     */
    public void setNomePaciente(String NomePaciente) {
        this.NomePaciente = NomePaciente;
    }

    /**
     * @return the Atendimento
     */
    public String getAtendimento() {
        return Atendimento;
    }

    /**
     * @param Atendimento the Atendimento to set
     */
    public void setAtendimento(String Atendimento) {
        this.Atendimento = Atendimento;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the NomeMedico
     */
    public String getNomeMedico() {
        return NomeMedico;
    }

    /**
     * @param NomeMedico the NomeMedico to set
     */
    public void setNomeMedico(String NomeMedico) {
        this.NomeMedico = NomeMedico;
    }

    /**
     * @return the Leito
     */
    public Integer getLeito() {
        return Leito;
    }

    /**
     * @param Leito the Leito to set
     */
    public void setLeito(Integer Leito) {
        this.Leito = Leito;
    }

    /**
     * @return the iid_usuario
     */
    public Integer getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the iid_usuario to set
     */
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_usuario == null) ? 0 : id_usuario.hashCode());
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
		Usuario other = (Usuario) obj;
		if (id_usuario == null) {
			if (other.id_usuario != null)
				return false;
		} else if (!id_usuario.equals(other.id_usuario))
			return false;
		return true;
	}

}
