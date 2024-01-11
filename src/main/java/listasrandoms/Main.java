/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasrandoms;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tomas
 */
public class Main {

    public static void main(String[] args) {
        // Creo dos listas 
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();

        Random rd = new Random();
        RandomStringUtils random = new RandomStringUtils();
        int num = 0;
        num = rd.nextInt(10, 21);
        for (int i = 0; i < num; i++) {
            l1.add(random.randomAlphabetic(1).toUpperCase());
        }
        num = rd.nextInt(10, 21);
        for (int i = 0; i < num; i++) {
            l2.add(random.randomAlphabetic(1).toUpperCase());
        }

        System.out.println("*************** MUESTRO LA PRIMER LISTA ***************");
        System.out.println(l1.size());
        mostrarListas(l1);

        System.out.println("*************** MUESTRO LA SEGUNDA LISTA ***************");
        System.out.println(l2.size());
        mostrarListas(l2);

        System.out.println("*************** NUEVA LISTA CON LAS LETRAS DE L1 QUE NO ESTÁN EN L2 ***************");
        ArrayList<String> l3 = new ArrayList<>();
        //-*-*-*-*-**-**-*-**-*--*--*-
        // Otra manera de hacerlo es con el remove all
        // este metodo coge l3 y quita todos los valores de la lista que yo le paso
        // en este caso, cogo l3 y l2, y quito de l3 aquellas letras que esten tambien en l2;
        //asi solo se quedan las que no están en l3;

        //l3 = l1;
        //mostrarListas(l3);
        //l3.removeAll(l2);
        //mostrarListas(l3);
        //-*-*-*-*-**-**-*-**-*--*--*-
        for (int i = 0; i < l1.size(); i++) {
            // se resetea la variable para que compare correctamente las letras de ambas listas
            boolean esta = false;
            for (int j = 0; j < l2.size(); j++) {
                if (l1.get(i).equals(l2.get(j))) {
                    esta = true;
                    break;
                    // si está la letra salgo del for y comparo las demas letras de la primera lista.
                }
            }
            // si no está la letra la meto en la nueva lista
            if (esta == false) {
                l3.add(l1.get(i));
            }
        }
        System.out.println("*************** MUESTRO LA SEGUNDA LISTA: API STREAMS***************");
        l3.stream()
                .forEach(System.out::println);

        // con lambda
        System.out.println("*************** MUESTRO LA SEGUNDA LISTA: EXPRESION LAMBDA***************");
        System.out.println("");
        l3.stream()
                .forEach(letras -> System.out.println(letras));

    }

    public static void mostrarListas(ArrayList<String> lista) {
        for (String cosas : lista) {
            System.out.print(cosas + " || ");
        }
        System.out.println("\n");
    }

}
