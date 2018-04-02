package com.algaworks.comercial.controller;

import com.algaworks.comercial.Hibernate.HibernateUtil;
import com.algaworks.comercial.model.Dao.Hemodinamica;
import com.algaworks.comercial.service.GestaoHemodinamicas;
import com.algaworks.comercial.util.Transacional;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Helio
 */
@Named
//@ViewScoped
@ManagedBean
@SessionScoped
public class GestaoDeHemodinamicaBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    private Hemodinamica hemodinamica;

    @Inject
    private FacesContext facesContext;

    @Inject
    private HttpServletResponse response;

    @Inject
    private EntityManager manager;

    @Inject
    private GestaoHemodinamicas gestaoHemodinamica;

    
    public GestaoDeHemodinamicaBean() {
       hemodinamica = new Hemodinamica();
      
    }

   
     
    public void salvarHemodinamica(Hemodinamica hemodinamica) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try {
            
            if (hemodinamica != null) {
               sessionFactory.openSession().save(hemodinamica);
                this.gestaoHemodinamica.salvar(hemodinamica);
                //sessionFactory.unwrap(usuario.getClass());
                //sessionFactory.close();
                sessionFactory.openSession().close();
                gestaoHemodinamica.salvar(hemodinamica);

                FacesMessage msg = new FacesMessage("Hemodinamica salvas com sucesso....!");
                FacesContext.getCurrentInstance().addMessage("Hemodinamica", msg);

            } else {

                System.out.println("hemodinamica nulas...!");
            }

        } catch (Exception ex) {

            System.out.println(" nao salvou comm certeza.." + ex);
        }finally{
            
             System.out.println(" fechando conexao comm certeza..");
           
        
        }

    }

    @SuppressWarnings("InfiniteRecursion")
   public Hemodinamica getHemodinamica(){
         if(hemodinamica == null)
            hemodinamica = new Hemodinamica();
       return hemodinamica;
   }

}
