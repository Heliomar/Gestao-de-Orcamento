/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dao;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Helio
 */

@Entity
@Table(name="login")
public class Login implements Serializable {
    
    
    public Login(){
     }
    
    
    public Login(Long Id_Login, String nome, String Senha){
        this.Id_Login = Id_Login;
        this.nome = nome;
        this.Senha = Senha;        
        System.out.println("Inicializando Objetos da classe de Login...!");
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
