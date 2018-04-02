package com.algaworks.comercial.controller;


import com.algaworks.comercial.Hibernate.HibernateUtil;
import com.algaworks.comercial.model.Dao.Ganho;
import com.algaworks.comercial.model.Dto.TiposGanhos;
import com.algaworks.comercial.service.GestaoGanhos;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.hibernate.SessionFactory;


@ViewScoped
@Named
public class GestaoDeGanhosBean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private GestaoGanhos gestaoGanhos;    

    private Ganho ganho;// = new Ganho();
    private TiposGanhos item;
    
    @PostConstruct
    public void Init(){
    }
    
    public  GestaoDeGanhosBean(){
    ganho = new Ganho();
    }
    
    public void salvaGanhos(Ganho ganho)
    {
      
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        if(!sessionFactory.openSession().beginTransaction().isActive())
            sessionFactory.openSession().beginTransaction().begin();
        try{
            if(ganho != null)
            
            sessionFactory.openSession().save(ganho);
            sessionFactory.openSession().persist(ganho);
            
            
                
        gestaoGanhos.SalvarGanhos(ganho);
//  
        
        FacesMessage msg = new FacesMessage("Gestão de  Ganhos Salvo com sucesso!");
        FacesContext.getCurrentInstance().addMessage("Ganho", msg);
        
        }catch(Exception ex ){
        
        System.out.println("Sistema ganhos error"+ex);
        }
    }

    public void novoGanho()
    {
       item = new TiposGanhos();
       
        item.getDescricao();
        item.getTipo();
        item.getVolume();
    
        item = new TiposGanhos();
        
        }
    
    public void adicionarGanhos(){
    
    ganho.getItens().add(item);
    item.setGanho(ganho);
    
    }
   
    public Ganho getGanho() {
        if(ganho == null){
        ganho = new Ganho();
        }
        return ganho;
    }
  
    public TiposGanhos getItem() {
        if(item == null)
            item = item;
        return item;
    }

    
 
    
}
