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

    @Inject
    public GestaoDeUsuarioBean() {
        this.gestaoUsuario = gestaoUsuario;
       }

    @PostConstruct
    public void Init() {
     }

    public void SalvarUsuario(Usuario usuario) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
          if(!sessionFactory.openSession().beginTransaction().isActive())
              
                sessionFactory.openSession().beginTransaction().begin();
        try {
            
            if (usuario != null) {
                sessionFactory.openSession().save(usuario);
                this.gestaoUsuario.salvar(usuario);
                //sessionFactory.unwrap(usuario.getClass());
                sessionFactory.openSession().close();
                //sessionFactory.openSession().flush();
                System.out.println("Usuario salvo com Sucesso....!");
            }

            FacesMessage msg = new FacesMessage("Usuarios salvo com sucesso....!");
            FacesContext.getCurrentInstance().addMessage("Hemodinamica", msg);
        
        } catch (Exception ex) {
        
            System.out.println("Problemas na salvação..!" + ex);
        }finally{
        
           
         System.out.println(" finalizando Sessâo com usuario....!");
        }
     
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {

        if (usuario == null) 
            usuario = new Usuario();
        
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
