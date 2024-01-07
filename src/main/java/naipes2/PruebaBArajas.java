/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naipes2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author tomas
 */
public class PruebaBArajas {

    public static void main(String[] args) {
        Barajas b1 = new Barajas();
        System.out.println("\n**********Muestro la baraja completa**********\n");
        System.out.println(b1);

//        // Prueba barajar Naipes
//        System.out.println("\n**********Se barajan los naipoes**********\n");
//        b1.barajar(1);
//        System.out.println(b1);


        // Prueba sacar cartas
//        System.out.println("\n**********Se sacan naipes de la baraja v1**********\n");
//        b1.sacar(5);
//        System.out.println(b1);
        
        
        System.out.println("\n**********Se sacan naipes de la baraja v2**********\n");
        ArrayList<Naipe> nuevaListaDeNaipes = b1.sacar2(1);
        System.out.println(nuevaListaDeNaipes.toString());
        System.out.println(nuevaListaDeNaipes.size());
        
    }
}
