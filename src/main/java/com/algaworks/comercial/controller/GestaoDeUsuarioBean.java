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
public class GestaoDeUsuarioBean implements Serializable {
    
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private GestaoUsuario gestaoUsuario;
    
    private Usuario usuario = new Usuario();
    
    
    public Usuario getUsuario()
    {
    
       return usuario;
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
    
    public void SalvarUsuario()
    {
    
    usuario.getAtendimento();
    usuario.getData();
    usuario.getLeito();
    usuario.getNomeMedico();
    usuario.getNomePaciente();
    
    gestaoUsuario.salvar(usuario);
    
    usuario = new Usuario();
    FacesMessage msg = new FacesMessage("Usuarios salvos com sucesso!");
		FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    
}
