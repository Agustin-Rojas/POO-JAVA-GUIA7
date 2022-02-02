/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author agusr
 */
public class LibroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Libro libro = new Libro();
        
        CargarLibro ( libro);
        mostrarLibro( libro);
        
        
        
                
        
        
    }
    
    public static void CargarLibro (Libro libro){
        Scanner Leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
        System.out.println(" ------------- Cargador de Libros ---------------");
    
        System.out.println("¿Cual es el numero de ISBN?");
        int n = Leer.nextInt();
        libro.setISBN(n);
        System.out.println("");
        
      System.out.println("¿Cual es el Titulo?");     
       String t = Leer.next();
        libro.setTitulo(t);
        System.out.println("");
        
        System.out.println("¿Cual es el Autor?");     
       String a = Leer.next();
        libro.setAutor(a);
        System.out.println("");
        
        System.out.println("¿Cual es el Numero de Paginas?");     
       int np = Leer.nextInt();
        libro.setNumeroDePaginas(np);
        System.out.println("");
    }
    
    public static void mostrarLibro(Libro libro) {

        System.out.println("El ISBN es: " + libro.getISBN());
        System.out.println("El Titulo del Libro es: " + libro.getTitulo());
        System.out.println("El Autor del Libro es:" + libro.getAutor());
        System.out.println("El Numero de Paginas es: " + libro.getNumeroDePaginas());
       

    }
}
