/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model;

import com.algaworks.comercial.model.Dao.DrogaTipo;
import com.algaworks.comercial.model.Dao.Drogas;
import com.algaworks.comercial.model.Dao.Ganho;
import com.algaworks.comercial.model.Dao.Perda;
import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author Helio
 */
public class BalancoGeral implements Serializable {
    
    
    final private ArrayList<Ganho> ganhos = new ArrayList<Ganho>();
    final private ArrayList<Perda> perdas =new ArrayList<Perda>();
    final private ArrayList<Drogas> drogas = new ArrayList<Drogas>();

    
   
    public void CadastrarGanhos(Ganho ganho){    
    ganhos.add(ganho);
    }
    
    public int numerosGanhos(){    
        return ganhos.size();               
    }
    
    public void ExcluirGanhos(Ganho ganho){
    
    ganhos.remove(ganho);
    }
    public ArrayList<Ganho> AdicionarGanho(Ganho ganho){
    
        ganho.setHemocomponente("hemocomponentes");
        ganho.setMedicação("medicacao");
        ganho.setSoro("soro");
        ganho.setMedicação("medicacao");
        
        ganhos.add(ganho);
        
        ganhos.clear();
       
        return ganhos;
    
    }
    public ArrayList<Perda> AdicionarPerdas(Perda perda){
    
        perda.setDiurese("diurese");
        perda.setDreno("dreno");
        perda.setHemodialise("hemodialise");
        perda.setSondaNaso("sondaNaso");
        
       perdas.add(perda);
       
       perdas.clear();
    
       return perdas;
    }
    public void ExcluirPerda(Perda perda){
    
    perdas.remove(perda);
    }
    
    public int numerosdePerdas(Perda perda){
     
        return perdas.size();
    }
    
    public void CadastrarPerda(Perda perda){
    
      perdas.add(perda);
      
      perdas.clear();
    }
    
    public ArrayList<Drogas> AdicionarDrogas(Drogas  droga){
    
       droga.setDrogas(DrogaTipo.Venosa);
       droga.setDescricao("descricao");
       droga.setVolume("volume");
       droga.setNomeDdroga("NomeDroga");
      
       drogas.add(droga);
       
       drogas.clear();
     
       return drogas;
    }
    public void ExcluirDrogas(Drogas droga){
    
        drogas.remove(droga);
        
        drogas.clear();
    
    }
    
    public int numerosDrogas(Drogas droga){
    
       return drogas.size();
    
    }
    public void CadastrarDroga(Drogas droga){
    
    drogas.add(droga);
    }
    
   
}
