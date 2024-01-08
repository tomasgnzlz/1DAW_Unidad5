/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

/**
 *
 * @author tomas
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("**************CONSTRUCTOR POR DEFECTO**************");
        LanzarDados l1 = new LanzarDados();
        System.out.println(l1);
//        System.out.println("**************CONSTRUCTOR PARAMETRIZADO**************");
//        LanzarDados l2 = new LanzarDados(10);
//        System.out.println(l2);
        System.out.println("**************CONTADOR DE CARAS**************");
        int numeroCarasBuscar = l1.numeroCaras(1);
        System.out.println("Han salido: " + numeroCarasBuscar);

        System.out.println("**************CONTADOR DE CARAS**************");
        l1.eliminarCara(1);
        System.out.println(l1);

    }

}
