/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizAdyacente;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Adyacentes {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        matriz = rellenarMatrizEnteros(matriz);
//        mostrarMatriz(matriz);

        do {
            System.out.println("*****************BUSCAR_ADYACENTE*****************");
            mostrarMatriz(matriz);
            Scanner teclado = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Introduce el numero");
            int num = teclado.nextInt();
            adyacentes(matriz, num);
        } while (true);
    }

    // Método que enseña la matriz tabulada.
    public static void mostrarMatriz(int[][] arrayBidimensional) {
        for (int i = 0; i < arrayBidimensional.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.print(arrayBidimensional[i][j] + " ");
            }
        }
        System.out.println(" ");
    }

    // Método que rellena la matriz de enteros.
    public static int[][] rellenarMatrizEnteros(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = new Random().nextInt(100);
            }
        }
        return matriz;
    }

    // Método que obtiene los adyacentes de una posicion de la matriz
    public static void adyacentes(int[][] matriz, int numBuscarAdayacentes) {

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == numBuscarAdayacentes) {

                    // esta en la esquina superior izqueirda
                    if (matriz[i] == matriz[0] && matriz[j] == matriz[0]) {
                        listaNumeros.add(matriz[i][j + 1]);//derecha  
                        listaNumeros.add(matriz[i + 1][j]);//abajo
                        listaNumeros.add(matriz[i + 1][j + 1]);// el de abajo a la derecha
                    } // esta en la esquina inferior izqueirda
                    else if (matriz[i] == matriz[matriz.length - 1] && matriz[j] == matriz[0]) {
                        listaNumeros.add(matriz[i - 1][j]);//arriba
                        listaNumeros.add(matriz[i][j + 1]);//derecha
                        listaNumeros.add(matriz[i - 1][j + 1]);//arriba a la derecha
                    } // esta en la esquina superior derecha
                    else if (matriz[i] == matriz[0] && matriz[j] == matriz[matriz.length - 1]) {
                        listaNumeros.add(matriz[i][j - 1]);//izquierda
                        listaNumeros.add(matriz[i + 1][j - 1]);//abajo a la izquierda
                        listaNumeros.add(matriz[i + 1][j]);//abajo
                    } // esta en la esquina inferior derecha
                    else if (matriz[i] == matriz[matriz.length - 1] && matriz[j] == matriz[matriz.length - 1]) {
                        listaNumeros.add(matriz[i - 1][j]);//arriba
                        listaNumeros.add(matriz[i][j - 1]);//izquierda
                        listaNumeros.add(matriz[i - 1][j - 1]);//arriba a la izquierda
                    } // cuadradoss
                    else if (j == 0 && (i > 0 && i < matriz.length)) {
                        listaNumeros.add(matriz[i - 1][j]);//arriba
                        listaNumeros.add(matriz[i + 1][j]);//abajo
                        listaNumeros.add(matriz[i][j + 1]);//derecha
                        listaNumeros.add(matriz[i - 1][j + 1]);//arriba a la derecha
                        listaNumeros.add(matriz[i + 1][j + 1]);//abajo a la derecha
                    } // Triangulo
                    else if (i == 0 && (j > 0 && j < matriz[i].length)) {
                        listaNumeros.add(matriz[i + 1][j]);//abajo
                        listaNumeros.add(matriz[i][j - 1]);//izquierda
                        listaNumeros.add(matriz[i][j + 1]);//derecha
                        listaNumeros.add(matriz[i + 1][j - 1]);//abajo a la izquierda
                        listaNumeros.add(matriz[i + 1][j + 1]);//abajo a la derecha

                    } // pentagonso
                    else if (j == matriz[i].length - 1 && (i > 0 && i < matriz.length - 1)) {
                        listaNumeros.add(matriz[i - 1][j]);//arriba
                        listaNumeros.add(matriz[i + 1][j]);//abajo
                        listaNumeros.add(matriz[i][j - 1]);//izquierda
                        listaNumeros.add(matriz[i - 1][j - 1]);//arriba a la izquierda
                        listaNumeros.add(matriz[i + 1][j - 1]);//abajo a la izquierda
                    } // rectangulos
                    else if (i == matriz.length - 1 && (j > 0 && j < matriz[i].length)) {
                        listaNumeros.add(matriz[i - 1][j]);//arriba
                        listaNumeros.add(matriz[i][j - 1]);//izquierda
                        listaNumeros.add(matriz[i][j + 1]);//derecha
                        listaNumeros.add(matriz[i - 1][j + 1]);//arriba a la derecha
                        listaNumeros.add(matriz[i - 1][j - 1]);//arriba a la izquierda
                    } else {
                        // Morado
                        listaNumeros.add(matriz[i - 1][j]);// el de arriba
                        listaNumeros.add(matriz[i + 1][j]);// el de abajo

                        listaNumeros.add(matriz[i][j - 1]);// el de la izquierda
                        listaNumeros.add(matriz[i][j + 1]);// el de la derecha

                        listaNumeros.add(matriz[i - 1][j - 1]);// el de arriba a la izquierda
                        listaNumeros.add(matriz[i - 1][j + 1]);// el de arriba a la derecha

                        listaNumeros.add(matriz[i + 1][j - 1]);// el de abajo a la izquierda
                        listaNumeros.add(matriz[i + 1][j + 1]);// el de abajo a la derecha
                    }
                }

            }
        }
        // Enseño la lista de numeros adyacentes al que le paso como parametro.
        listaNumeros.forEach(System.out::println);
    }

}
