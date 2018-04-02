package com.algaworks.comercial.controller;

//import com.algaworks.comercial.Hibernate.HibernateUtil;
import com.algaworks.comercial.Hibernate.HibernateUtil;
import com.algaworks.comercial.model.Dao.Login;
import com.algaworks.comercial.service.GestaoLogin;
import java.io.Serializable;
import javax.annotation.PostConstruct;
//import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.jboss.weld.bean.ManagedBean;
//import javax.transaction.Transactional;
//import org.hibernate.Session;
//import javax.transaction.Transaction;

/**
 *
 * @author Helio
 */


@ViewScoped
@Named
public class GestaoDeLoginBean implements Serializable{

    private static final long serialVersionUID = 1L;

    @Inject
    private GestaoLogin gestaoLogin;

     @Inject
    private FacesContext facesContext;      

    @Inject
    private EntityManager manager;
    
    
    private Login login = new Login();
    
   public GestaoDeLoginBean(){
       this.gestaoLogin = gestaoLogin;
    }

   // @Transactional
   public void SalvarLogin(Login login)
    {
        SessionFactory session = HibernateUtil.getSessionFactory();
        session.openSession().beginTransaction().isActive();
        
        gestaoLogin.salvarLogin(login);
            
    }
             
            
//        System.out.println(" Salvando com sucesso...!");

           
            //sessionFactory.openSession().close();

    /**
     * @return the gestaoLogin
     */
    public GestaoLogin getGestaoLogin() {
        return gestaoLogin;
    }

    /**
     * @param gestaoLogin the gestaoLogin to set
     */
    public void setGestaoLogin(GestaoLogin gestaoLogin) {
        this.gestaoLogin = gestaoLogin;
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
