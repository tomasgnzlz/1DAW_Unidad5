/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Arrays;

/**
 *
 * @author tomas
 */
public class EjemploBurbuja {

    public static void main(String[] args) {
        // Array con los valores
        int numeros[] = {6, 5, 3, 1, 2};
        int tmp;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                System.out.println("numeros-i " + numeros[i]);
                System.out.println("numeros-j " + numeros[j]);
                if (numeros[i] > numeros[j]) {
                    tmp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = tmp;
                }
            }
        }
        System.out.println("loenseño");
        System.out.println(Arrays.toString(numeros));
        //entndio

    }

}
