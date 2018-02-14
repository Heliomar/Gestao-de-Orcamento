package com.algaworks.comercial.controller;

import com.algaworks.comercial.Hibernate.HibernateUtil;
import com.algaworks.comercial.model.Dao.Login;
import com.algaworks.comercial.service.GestaoLogin;
import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import org.hibernate.Session;
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
   

  private Login login;
   
 
   public GestaoDeLoginBean(){
       this.gestaoLogin = gestaoLogin;
   }
    
    @Transactional
   public void SalvarLogin(Login login)
    {
     Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.getSessionFactory();
            session.persist(login);//if(login != null)
            getGestaoLogin().salvarLogin(login);
        
        System.out.println(" Salvando com sucesso...!");
        
      
        }catch(Exception ex){
        
            System.out.println(" Não consegue Salvar nullo...!"+ex);
            
        }finally{
        
         
        }
    }
   
     
    public Login getLogin(){
    
        return login;
    }

    /**
     * @return the gestaoLogin
     */
    public GestaoLogin getGestaoLogin() {
        return gestaoLogin;
    }
      
}
