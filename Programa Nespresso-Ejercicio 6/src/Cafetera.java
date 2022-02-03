/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */

/**
 *
 * @author agusr
 */
public class Cafetera {
    
    private  int capacidadMaxima;
    private int cantidadActual;
    
    public Cafetera(){
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
         System.out.println("");
        System.out.println("LLenando la cafetera...");
        cantidadActual=capacidadMaxima;
    }
    
    public void MostrarCafetera(){
          System.out.println("----------CAFETERA NESSPRESSO----------");
            System.out.println("Capacidad: "+ capacidadMaxima + " ml.");
              System.out.println("Cantidad actual: "+ cantidadActual + " ml.");
    }
    
    
    
    public void servirTaza(int tTaza){
        System.out.println("");
        System.out.println("Sirviendo "+ tTaza + " ml de cafe en la taza...");
        if(tTaza <= cantidadActual){
            cantidadActual-=tTaza;
            System.out.println("Se sirvio la taza completa");
        }else {
            System.out.println(" La taza no se lleno porque no habia suficiente cafe");
            System.out.println(" Se sirvio "+ cantidadActual+ " ml de café");
            cantidadActual=0;
        }
    }
    
    public void vaciarCafetera(){
         System.out.println("");
        System.out.println("Vaciando la Cafetera...");
        cantidadActual=0;
    }
    
    public void agregarCafe(int mlCafe){
        
         System.out.println("");
        System.out.println("Agregando "+ mlCafe+ " ml de cafe a la cafetera...");
        if (mlCafe + cantidadActual <= capacidadMaxima){
            cantidadActual+=mlCafe;
        }else {
            System.out.println("No se pudo agregar todo el cafe porque la cafetera ya se llenó");
            cantidadActual=capacidadMaxima;
        }
    }
}
