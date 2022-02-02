/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */


/**
 *
 * @author agusr
 */
public class Libro {

    
    
    //////////////// ATRIBUTOS//////////////
    private int ISBN;

    private String Titulo;

    private String Autor;

    private int NumeroDePaginas;
    
 //////////////////////CONTRUCTORES///////////////////////////////
    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int NumeroDePaginas) {

        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;

    }
    //////////////////////GETTERS Y SETTERS/////////////////////////
    
    public void setISBN(int ISBN){
    this.ISBN= ISBN;
    }
    
    public int getISBN(){
    return ISBN;
    }
    
    public void setTitulo(String Titulo){
    this.Titulo = Titulo;
    }
    
    
    public String getTitulo (){
    return Titulo;
    }
    
    public void setAutor (String Autor){
    this.Autor= Autor;      
    }
    
    public String getAutor (){
    return Autor;
    }
    
    public void setNumeroDePaginas (int NumeroDePaginas){
    this.NumeroDePaginas= NumeroDePaginas;    
    }
    
    public int getNumeroDePaginas (){
    return NumeroDePaginas;
    }
//////////////////////Mostrador//////////////////////
    
    
    
}
