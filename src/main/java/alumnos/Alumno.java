/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnos;

import java.util.Objects;

/**
 *
 * @author tomas
 */
public class Alumno {

    // Atributos
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private int asistencias;
    private int faltas;

    // Constructores
    public Alumno(String nombre, String apellido, String dni, int edad, int asistencias, int faltas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.asistencias = asistencias;
        this.faltas = faltas;
    }

    public Alumno() {
    }

    public Alumno(Alumno origen) {
        this.nombre = origen.nombre;
        this.apellido = origen.apellido;
        this.dni = origen.dni;
        this.edad = origen.edad;
        this.asistencias = origen.asistencias;
        this.faltas = origen.faltas;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    // toString
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + ", asistencias=" + asistencias + ", faltas=" + faltas + '}';
    }

    // Equals y HashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.apellido);
        hash = 79 * hash + Objects.hashCode(this.dni);
        hash = 79 * hash + this.edad;
        hash = 79 * hash + this.asistencias;
        hash = 79 * hash + this.faltas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (this.asistencias != other.asistencias) {
            return false;
        }
        if (this.faltas != other.faltas) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.dni, other.dni);
    }

}
