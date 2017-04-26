/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.Action;
import javax.swing.JButton;
import java.util.function.*;
/**
 *
 * @author asortega
 */
public class Lambda <Areli> {
    //creamos un boton
    JButton boton = new JButton("Boton");
    
    public void metodoPruebas(){
    //sin lambda
    boton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Sin Lambda");
    }
});
    //ActionListener con lambda
    boton.addActionListener((ActionEvent e) -> {
        System.out.println("Con Lambda");
    });
 
}
    
    public Lambda(){
        
    }
    
    
   //creamos inner class

    
    
    public class Gente <Personas>{
        public String primerNombre;
        public int id;
        public String apellidoPat;
        public int edad;
        
        public Gente(int pId, String pPrimerNombre, String pSegundoNombre, int pedad){
            
            this.id=pId;
            this.primerNombre=pPrimerNombre;
            this.apellidoPat=pSegundoNombre;
            this.edad=pedad;
        }
        
        public void obtenerPrimerNombre(String pnombre){
            primerNombre = pnombre;
        }
        public void obtenerSegundoNombre(int pid){
            id = pid;
        }
        public void obtenerApellidoPat(String pnombre){
            apellidoPat = pnombre;
        }
        public void obtenerApellidoMat(int pedad){
            edad = pedad;
        }
        
        public String mandarPrimerNombre(){
            return primerNombre;
        }
        
        
        //Gente tipoGente = new Gente(0,"","",0);
        //ArrayList<Gente> array1 = new ArrayList<>();
        
        //internet
        Gente[] array = new Gente[] { new Gente(0,"","",0), new Gente(1,"1","1",1), new Gente(2,"2","2",2) };
        ArrayList<Gente> arrayGenteList = new ArrayList<>(Arrays.asList(array));
        //
        
        

        public void leer(){
            //con esto creamos un filtro
            Predicate<Gente> lappl =(t) -> {
                t.mandarPrimerNombre();
                return true;
                
            };
            //aqui se usa el filto en el arrayList
            arrayGenteList.stream().filter(lappl);
        }

        
    }
    
    //
    
    public static void main(String args[]){
        
    }
    
    
    
    
}
