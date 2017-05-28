/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dao;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.NotEmpty;



/**
 *
 * @author Helio
 */

@ViewScoped
@ManagedBean
public class Usuario implements Serializable{
    
    
    public Usuario(String NomePaciente,String Atendimento,Date data, String NomeMedico, int Leito){
        
       String nomePaciente = this.NomePaciente;
       String atendimento = this.Atendimento;
       Date Dia = this.data;
       String nomeMedico =this.NomeMedico;
    
    
    }
    
    @NotEmpty
    @Column(name="NomePaciente")
    private String NomePaciente;
    
     @NotEmpty
    @Column(name="Atendimento")
    private String Atendimento;
    
     
    @Temporal(TemporalType.DATE)
    @Column(name = "data")
    private Date data;
    
    @Column(name="NomeMedico")
    private String NomeMedico;
    
    
    @Column(name="Leito")
    private int Leito;

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
    public int getLeito() {
        return Leito;
    }

    /**
     * @param Leito the Leito to set
     */
    public void setLeito(int Leito) {
        this.Leito = Leito;
    }
    
}
