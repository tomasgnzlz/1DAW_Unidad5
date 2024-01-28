/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizAutobus;

/**
 *
 * @author tomas
 */
public class Asiento {

    private int numAsiento;
    private Estado estadoAsiento;
    private static int contador = 0;

    public Asiento(int numAsiento, Estado estadoAsiento) {
        this.numAsiento = numAsiento;
        this.estadoAsiento = estadoAsiento;
    }

    public Asiento(/*int numAsiento, Estado estadoAsiento*/) {
        this.numAsiento = contador++;
        this.estadoAsiento = Estado.LIBRE;
    }

    // Getters y Setters
    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public Estado getEstadoAsiento() {
        return estadoAsiento;
    }

    public void setEstadoAsiento(Estado estadoAsiento) {
        this.estadoAsiento = estadoAsiento;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //sb.append("Asiento{");
        sb.append('{');
        sb.append(numAsiento);
        sb.append(" - ").append(estadoAsiento);
        sb.append('}');
        return sb.toString();
    }

}
