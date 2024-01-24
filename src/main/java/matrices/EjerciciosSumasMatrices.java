/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class EjerciciosSumasMatrices {

    public static void main(String[] args) {

        int[][] matriz = {{3, 4, 5}, {6, 7, 8}, {9, 10, 11}, {0, 0, 0},};
        System.out.println("**********MUESTRO_LA_MATRIZ_TABULADA");
        mostrarMatriz(matriz);
        System.out.println("**********SUMA_FILA_MATRIZ");
        sumarFilaMatriz(matriz);
        System.out.println("**********SUMA_COLUMNA_MATRIZ");
        sumarColumnaMatriz(matriz);

    }

    // Método que muestra la matriz de forma tabulada
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println(" ");
    }

    public static double sumarFilaMatriz(int[][] matriz) {
        Scanner teclado = new Scanner(System.in);
        double suma = 0;
        int fila = 9999999;
        // controlar q la fila exista
        System.out.println("Introduce la fila que quieres sumar");
        fila = teclado.nextInt();

        for (int i = 0; i < matriz[fila].length; i++) {
            suma += matriz[fila][i];
        }

        System.out.println("La fila " + fila + " = " + suma);
        return suma;
    }

    public static double sumarColumnaMatriz(int[][] matriz) {
        Scanner teclado = new Scanner(System.in);
        double suma = 0;
        int columna = 9999999;
        // controlar que la columna exista
        System.out.println("Introduce la columna que quieres sumar");
        columna = teclado.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];

        }
        System.out.println("La fila " + columna + " = " + suma);
        return suma;
    }

}
