/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Circunferencia.Ejercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author agusr
 */
public class Circunferencia {
    
    Scanner Leer = new Scanner (System.in).useLocale(Locale.US);
    //////////////////ATRIBUTO///////////////////
    private double radio;
    
    
    ///////////////////////CONSTRUCTOR///////////////////////
    public Circunferencia(double radio){
        this.radio=radio;
    }
    public Circunferencia(){
        
    }
    ////////////////////GET Y SET////////////////////////
    public void setRadio(double radio){
    this.radio=radio;
    }
    public double getRadio(){
    return radio;
    }
    
    ///////////////// PEDIR RADIO////////////
    public  void crearCircunferencia(){
         System.out.println(" ----------Circunferencia----------------");
    System.out.println(" ¿Cual es el radio?");
    setRadio(Leer.nextDouble());
    
    }
    //////////////////metodo area/////////////////
    
    public void area(){
    
         System.out.println(" ------------AREA----------");
          System.out.println(" El Area del circulo es: " + (Math.PI * (radio * radio) ) );
    }
    
    /////////////////////PERIMETRO///////////////////////
    public void perimetro(){
    
         System.out.println(" ------------PERIMETRO----------");
          System.out.println(" El Perimetro del circulo es: " + (2 * Math.PI * radio  ) );
    }
    
    
}
