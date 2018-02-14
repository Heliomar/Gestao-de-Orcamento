package com.algaworks.comercial.controller;

import com.algaworks.comercial.Hibernate.HibernateUtil;
import com.algaworks.comercial.model.Dao.Login;
import com.algaworks.comercial.model.Dao.Usuario;
import com.algaworks.comercial.service.GestaoUsuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
//import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.hibernate.SessionFactory;
//import javax.inject.Named;

/**
 *
 * @author Helio
 */
@Named
@ViewScoped
//@SessionScoped
public class GestaoDeUsuarioBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private GestaoUsuario gestaoUsuario;

    private Usuario usuario;
    private Login login;

    public GestaoDeUsuarioBean() {
        usuario = new Usuario();
        login = new Login();
        System.out.println("inicializando classe Usuario e Login Bean...!");
    }

    @PostConstruct
    public void Init() {
        this.gestaoUsuario = gestaoUsuario;
        System.out.println("inicialização Gestão de Usuario....!");
    }

    public void SalvarUsuario(Usuario usuario) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        sessionFactory.openSession().beginTransaction();
        try {
            if (usuario != null) {
                gestaoUsuario.salvar(usuario);
            }

            FacesMessage msg = new FacesMessage("Usuarios salvo com sucesso....!");
            FacesContext.getCurrentInstance().addMessage("Usuario", msg);

        } catch (Exception ex) {

            System.out.println("Problemas na salvação..!" + ex);
        }
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {

        if (usuario == null) {
            usuario = new Usuario();
        }
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
