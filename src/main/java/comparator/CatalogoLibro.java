/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparator;

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
    }
    
}
