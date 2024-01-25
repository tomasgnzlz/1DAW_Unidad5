/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tomas En una clase con el main, usando métodos de clase a) Método que
 * recibe un número "n" entre 1 y 10 y devuelve una matriz de nXn elementos
 * aleatorios de tipo char. b) Método que recibe la matriz y un char y devuelve
 * una lista de objetos Celda indicando las casillas donde se encuentra ese char
 * dentro de la matriz.
 */
public class MAin {

    public static void main(String[] args) {
        System.out.println("\n                 PARTE A                 ");
        char[][] matriz = preguntarN();
        mostrarMatriz(matriz);
        System.out.println("\n                 PARTE B                 ");

        ArrayList<Celda> listaCeldas = celdasLetra('A', matriz);
        mostrarLista(listaCeldas);
    }

    public static char[][] preguntarN() {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int num = 0;

        do {
            try {
                System.out.println("Introduce un numero(1-10)");
                num = teclado.nextInt();
                if (num >= 1 && num <= 10) {
                    salir = true;
                } else {
                    System.out.println("Rango incorrecto, Entre 1-10");
                }
            } catch (InputMismatchException ime) {
                System.out.println("ERROR, introduzca un numero entero");
            }

        } while (!salir);

        char[][] matriz = rellenarMatrizChar(num);

        return matriz;
    }

    public static char[][] rellenarMatrizChar(int num) {
        char[][] matrizAux = new char[num][num];
        //char letras = 'a';
        Random rd = new Random();
        int random = 0;
        char letras[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'W', 'X', 'Y', 'Z'};

        for (int i = 0; i < matrizAux.length; i++) {
            for (int j = 0; j < matrizAux[i].length; j++) {
                random = rd.nextInt(letras.length);
                matrizAux[i][j] = letras[random];
            }
        }
        return matrizAux;
    }

    public static void mostrarMatriz(char[][] matrizAux) {
        for (int i = 0; i < matrizAux.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrizAux[i].length; j++) {
                System.out.print(matrizAux[i][j] + " ");
            }
        }
    }

    // B
    public static ArrayList<Celda> celdasLetra(char letra, char[][] matrizAux) {
        ArrayList<Celda> listaCeldas = new ArrayList<>();

        for (int i = 0; i < matrizAux.length; i++) {
            for (int j = 0; j < matrizAux[i].length; j++) {
                if (letra == matrizAux[i][j]) {
                    Celda c = new Celda(i, j);
                    listaCeldas.add(c);
                }
            }
        }

        if (listaCeldas.size() == 0) {
            System.out.println("No se ha encontrado esa letra en la matriz");
        }
        return listaCeldas;
    }

    public static void mostrarLista(ArrayList<Celda> lista) {
        for (Celda c : lista) {
            System.out.println(c.toString());
        }
    }

}
