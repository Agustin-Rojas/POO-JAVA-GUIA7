
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.

• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
/**
 *
 * @author agusr
 */
public class Persona {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);
    
    private String nombre;

    private Date fechaNacimiento;
    
    /*Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/
    
    public void mostrarPersona(){
        System.out.println("***************Mostrador************");
        System.out.printf(" Nombre: %s \n", nombre);
         System.out.printf(" Fecha de Nacimiento: %d / %d / %d \n", fechaNacimiento.getDate(),fechaNacimiento.getMonth(),fechaNacimiento.getYear());
         calcularEdad();
    }
    
    /*Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.*/
    
    public boolean menorQue(int edadB){
        
        boolean menorQue= calcularEdad()<edadB;
        
        
        
        return menorQue;
    }
    
    
    
    /*Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.*/
    
    public int calcularEdad(){
        
        Date fechaActual =  new Date(); // esto genera la fecha actual por defecto en tipo Date pero el año le falta 1900
        
        
        int fechaA = fechaActual.getYear()+1900;   // transformando de tipo Date a entero para utlizar mas adelante y agregando 1900
        
        int fechaN = fechaNacimiento.getYear();   
        
        int edad = fechaA-fechaN;
        
        System.out.printf(" La edad de %s es: %d \n", nombre,edad);
        
        return edad;
        
        
        
    }
          
    

    /*Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.*/
    public void crearPersona() {
        
        
        
        System.out.println("Ingrese el nombre de la persona");
        setNombre(leer.next());

        System.out.println("Ingrese el año de nacimiento");
        int anio = leer.nextInt();

        

        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        while (mes > 12 || mes < 1) {
            System.out.println("Ingrese el mes de nacimiento utilizando los numero del 1 al 12");
            mes = leer.nextInt();
        }
        

        System.out.println("Ingrese el dia de nacimiento");
        int dia = leer.nextInt();
        while (dia > 31 || dia < 1) {
            System.out.println("Ingrese el dia de nacimiento utilizando los numero del 1 al 31");
            dia = leer.nextInt();
        }

        
        
        fechaNacimiento= new Date(anio,mes,dia);
        
        
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
