/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dao;
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
@Entity
@Table(name="Login")
public class Login {
    
    @NotEmpty
    @Column(name="id_login")
    private int Id_login;
    
    @NotEmpty
    @Column(name="nome")
    private String nomeLogado;
    
    @NotEmpty
    @Column(name="Senha")
    private Long  Senha;

    /**
     * @return the Id_login
     */
    public int getId_login() {
        return Id_login;
    }

    /**
     * @param Id_login the Id_login to set
     */
    public void setId_login(int Id_login) {
        this.Id_login = Id_login;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nomeLogado;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nomeLogado = nome;
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
