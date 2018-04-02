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
//import org.hibernate.annotations.Table;

/**
 *
 * @author Helio
 */
@Entity
@Table(name = "login")
public class Login implements Serializable {

    private static final long serialVersionUID = 1L;


    public Login() {
    }
    
    
    public Login(Long Id_Login, String nome, String Senha){
        this.Id_Login = Id_Login;
        this.nome = nome;
        this.senha = senha;
        
    }
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_login")
    private Long Id_Login;
    
    @Column(name="nome" , nullable = false)
    private String nome;
    
    @NotNull
    @Column(name = "senha", nullable = false)
    private String senha;
    

    public String getNome() {

        return nome;
    }

    
    
     public Long getId_Login() {
        return Id_Login;
    }
     
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
    
        @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id_Login == null) ? 0 : Id_Login.hashCode());
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
		Login other = (Login) obj;
		if (Id_Login == null) {
			if (other.Id_Login != null)
				return false;
		} else if (!Id_Login.equals(other.Id_Login))
			return false;
		return true;
	}

    


}
