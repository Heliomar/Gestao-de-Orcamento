package com.algaworks.comercial.repository;

import com.algaworks.comercial.model.Dao.Usuario;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Helio
 */

public class UsuarioRepository implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    public Usuario guardarUsuario(Usuario usuario) {
      
         manager.persist(usuario);
         
        return usuario;
    }

}
