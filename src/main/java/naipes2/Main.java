/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naipes2;

/**
 *
 * @author tomas
 */
public class Main {

    public static void main(String[] args) {
        //Naipe[] array = new Naipe[40];
        generarNaipes();

    }

    public static void generarNaipes() {
        do {
            Naipe naipe = new Naipe();
            System.out.println(naipe);
            if (10 == naipe.getNumeroCarta()) {
                if (naipe.getPalo() == Palo.OROS) {
                    break;
                }
            }
        } while (true);
    }
}
