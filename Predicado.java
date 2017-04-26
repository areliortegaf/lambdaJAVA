/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author asortega
 */
public class Predicado {
    
    public static Predicate<tipo> metodoPredicado() {
        return p -> p.obtenerNombre().equalsIgnoreCase("1");//equals
    }
    
    public static List<tipo> filtro (List<tipo> lista, Predicate<tipo> predicado) {
        return lista.stream().filter( predicado ).collect(Collectors.<tipo>toList());
    }
    
    private static List<tipo> lista = Arrays.asList(
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
    
    
    public static void main(String ... args){
        
        System.out.println(filtro(lista, metodoPredicado()));
    }
}
