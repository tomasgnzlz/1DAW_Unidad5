/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparator;

import java.util.Objects;

/**
 *
 * @author tomas
 */
public class Libro {
    // Atributos

    private String isbn;
    private String titutloLibro;
    private String autor;
    private String editorial;
    private int numPaginas;

    // Constructor con parámetros.
    public Libro(String isbn, String titutloLibro, String autor, String editorial, int numPaginas) {
        this.isbn = isbn;
        this.titutloLibro = titutloLibro;
        this.autor = autor;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
    }

    // Constructor sin parámetros.
    public Libro() {
    }

    // Constructor copia.
    public Libro(Libro origen) {
        this.isbn = origen.isbn;
        this.titutloLibro = origen.titutloLibro;
        this.autor = origen.autor;
        this.editorial = origen.editorial;
        this.numPaginas = origen.numPaginas;

    }

    // Getters y setters
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitutloLibro() {
        return titutloLibro;
    }

    public void setTitutloLibro(String titutloLibro) {
        this.titutloLibro = titutloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    // toString;
    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titutloLibro=" + titutloLibro + ", autor=" + autor + ", editorial=" + editorial + ", numPaginas=" + numPaginas + '}';
    }

    // Equals y HashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.isbn);
        hash = 53 * hash + Objects.hashCode(this.titutloLibro);
        hash = 53 * hash + Objects.hashCode(this.autor);
        hash = 53 * hash + Objects.hashCode(this.editorial);
        hash = 53 * hash + this.numPaginas;
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
        final Libro other = (Libro) obj;
        if (this.numPaginas != other.numPaginas) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        if (!Objects.equals(this.titutloLibro, other.titutloLibro)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return Objects.equals(this.editorial, other.editorial);
    }

}
