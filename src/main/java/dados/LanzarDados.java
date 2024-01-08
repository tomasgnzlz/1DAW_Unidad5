/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author tomas Clase LanzarDado, con un atributo lista de enteros. EL
 * constructor de del objeto rellena una lista simulando 1000 lanzamientos del
 * dado
 */
public class LanzarDados {

    ArrayList<Integer> listaEnteros = new ArrayList<>();

    final int NUMERO_CARAS_INFERIOR = 1;
    final int NUMERO_CARAS_SUPERIOR = 6;
    Random rd = new Random();

    public LanzarDados() {
        for (int i = 0; i < 10; i++) {
            int num = rd.nextInt(NUMERO_CARAS_INFERIOR, NUMERO_CARAS_SUPERIOR + 1);
            listaEnteros.add(num);
        }
    }

    public LanzarDados(int n) {
        for (int i = 0; i < n; i++) {
            listaEnteros.add(rd.nextInt(NUMERO_CARAS_INFERIOR, NUMERO_CARAS_SUPERIOR + 1));
        }
    }

    public int numeroCaras(int caraBuscar) {
        int contador = 0;
        for (Integer listaEntero : listaEnteros) {
            if (listaEntero == caraBuscar) {
                contador++;
            }
        }
        return contador;
    }

    public void eliminarCara(int caraEliminar) {
        // no puedor recorrer lista y a la vez eliminar su content ya que cambia su zize y peta
        // Recorrido con iterador
        Iterator<Integer> it = listaEnteros.iterator();
        while (it.hasNext()) {
            if (it.next() == caraEliminar) {
                it.remove();
            }
        }
    }

    // toString.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista Dados { \n");
        int contador = 0;

        for (int i = 0; i < listaEnteros.size(); i++) {
            sb.append(i).append(" || ").append(listaEnteros.get(i)).append("\n");
        }
        sb.append('}');
        return sb.toString();
    }

}
