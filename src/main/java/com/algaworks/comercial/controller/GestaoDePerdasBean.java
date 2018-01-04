package com.algaworks.comercial.controller;

import com.algaworks.comercial.model.Dao.Perda;

import com.algaworks.comercial.service.GestaoPerdas;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Helio
 */


@Named
@ViewScoped
public class GestaoDePerdasBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    
    @Inject
    private GestaoPerdas gestaoPerdas;
    
    public GestaoDePerdasBean(){
    this.perda= new Perda();
   // System.out.println("Inicializando variaveis de Perdas......!");
    }
    
    @PostConstruct
    public void Init(){
   
    }
     private Perda perda;
     

    public void AdicionarPerda()
    {
         perda.getDiurese();
    
    }
    public void salvarPerda(Perda perda)
    {
     if (perda != null){
       gestaoPerdas.salvar(perda);
                       
            FacesMessage msg = new FacesMessage("As Perdas salva com sucesso!");
	    FacesContext.getCurrentInstance().addMessage("Perdas", msg);
      }else{
          
          
            FacesMessage msg = new FacesMessage("As Perdas com Problemas em Salar.........!");
	    FacesContext.getCurrentInstance().addMessage("Perdas", msg);
     }

    }
     public  Perda getPerda()
     {
         if(perda == null)
             perda = new Perda();
        return perda;
     }
}
