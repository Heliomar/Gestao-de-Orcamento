/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dao;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Helio
 */
@Named
@ManagedBean
@ViewScoped
@Entity
@Table(name="Login")
public class Login {
    
    
    @NotEmpty
    @Column(name="nome")
    private String nome;
    
    @NotEmpty
    @Column(name="Senha")
    private Long  Senha;

    /**
     * @return the Id_login
     */
    

   

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the Senha
     */
    public Long getSenha() {
        return Senha;
    }

    /**
     * @param Senha the Senha to set
     */
    public void setSenha(Long Senha) {
        this.Senha = Senha;
    }
    
}
