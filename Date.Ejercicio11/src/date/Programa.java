/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package date;

/*
import java.time.LocalDate;
import java.time.Month;
*/
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author agusr
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);

        int  anio,mes, dia;
        
        System.out.printf(" Ingrese el año \n");   
        anio= leer.nextInt();
        
         System.out.printf(" Ingrese el mes \n");   
        mes= leer.nextInt();
        
       System.out.printf(" Ingrese el dia \n");   
        dia= leer.nextInt();
        
        
        Date fecha = new Date(anio,mes,dia);
        
        
        System.out.printf(" Esta es la fecha: %d / %d / %d \n",fecha.getDate(),fecha.getMonth(),fecha.getYear());
        
        Date fechaActual = new Date();
        
        System.out.printf("Esta es la fecha actual: %d / %d / %d \n", fechaActual.getDate(),fechaActual.getMonth()+1,fechaActual.getYear()+1900);
        
        
        
        System.out.printf(" Existen estos años de diferencia: %d  \n", Math.abs((fechaActual.getYear()+1900)- (fecha.getYear())));
    
    
    
    }

}
