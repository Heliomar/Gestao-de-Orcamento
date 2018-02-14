package com.algaworks.comercial.Hibernate;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import org.hibernate.cfg.*;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;


/**
 
 * @author Helio
 */
public class HibernateUtil implements Serializable {

    private static final SessionFactory sessionFactory = buildSessionFactory();
     private static final long serialVersionUID = 1L;
     
     @PostConstruct
     public void Init(){
     System.out.println("Hibernte inicializando...!");
     }
     
     public HibernateUtil(){
     }
private static SessionFactory buildSessionFactory(){

   
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
          SessionFactory  sessionFactory = configuration.buildSessionFactory(serviceRegistry);//.openSession().getSessionFactory();
            
            return sessionFactory;            
        } catch (Throwable ex) {
            System.err.println("Criação inicial da SessionFactory falhou. Erro: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){
           return sessionFactory;
    }
}
