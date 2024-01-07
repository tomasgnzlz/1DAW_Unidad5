/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasDatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author tomas
 */
public class ListasDinamicas {
    public static void main(String[] args) {
        // la lista tiene lenght 0 y no tiene elementos
        ArrayList<Integer> lista =new ArrayList<>();
        // Tamaño
        System.out.println("Tamaño: " + lista.size());
        // Muestro la lista
        System.out.println(lista);
        // Añadir elemento a la lista
        lista.add(12);
        
        System.out.println(lista);
        lista.add(14);
        lista.add(16);
        lista.add(18);
        System.out.println(lista);
        
        
        System.out.println("El elemento de la posición 3: " + lista.get(3));
        
        // Añade un elemento en una posicion indicada
        lista.add(2, 20);
        System.out.println(lista);
        // Cambiar un elemento de la lista
        lista.set(3, 7);
        System.out.println(lista);
//        
//        
//        if (lista.isEmpty()) {
//            System.out.println("La lista está vacia");
//        }else{
//            System.out.println("La lista no está vacia");
//        }
//        
//        
//        System.out.println("La lista contiene el elemento 100? " + lista.contains(100));
//        System.out.println("Posición donde está el elemento 7: " + lista.indexOf(7));
//        System.out.println("Borro el elemento: " +  lista.remove(0));
//        System.out.println(lista);
//        //lista.remove(Integer.valueOf(20));
//        lista.remove(lista.indexOf(20));
//        System.out.println(lista);
//        System.out.println("-----------------------------Formas de recorrer la lista----------------------------------------------------------------");
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.print(lista.get(i) + " ");
//        }
//        System.out.println("\n");
//        for (Integer integer : lista) {
//            System.out.println("Numero: " + integer);
//        }
//        System.out.println("\n");
//        
//        // Recorrido con iterador
//        Iterator<Integer> it = lista.iterator();
//        while (it.hasNext()) {
//            System.out.println("num: "+it.next());
//        }
//        System.out.println("-----------------------------------------------------------------------------------------------------------");
//        // Expresion lambda y api Stream
//        lista.forEach(e->System.out.println(e));    
//        
//        
        
        
        
    }
    
}
