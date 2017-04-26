/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import patrones.tipo;
/**
 *
 * @author asortega
 */
public class Lambda2 {
    
    ///uso la clase tipo como si fuera de usuarios por que quiero.
    private static List<tipo> usuarios = Arrays.asList(
      new tipo("1", "Steve", "Vai"),
      new tipo("4", "Joe", "Smith"),
      new tipo("3", "Steve", "Johnson"),
      new tipo("9", "Mike", "Stevens"),
      new tipo("10", "George", "Armstrong"),
      new tipo("2", "Jim", "Smith"),
      new tipo("8", "Chuck", "Schneider"),
      new tipo("5", "Jorje", "Gonzales"),
      new tipo("6", "Jane", "Michaels"),
      new tipo("7", "Kim", "Berlie")
    );
    public Lambda2(){
        newJavaWay();
    }
    
   public void newJavaWay() {
    List<tipo> filtro = usuarios.stream().filter(u -> u.obtenerNombre().equals("1")).collect(Collectors.toList());
    
    
    System.out.println(filtro.toString());//SUPER LOL
   
  }
    
    public static void main(String ... args){
        new Lambda2();
    }
}
