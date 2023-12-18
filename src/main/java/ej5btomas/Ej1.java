/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5btomas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tomas
 */
public class Ej1 {

    public static void main(String[] args) {
        final int TAMANIO_ARRAY_DOUBLE = 15;
        final double VALOR_ARRAY_DOUBLE = 7.5;
        final double VALOR_RANDOM = 6.3;
        Random random = new Random();
        Double[] arrayDouble = new Double[TAMANIO_ARRAY_DOUBLE];
        //Rellena el array con el valor 7.5 en todas sus posiciones
        Arrays.fill(arrayDouble, VALOR_ARRAY_DOUBLE);
        //Realiza una copia del array anterior en un nuevo array
        Double[] copiaArray = Arrays.copyOf(arrayDouble, TAMANIO_ARRAY_DOUBLE);
        //Imprime ambos arrays por consola, usando el método toString de la clase Arrays.
        System.out.println(Arrays.toString(arrayDouble));
        System.out.println(Arrays.toString(copiaArray));

        //Compara ambos arrays mostrando si son iguales
        System.out.println("Son iguales: " + Arrays.equals(arrayDouble, copiaArray));
        //Introduce el valor 6.3 en una posición aleatoria válida de uno de los arrays
        copiaArray[random.nextInt(TAMANIO_ARRAY_DOUBLE)] = VALOR_RANDOM;
        //No se usa clase Arrays Imprime ambos arrays
        mostrarArray(arrayDouble);
        System.out.println("\n");
        mostrarArray(copiaArray);
        //Vuelve a compararlos indicando si son iguales o no
        System.out.println("Son iguales: " + Arrays.equals(arrayDouble, copiaArray));
        
        //En el main, genera un array de int usando el método anterior.
        int[] arrayInt = new int[5];
        rellenarArray(arrayInt);
        System.out.println("Array sin ordenar");
        System.out.println(Arrays.toString(arrayInt));
        Arrays.sort(arrayInt);
        //Ordena el array generado en el apartado anterior de menor a mayor y muestra el resultado.
        System.out.println("Array ordenado");
        System.out.println(Arrays.toString(arrayInt));
        
        // Pregunta al usuario por un elemento a buscar en el array ordenado. 
        //Usa búsqueda binaria para obtener la posición donde está el elemento.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero a buscar");
        int numero = teclado.nextInt();
        System.out.println("El numero "+numero+" se encuentra en la posición:"+ Arrays.binarySearch(arrayInt, numero));
        
    }

    public static void mostrarArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void rellenarArray(int[] array){
        final int RANGO_MINIMO = 10;
        final int RANGO_MAXIMO = 100;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
           array[i]= random.nextInt(RANGO_MINIMO,RANGO_MAXIMO+1);
        }
    }

}
