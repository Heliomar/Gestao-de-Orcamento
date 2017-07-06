/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dao;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Helio
 */
public class Paciente implements Serializable{
    
    
    private String leito;
    private String NomePaciente;
    private Date data;
    private String medico;
    private int atendimento;

    /**
     * @return the leito
     */
    public String getLeito() {
        return leito;
    }

    /**
     * @param leito the leito to set
     */
    public void setLeito(String leito) {
        this.leito = leito;
    }

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
     * @return the medico
     */
    public String getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(String medico) {
        this.medico = medico;
    }

    /**
     * @return the atendimento
     */
    public int getAtendimento() {
        return atendimento;
    }

    /**
     * @param atendimento the atendimento to set
     */
    public void setAtendimento(int atendimento) {
        this.atendimento = atendimento;
    }
    
}
