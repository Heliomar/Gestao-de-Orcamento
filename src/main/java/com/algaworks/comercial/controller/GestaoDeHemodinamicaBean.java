
package com.algaworks.comercial.controller;

import com.algaworks.comercial.model.Dao.Hemodinamica;
import com.algaworks.comercial.service.GestaoHemodinamicas;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Helio
 */

@Named
//@ViewScoped
@SessionScoped
public class GestaoDeHemodinamicaBean implements Serializable{
    
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private GestaoHemodinamicas gestaoHemodinamica;

    private Hemodinamica hemodinamica;
    
    public GestaoDeHemodinamicaBean(){
    
        hemodinamica = new Hemodinamica();
        System.out.println("inicializando classe Hemodinamica Bean...!");
    }
    
    @PostConstruct
    public void Init(){
    System.out.println(" Inicializando....Gestao de Hemodinamica...!");
    }
    
   public void salvarHemodinamica(Hemodinamica hemodinamica)
   {
       try{   
           
           if(hemodinamica != null)
       gestaoHemodinamica.salvar(hemodinamica);
           FacesMessage msg = new FacesMessage("Hemodinamica salvas com sucesso....!");
		FacesContext.getCurrentInstance().addMessage("Hemodinamica", msg);
                
       }catch(Exception ex){
       
           System.out.println(" nao salvou comm certeza.."+ex);
       }       
           
   }
   
   public Hemodinamica getHemodinamica()
   {
       if(hemodinamica == null)
           
       hemodinamica = new Hemodinamica();
       
       return hemodinamica;
   }
   
    
}