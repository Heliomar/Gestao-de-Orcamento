/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.controller;


import com.algaworks.comercial.model.Dao.Usuario;
import com.algaworks.comercial.service.GestaoUsuario;
import java.io.Serializable;
import java.util.Date;
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
public class GestaoDeUsuarioBean implements Serializable {
    
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private GestaoUsuario gestaoUsuario;
    
    private Usuario usuario;
    
    public GestaoDeUsuarioBean(){
        usuario = new Usuario();
     }
    
    
    
    @PostConstruct
    public void Init(){
        
    System.out.println("inicialização Gestão de Usuario....!");
    }
    
    
    
    
    
    
    public void SelecionaUsuario(){

        
    }
    
    public void MostraUsuario(Usuario usuario)           
    
    {
        String nome = usuario.getNomePaciente();
        String atendimento = usuario.getAtendimento();
        Integer leito = usuario.getLeito();
        String medicoNome =usuario.getNomeMedico();
        Date data = usuario.getData();
        
        usuario.setNomeMedico(medicoNome);   
        usuario.setAtendimento(atendimento);
        usuario.setLeito(leito);
        usuario.setNomePaciente(nome);
        usuario.setData(data);
        
        
         
    
    }
    
    public void SalvarUsuario(Usuario usuario)
      {
     if(usuario == null){
         usuario = new Usuario();    
            gestaoUsuario.salvar(usuario);
    
      
    
       }else if (usuario != null){
         gestaoUsuario.salvar(usuario);
     
       }
      
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        
        if(usuario == null){        
         usuario = new Usuario();
        }
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    
    
}
