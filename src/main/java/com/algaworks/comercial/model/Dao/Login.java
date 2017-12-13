/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dao;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Helio
 */

@Entity
@Table(name="login")
public class Login implements Serializable {
    
    public Login(){
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id_Login;
    
    
   
   
    @Column(name="nome")
    private String nome;
    
  
   
    @Column(name="senha")
    private String  Senha;

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
    public String getSenha() {
        return Senha;
    }

    /**
     * @param Senha the Senha to set
     */
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
}
