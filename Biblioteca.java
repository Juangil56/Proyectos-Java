/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author julieth
 */

public class Biblioteca {
    private static ArrayList<Libro> libros = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       while (true) {
           mostrarMenu();
           int opcion = scanner.nextInt();
           scanner.nextLine(); 
           
           switch (opcion){
               case 1:
                   agregarLibro();
                   break;
               case 2:
                   eliminarLibro();
                   break;
               case 3:
                   buscarLibro();
                   break;
               case 4:
                   verTodosLosLibros();
                   break;
               case 5:
                   System.out.println("Hasta luego");
                   return;
               default:
                   System.out.println("Opcion no valida, intente de nuevo");
                   
                       
           }         
        }           
               
   }            
 private static void mostrarMenu(){
    System.out.println("1. agregar un libro");
    System.out.println("2. eliminar un libro");
    System.out.println("3. buscar un libro");
    System.out.println("4. ver todos lo libros");
    System.out.println("5. salir");
    System.out.print("ingrese una opcion");
    
 } 
 
 private static void agregarLibro(){
     System.out.print("ingrese el titulo del libro");
     String titulo = scanner.nextLine();
     System.out.print("ingrese el autor del libro");
     String autor = scanner.nextLine();
     System.out.print("ingrese el ISBN del libro");
     String ISBN = scanner.nextLine();
     
 }    
 
private static void eliminarLibro(){
     System.out.print("Ingrese el ISBN que desea eliminar");
     String ISBN = scanner.nextLine();
     
    for (int i = 0; i < libros.size(); i++){
        if (libros.get(i).getISBN().equals(ISBN)){
        libros.remove(i);
        System.out.println("libros eliminado");
        return;
    
        } 
    }  
    System.out.println("libor no encontrado");
}    

private static void verTodosLosLibros(){
    if (libros.isEmpty()){
        System.out.println("no hay libros en la biblioteca");
    }else {
        for(Libro libro : libros){
            System.out.println("Titulo:" + libro.getTitulo());
            System.out.println("Autor" + libro.getAutor());
            System.out.println("ISBN" + libro.getISBN());
            System.out.println();
        }
    }
}

private static void buscarLibro(){
    System.out.println("ingrese el ISBN del libro que desea buscar: ");
    String ISBN = scanner.nextLine();
    
    for (Libro libro : libros){
        if (libro.getISBN().equals(ISBN)){
            System.out.println("libro encontrado");
            System.out.println("titulo" + libro.getTitulo());
            System.out.println("autor" + libro.getAutor());
            System.out.println("ISBN" + libro.getISBN());
            return;
        }
    }
    System.out.println("Libro no encontrado");
}
 
 
 
          
                   
 
    
}
