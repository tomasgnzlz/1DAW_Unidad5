/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizAutobus;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class Autobus {

    private Asiento[][] matrizAutobus = new Asiento[numFilas][numAsientosPorFila];
    final static int numAsientosPorFila = 4;
    final static int numFilas = 12;

    public Autobus() {
        this.matrizAutobus = rellenarMatriz(matrizAutobus);

    }

    // Método para rellenar el autobus de asientos
    public static Asiento[][] rellenarMatriz(Asiento[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = new Asiento();
            }
        }
        return matriz;
    }

    // Getters y Setters
    public Asiento[][] getMatrizAutobus() {
        return matrizAutobus;
    }

    public void setMatrizAutobus(Asiento[][] matrizAutobus) {
        this.matrizAutobus = matrizAutobus;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobus{\n\n");
        //sb.append("matrizAutobus=").append(matrizAutobus);
        for (int i = 0; i < matrizAutobus.length; i++) {
            sb.append(" ");
            for (int j = 0; j < matrizAutobus[i].length; j++) {
                sb.append(matrizAutobus[i][j]).append(" - ");
            }
            sb.append("\n");
        }
        sb.append("\n").append('}');
        return sb.toString();
    }

    // Métodos
    //Método que cambia el estado de un asiento
    public void cambiarEstadoReservado(int i, int j) {

        // solo le paso la fila y la columna del asiento que quiero
        matrizAutobus[i][j].setEstadoAsiento(Estado.OCUPADO);

    }

    public void cambiarEstadoTotal(int numAsiento, boolean invalido) {
        for (int i = 0; i < matrizAutobus.length; i++) {
            for (int j = 0; j < matrizAutobus[i].length; j++) {

                if (invalido) {
                    System.out.println("\n**********INVALIDO**********");
                    // Como es invalido, se reserva ese asiento y los que le rodean
                    // es decir, el de los lados, el del frente y detrás
                    if (matrizAutobus[i][j].getNumAsiento() == numAsiento - 1) {
                        matrizAutobus[i][j].setEstadoAsiento(Estado.OCUPADO);
                    }
                    if (matrizAutobus[i][j].getNumAsiento() == numAsiento - 3) {
                        matrizAutobus[i][j].setEstadoAsiento(Estado.OCUPADO);
                    }
                    if (matrizAutobus[i][j].getNumAsiento() == numAsiento - 4) {
                        matrizAutobus[i][j].setEstadoAsiento(Estado.OCUPADO);
                    }
                    if (matrizAutobus[i][j].getNumAsiento() == numAsiento - 5) {
                        matrizAutobus[i][j].setEstadoAsiento(Estado.OCUPADO);
                    }

                    // Aquí debes cambiar el índice en la condición
                    if (matrizAutobus[i][j].getNumAsiento() == numAsiento) {
                        matrizAutobus[i][j].setEstadoAsiento(Estado.OCUPADO);
                    }

                    if (matrizAutobus[i][j].getNumAsiento() == numAsiento + 1) {
                        matrizAutobus[i][j].setEstadoAsiento(Estado.OCUPADO);
                    }
                    if (matrizAutobus[i][j].getNumAsiento() == numAsiento + 3) {
                        matrizAutobus[i][j].setEstadoAsiento(Estado.OCUPADO);
                    }
                    if (matrizAutobus[i][j].getNumAsiento() == numAsiento + 4) {
                        matrizAutobus[i][j].setEstadoAsiento(Estado.OCUPADO);
                    }
                    if (matrizAutobus[i][j].getNumAsiento() == numAsiento + 5) {
                        matrizAutobus[i][j].setEstadoAsiento(Estado.OCUPADO);
                    }
                } else {
                    System.out.println("\n**********NO_ES_INVALIDO**********");
                    // Como no es invalido, solo se reserva ese asiento.
                    if (matrizAutobus[i][j].getNumAsiento() == numAsiento) {
                        matrizAutobus[i][j].setEstadoAsiento(Estado.OCUPADO);
                    }
                }

            }
        }
    }

}
