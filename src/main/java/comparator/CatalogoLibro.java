/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author tomas
 */
public class CatalogoLibro {
    public static void main(String[] args) {
        Libro l1 = new Libro("123", "Aiman feliz", "Aiman", "aa", 123);
        Libro l2 = new Libro(l1);
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("¿Son iguales? " +  l1.equals(l2));
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        
        Libro l3 = new Libro("arvnuirv7", "VicoVico", "Vico", "bbbb", 20);
        ArrayList<Libro> lista = new ArrayList<>();
        lista.add(new Libro("1234", "titulo", "autor", "editorial", 10));
        lista.add(new Libro("321", "titulo2", "autor2", "editorial2", 546));
        lista.add(new Libro("023", "titulo3", "autor3", "editorial3", 01));
        System.out.println("\n*****************LISTA ORDENADA*****************\n");
        lista.forEach(System.out::println);
        
        // ordenar por isbn
        //Comparator<Libro>
                
        Collections.sort(lista, (e1,e2)->e1.getIsbn().compareToIgnoreCase(e2.getIsbn()));
        System.out.println("\n*****************LISTA ORDENADA*****************\n");
        lista.forEach(System.out::println);
        
        // por numero de pagina
        System.out.println("\n*****************LISTA ORDENADA POR NUMPAGINAS*****************\n");
        Collections.sort(lista, (k1,k2)->Integer.compare(k1.getNumPaginas(), k2.getNumPaginas()));
        lista.forEach(System.out::println);
        //
        
        
    }
    
}


