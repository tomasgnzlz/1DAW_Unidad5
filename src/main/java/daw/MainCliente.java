/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author tomas
 */
public class MainCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("pepe", 20,"estepona", "pepe@pepe.com");
        Cliente c2 = new Cliente("pepe", 20,"estepona", "pepe@pepe.com");
        
        System.out.println("c1==c2? " + c1.equals(c2));
    }
}
