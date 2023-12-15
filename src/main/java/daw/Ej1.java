/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tomas
 */
public class Ej1 {

    public static void main(String[] args) {
        int num = pedirEntero();
        System.out.println("El numero de palabras a introducir es: " + num + "\n");

        String[] arrayPalabras = rellenarArrayPalabras(num);
        System.out.println("\n**********Mostramos el array rellenado**********\n");
        mostrarArray(arrayPalabras);

        System.out.println("\n**********Mostramos el array con las palabras que tienen mas de 3 vocales**********\n");
        String[] arrayMasVocales = PalabrasMasVocales(arrayPalabras);
        mostrarArray(arrayMasVocales);

        System.out.println("\n**********Mostramos el array con las palabras que tienen menos de 3 vocales**********\n");
        String[] arrayMenosVocales = PalabrasMenosVocales(arrayPalabras);
        mostrarArray(arrayMenosVocales);

    }

    // Método para enteros con JOption
    public static int pedirEntero() {
        int num = 0;
        boolean salir = false;
        do {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas palabras vas a introducir?"));
                salir = true;
            } catch (NumberFormatException nfe) {
                System.out.println("ERROR. Introduce un número entero");
            }
        } while (!salir);
        return num;
    }

    //Método para pedir las palabras al usuario. 
    public static String[] rellenarArrayPalabras(int numeroPalabras) {
        // Declaro el objeto scanner;
        Scanner teclado = new Scanner(System.in);

        // Creo un array del tamaño de las palabras a introducir.
        String[] arrayPalabras = new String[numeroPalabras];

        // Creo el atributo en el que guardar las palabras a la vez que se introducen.
        String palabra = "";

        // Recorro el array y voy metiendo las palabras a la vez que las pido. 
        for (int i = 0; i < arrayPalabras.length; i++) {
            System.out.println("Introduce la " + i + " palabra");
            palabra = teclado.nextLine();
            arrayPalabras[i] = palabra;
        }
        // devuelvo el array con las palabras introducidas. 
        return arrayPalabras;
    }

    // Método para mostrar los arrays.
    public static void mostrarArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + " - " + array[i]);
//            String conjuntoPlabras = """
//                                     Posición %d - %s
//                                     """.formatted(i, array[i]);
//            JOptionPane.showMessageDialog(null, conjuntoPlabras);
        }
    }

    // Método para contar las vocañes de una palabra.
    public static int contarVocales(String palabra) {
        int contador = 0;
        palabra = palabra.toLowerCase();
        //String[] vocales = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }

    // Método para devolver un array con las palabras que tienen mas vocales
    public static String[] PalabrasMasVocales(String[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (contarVocales(array[i]) >= 3) {
                contador++;
            }
        }

        System.out.println("De las " + array.length + " palabras hay " + contador + " que tienen mas de 3 vocales");
        // Creo un array con tantas posiciones como palabras que tienen mas de 3 vocales
        String[] arrayMasVocales = new String[contador];
        int z = 0;
        for (int i = 0; i < array.length; i++) {
            if (contarVocales(array[i]) >= 3) {
                arrayMasVocales[z++] = array[i];
            }
        }
        return arrayMasVocales;
    }

    // Método para devolver un array con las palabras que tienen menos vocales
    public static String[] PalabrasMenosVocales(String[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (contarVocales(array[i]) < 3) {
                contador++;
            }
        }

        System.out.println("De las " + array.length + " palabras hay " + contador + " que tienen menos de 3 vocales");
        // Creo un array con tantas posiciones como palabras que tienen mas de 3 vocales
        String[] arrayMasVocales = new String[contador];
        int z = 0;
        for (int i = 0; i < array.length; i++) {
            if (contarVocales(array[i]) < 3) {
                arrayMasVocales[z++] = array[i];
            }
        }
        return arrayMasVocales;
    }

}
