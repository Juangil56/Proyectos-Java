/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author julieth
 */
public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    
    public Libro(String titulo, String autor, String ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + '}';
    }

}
