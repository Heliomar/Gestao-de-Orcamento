/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.comercial.model.Dto;

import com.algaworks.comercial.model.Dao.Ganho;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.text.Text;
import javax.swing.JOptionPane;


/**
 *
 * @author Helioarrays em java 
 */
public class TiposGanhos {
    
    private ArrayList<Ganho> ganhar = new ArrayList<Ganho>();

 
    
    public void SelecionarGanho(ArrayList<Ganho> ganhar){
        
                  
     try{
     
         for(Iterator <Ganho> iterator = ganhar.iterator(); iterator.hasNext();){
          
            
            
            Ganho soro = iterator.next();
            Ganho medicacao = iterator.next();
            Ganho volume = iterator.next();
            Ganho hemocomponente = iterator.next();
            
            hemocomponente.getHemocomponente();
            volume.getVolume();
            medicacao.getMedicação();
            soro.getSoro();
            
            System.out.println("selecionado para exibição n% :\n"+ganhar.iterator());
          //ganhar.get() = (Ganho) Iterator.next();
          
          //JOptionPane.showMessageDialog(null,"",+ganhar.getVolume()+);
           
         // ganhar.getMedicação();
         // ganhar.getSoro();
         // ganhar.getVolume();
         
         }
     }
     catch(Exception ex){
     
       
     }
    
    }
    
    public void MostrarArray(ArrayList<Ganho> ganhar){
           ganhar.addAll(ganhar);
           
           System.out.println(" informe suas informações\n"+ganhar);
    }
    
}
