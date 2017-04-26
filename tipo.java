/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 *
 * @author asortega
 */
public class tipo {
    
    public String nombre;
    public String descripcion;
    public String comportamiento;
    
    
    
    public tipo(String nom,String desc,String comp){
        this.nombre=nom;
        this.descripcion = desc;
        this.comportamiento=comp;
    }
    
    public void cambiarNombre(String pNombre){
        this.nombre = pNombre;
    }
            
    public void cambiarDescripcion(String pDescripcion){
        this.descripcion = pDescripcion;
    }
            
    public void cambiarComportamiento(String pComportamiento){
        this.comportamiento = pComportamiento;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerDescripcion(){
        return descripcion;
    }
    public String obtenerComportamiento(){
        return comportamiento;
    }
    
    
}
