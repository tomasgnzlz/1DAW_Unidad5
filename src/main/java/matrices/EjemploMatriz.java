/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author tomas
 */
public class EjemploMatriz {

    public static void main(String[] args) {
        // MAtriz 2x2 de int
        int[][] matriz = new int[2][2];
        // inicialización de valores manualmente
        matriz[0][0] = 3;
        matriz[0][1] = 5;
        matriz[1][0] = 1;
        matriz[1][1] = 9;

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int[][] matriz2 = {
            {3, 4, 5},
            {6, 7, 8},
            {9, 10, 11},
            {0, 0, 0},};

        for (int i = 0; i < matriz2.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
        }

        /*
         Realiza un programa que pida al usuario el número de filas y columnas de
         un array bidimensional de números enteros. El programa crea la matriz con 
         esos tamaños y debe rellenarla solicitando al usuario los valores a introducir. 
         Una vez esté rellena, se debe mostrar la matriz completa y la suma de sus elementos.
         */
    }

}
