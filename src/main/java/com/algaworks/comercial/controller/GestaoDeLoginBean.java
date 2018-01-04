package com.algaworks.comercial.controller;

import com.algaworks.comercial.model.Dao.Login;
import com.algaworks.comercial.service.GestaoLogin;
import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Helio
 */

@Named
//@SessionScoped
@ViewScoped
public class GestaoDeLoginBean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
   @Inject
   private GestaoLogin gestaoLogin;
   
   
   private Login login;
   
   
   public GestaoDeLoginBean(){
       login = new Login();
      
   }
    
    
   public void SalvarLogin(Login login)
    {
        try{
            if(login != null)
        gestaoLogin.salvarLogin(login);
        
        System.out.println(" Salvando com sucesso...!");
        }catch(Exception ex){
        
            System.out.println(" Não consegue Salvar nullo...!"+ex);
            
        }finally{
        
         
        }
    }
   
  public Login ConfereLogin(Login login)
  {
       return login;
  } 
    
    
    public Login getLogin(){
    
        if(login == null)
            login = new Login();
        return login;
    }
    public void mostraLogado(Login login){
    
    }
    
    
}
