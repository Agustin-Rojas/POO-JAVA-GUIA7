
import java.util.Arrays;

/*
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */

/**
 *
 * @author agusr
 */
public class programaArray {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[] arrayA50 = new double[50];
        double[] arrayB20 = new double[20];
        
        Arrays.fill(arrayA50, Math.random()*10);
        
        for (int i = 0; i < arrayA50.length; i++) {
            
            arrayA50[i] = (double) Math.round(((Math.random() * 20) + 1) * 100) / 100;  
            System.out.print(arrayA50[i]);
            System.out.print(" | ");
        }
    
        Arrays.sort(arrayA50);
        
        System.arraycopy(arrayA50, 0, arrayB20, 0, 10);
        
        
       Arrays.fill(arrayB20,  10,  20, 0.5 );
            System.out.println();
         System.out.println("****************************************");
       System.out.println(Arrays.toString(arrayA50));
       
         System.out.println("****************************************");
         System.out.println(Arrays.toString(arrayB20));
       
         
         
         
        
         
         
    }
    
}
