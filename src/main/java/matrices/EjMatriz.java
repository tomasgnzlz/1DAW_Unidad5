/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class EjMatriz {

    public static void main(String[] args) {
        /*
 Realiza un programa que pida al usuario el número de filas y columnas de
 un array bidimensional de números enteros. El programa crea la matriz con 
 esos tamaños y debe rellenarla solicitando al usuario los valores a introducir. 
 Una vez esté rellena, se debe mostrar la matriz completa y la suma de sus elementos.
         */
        String texto = "¿Introduce el tamaño del array?";
        int num1 = preguntarEntero(texto);
        int num2 = preguntarEntero(texto);
        int[][] arrayEnteros = new int[num1][num2];
        int valor = 0;

        for (int i = 0; i < arrayEnteros.length; i++) {
            //System.out.println("Fila: " + i);
            for (int j = 0; j < arrayEnteros[i].length; j++) {
                valor = preguntarEntero("Introduce el valor " + j + " de la fila: " + i);
                arrayEnteros[i][j] = valor;
            }
        }
        System.out.println("++++++++++++++++++MOSTRAR_ARRAY++++++++++++++++++");
        mostrarArray(arrayEnteros);

    }

    public static int preguntarEntero(String texto) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int numero = 0;

        do {
            try {
                System.out.println(texto);
                numero = teclado.nextInt();
                salir = true;
            } catch (InputMismatchException ime) {
                System.out.println("ERROR,Introduce un entero");
                teclado.nextLine();
            }

        } while (!salir);

        return numero;
    }

    public static void mostrarArray(int[][] arrayBidimensional) {
        for (int i = 0; i < arrayBidimensional.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.print(arrayBidimensional[i][j] + " ");
            }
        }

    }

}
