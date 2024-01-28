/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizAutobus;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tomas
 */
public class Main {

    public static void main(String[] args) {
        // Creo un Autobus rellenado
        Autobus autobus = new Autobus();
        System.out.println(autobus.toString());
        int numFila = preguntarFila();

        System.out.println("");
        boolean val = preguntarInvalido();
        System.out.println(val);
        autobus.cambiarEstadoTotal(numFila, val);
        System.out.println(" ");
        System.out.println(autobus.toString());

    }

    public static int preguntarFila() {
        Scanner teclaod = new Scanner(System.in);
        int num = 0;
        boolean valido = false;
        do {
            try {
                System.out.println("¿Que asiento quieres?");
                num = teclaod.nextInt();

                if (num >= 0 || num <= 47) {
                    valido = true;
                } else {
                    System.out.println("Ese asiento no existe(0-47)");
                }
            } catch (InputMismatchException ime) {
                System.out.println("ERROR - Formato incorrecto");
            }
        } while (!valido);
        return num;
    }

    public static boolean preguntarInvalido() {
        Scanner teclaod = new Scanner(System.in);
        boolean invalido = false;
        String texto = "";
        boolean valido = false;
        do {
            try {
                System.out.println("¿Eres Invalido?(SI/NO)");
                texto = teclaod.nextLine();
                if (texto.equalsIgnoreCase("Si")) {
                    valido = true;
                    invalido = true;
                } else if ((texto.equalsIgnoreCase("No"))) {
                    valido = true;
                    invalido = false;
                }

            } catch (InputMismatchException ime) {
                System.out.println("ERROR - Formato incorrecto");
            }
        } while (!valido);
        return invalido;
    }
}

//    public static int preguntarColumna() {
//        Scanner teclaod = new Scanner(System.in);
//        int num = 0;
//        boolean valido = false;
//        do {
//            try {
//                System.out.println("Introduce el numero de columna que deseas:");
//                num = teclaod.nextInt();
//
//                if (num >= 0 && num <= 3) {
//                    valido = true;
//                }
//            } catch (InputMismatchException ime) {
//                System.out.println("ERROR - Formato incorrecto");
//            }
//        } while (!valido);
//        return num;
//    }

