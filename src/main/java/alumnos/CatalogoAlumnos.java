/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author tomas
 */
public class CatalogoAlumnos {

    public static void main(String[] args) {

        // Creo la lista de alumnos. 
        ArrayList<Alumno> lista = new ArrayList<>();
        Alumno a1 = new Alumno("Tomas", "Gonzalez", "1979878a", 10, 10, 20);
        Alumno a2 = new Alumno("Ariel", "Gonzalez", "1979878a", 1, 20, 10);
        Alumno a3 = new Alumno("Eduardo", "Correa", "1878951a", 24, 10, 30);
        Alumno a4 = new Alumno("Antonio", "Ramirez", "9638528a", 21, 109, 6);
        Alumno a5 = new Alumno("Aiman", "harrar", "2000000a", 20, 1001, 1);

        // Añado alumnos a la lista
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        lista.add(a5);
        

        // Muestro la lista
        System.out.println("\n*****************LISTA ORDENADA*****************\n");
        lista.forEach(System.out::println);
        System.out.println("\n*****************LISTA ORDENADA POR NOMBRE*****************\n");
        Comparator<Alumno> porNombre = (e1, e2) -> e1.getNombre().compareToIgnoreCase(e2.getNombre());
        Collections.sort(lista, porNombre);
        lista.forEach(System.out::println);

        System.out.println("\n*****************LISTA ORDENADA POR ASISTENCIAS*****************\n");
        Comparator<Alumno> porAsistencias = (e1, e2) -> Integer.compare(e1.getAsistencias(), e2.getAsistencias());
        Collections.sort(lista, porAsistencias);
        lista.forEach(System.out::println);

        // Busqueda Binaria
        System.out.println("\n*****************BUSQUEDA BINARIA*****************\n");
        Alumno x = new Alumno();
        x.setNombre("Tomas");
        lista.add(x);
        int posicion = Collections.binarySearch(lista, x, porNombre);
        System.out.println("El nombre tomas está en la posición: " + posicion);

    }

}
