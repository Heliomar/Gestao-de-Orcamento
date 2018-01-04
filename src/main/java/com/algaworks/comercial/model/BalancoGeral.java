/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model;


import com.algaworks.comercial.model.Dao.Drogas;
import com.algaworks.comercial.model.Dao.Ganho;
import com.algaworks.comercial.model.Dao.Login;
import com.algaworks.comercial.model.Dao.Perda;
import com.algaworks.comercial.relatorio.Relatorios;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Helio
 */
public class BalancoGeral implements Serializable {
    
    public BalancoGeral(){
    }
    
     private ArrayList<Ganho> ganhos = new ArrayList<Ganho>();
     private ArrayList<Perda> perdas = new ArrayList<Perda>();
     private ArrayList<Drogas> drogas = new ArrayList<Drogas>();
   
    
   
    public void CadastrarGanhos(Ganho ganho){    
    ganhos.add(ganho);
    }
    
    public ArrayList<Perda> AdicionarPerdas(Perda perda){
   
        perdas.add(perda);
       
        return perdas;
    }
    
   
}
