package com.algaworks.comercial.service;

import com.algaworks.comercial.model.Dao.Login;
import com.algaworks.comercial.repository.LoginRepositary;
import com.algaworks.comercial.util.Transacional;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
//import javax.enterprise.context.Initialized.*;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Helio
 */
public class GestaoLogin implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private LoginRepositary logado;

    @Inject
    private Login login;

    public GestaoLogin() {
    }

    @PostConstruct
    public void Init() {

    }

    @Transacional
    public void salvarLogin(Login login) {

        try {
            if (login != null) {
                logado.guardarLogin(login);
            }

            FacesMessage fm = new FacesMessage("Logado com Sucesso..!");
            FacesContext.getCurrentInstance().addMessage("Login", fm);
            System.out.println(" transação realizada com o acesso a login....!");

        } catch (Exception ex) {

            System.out.println("  Erro de acesso a login....!" + ex);

        } finally {

        }

    }

    /**
     * @return the logado
     */
    public LoginRepositary getLogado() {
        return logado;
    }

    /**
     * @param logado the logado to set
     */
    public void setLogado(LoginRepositary logado) {
        this.logado = logado;
    }

    /**
     * @return the login
     */
    public Login getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(Login login) {
        this.login = login;
    }

}
