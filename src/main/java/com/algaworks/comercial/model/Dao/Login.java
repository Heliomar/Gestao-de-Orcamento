package com.algaworks.comercial.model.Dao;
import java.io.Serializable;
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
    
    
     private static final long serialVersionUID = 1L;
     
     
    public Login(){
     }
    
    
    public Login( String nome, String Senha){
        this.nome = nome;
        this.senha = Senha;        
        System.out.println("Inicializando Objetos da classe de Login...!");
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_Login;
    
    
    
   
    @Column(name="nome" , nullable = false)
    private String nome;
    
  
   
    @Column(name="senha" , nullable = false)
    private String  senha;

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
     * @return the Id_Login
     */
    public Long getId_Login() {
        return Id_Login;
    }

    /**
     * @param Id_Login the Id_Login to set
     */
    public void setId_Login(Long Id_Login) {
        this.Id_Login = Id_Login;
    }

    /**
     * @return the nome
     */
   
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

}