/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Rectangulo.Ejercicio4;

/**
 *
 * @author agusr
 */
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {

        this.altura = altura;
        this.base = base;
    }

    public Rectangulo() {
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
     public int getAltura() {
        return altura;
    }

    public void superficie() {
        System.out.println("La superficie total del rectangulo es: " + (base * altura));
    }

    public void perimetro() {
        System.out.println("El perimtetro total del rectangulo es: " + ((base + altura) * 2));
    }
    
    
    public void dibujarRectangulo(){
    
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        for (int i = 0; i < altura; i++) {
            System.out.print("*");
            
            for (int j = 0; j < base-1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
    }

}
