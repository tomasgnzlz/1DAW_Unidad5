/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naipes2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tomas
 */
public class Barajas {

    ArrayList<Naipe> listaNaipes;
    final int TAMANYO_BARAJA = 40;
    public static final int TAMANYO_BARAJA_TIPO = 10;

    //Constructor sin parametros
    public Barajas() {
        ArrayList<Naipe> naipesLista = new ArrayList<>();
        int contador = 0;
        Palo palo = null;
        for (int i = 0; i < 4; i++) {
            switch (i + 1) {
                case 1 -> {
                    palo = Palo.OROS;
                }
                case 2 -> {
                    palo = Palo.BASTOS;
                }
                case 3 -> {
                    palo = Palo.COPAS;
                }
                case 4 -> {
                    palo = Palo.ESPADAS;
                }
            }

            for (int j = 1; j <= TAMANYO_BARAJA_TIPO; j++) {
                Naipe nuevoNaipe = new Naipe(palo, j);
                //array[contador++] = nuevoNaipe;
                naipesLista.add(nuevoNaipe);
            }
        }
        this.listaNaipes = naipesLista;
    }

    // Método barajar naipes de la lista.
    public void barajar(int movimientos) {
        Random rd = new Random();
        int num1, num2;
        Naipe aux1, aux2;

        // Se cambiadrán de posiciones tantas veces como movimientos se introduzcan
        for (int i = 0; i < movimientos; i++) {
            // genero numeros aleatorios
            do {
                num1 = rd.nextInt(1, 40);
                num2 = rd.nextInt(1, 40);
            } while (num1 == num2);

            // guardo en variables auxiliares naipes;
            //aux1 = arrayNaipe[num1];
            //aux2 = arrayNaipe[num2];
            aux1 = listaNaipes.get(num1);
            aux2 = listaNaipes.get(num2);

            // coloco esos naipes en sus nuevas posiciones
            //arrayNaipe[num1] = aux2;
            //arrayNaipe[num2] = aux1;
            listaNaipes.add(num1, aux2);
            listaNaipes.add(num2, aux1);

            // Arreglar esto
            System.out.println("Han intercambiado posicioin el naipe con posición "
                    + (num1 + 1) + " con el naipe de la posición " + (num2 + 1));
        }
    }

    // Método sacar naipes de la baraja
    public void sacar(int numCartas) {
        Random rd = new Random();
        int num;

        for (int i = 0; i < numCartas; i++) {
            num = rd.nextInt(1, 40);
            System.out.println("Se ha eliminado: " + listaNaipes.get(num));
            listaNaipes.remove(num);
        }
    }
    
    public ArrayList<Naipe> sacar2(int numCartas) {
        Random rd = new Random();
        int num;
        ArrayList<Naipe> nuevaListaNAipes = new ArrayList<>();
        

        for (int i = 0; i < numCartas; i++) {
            num = rd.nextInt(1, 40);
            System.out.println("Se ha eliminado: " + listaNaipes.get(num));
            listaNaipes.remove(num);
        }
        nuevaListaNAipes = listaNaipes;
        return  nuevaListaNAipes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Barajas{ \n");
        int contador = 1;
        for (Naipe listaNaipe : listaNaipes) {
            sb.append(contador).append(". ").append(listaNaipe).append("\n");
            contador++;
        }
        sb.append('}');
        return sb.toString();
    }

}
