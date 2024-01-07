/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naipes2;

import java.util.Random;

/**
 *
 * @author tomas
 */
public class Naipe {

    // Declaración de atributos
    private Palo palo;
    private int numeroCarta;

    // Constructor valores aleatorios.
    public Naipe() {
        Random rd = new Random();
        switch (rd.nextInt(1,5)) {
            case 1 -> {
                this.palo = Palo.BASTOS;
            }
            case 2 -> {
                this.palo = Palo.COPAS;
            }
            case 3 -> {
                this.palo = Palo.ESPADAS;
            }
            case 4 -> {
                this.palo = Palo.OROS;
            }
        }
        this.numeroCarta = rd.nextInt(1, 11);
    }

    // Constructor parametrizado.
    public Naipe(Palo palo, int numeroCarta) {
        this.palo = palo;
        this.numeroCarta = numeroCarta;
        if (numeroCarta < 1 || numeroCarta > 10) {
            throw new IllegalArgumentException("El numero no es parte de la baraja");
        }
    }

    // Getters y Setters
    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(int numeroCarta) {
//        //this.numeroCarta = numeroCarta;
        if (numeroCarta < 1 || numeroCarta > 10) {
            this.numeroCarta = getNumeroCarta();
        }
//        if (numeroCarta < 1 || numeroCarta > 10) {
//            Random rd = new Random();
//            this.numeroCarta = rd.nextInt(1, 11);
//        } else {
//            this.numeroCarta = numeroCarta;
//        }
    }

    // toString.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naipe{palo=").append(palo);
        if (numeroCarta >= 1 && numeroCarta <= 7) {
            sb.append(", numeroCarta=").append(numeroCarta);
        } else {
            switch (numeroCarta) {
                case 8 -> {
                    sb.append(", numeroCarta=").append(numeroCarta).append(" - Sota");
                }
                case 9 -> {
                    sb.append(", numeroCarta=").append(numeroCarta).append(" - Caballo");
                }
                case 10 -> {
                    sb.append(", numeroCarta=").append(numeroCarta).append(" - Rey");
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

}
