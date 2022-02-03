
import java.util.Scanner;

/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */

/**
 *
 * @author agusr
 */
public class CuentaBancaria {

    Scanner Leer= new Scanner(System.in);
    
    private int numeroCuenta;
    private long DNI;
    private double saldoActual;
    
    public CuentaBancaria() {
    }
    
    public CuentaBancaria(long DNI, double saldoActual, int numeroCuenta) {
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.numeroCuenta = numeroCuenta;
    }
    
    public void setDNI(long DNI) {
        this.DNI = DNI;
    }
    
    public long getDNI() {
        return DNI;
    }
    
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /////////////////////metodos////////////////////////
    
    public void cargarDatos(){
        
         System.out.println("----------CREANDO CUENTA---------");
        
        System.out.println("Ingrese su numero de DNI");
        this.DNI= Leer.nextLong();
        System.out.println("Ingrese su numero de Cuenta");
        this.numeroCuenta= Leer.nextInt();
         System.out.println("Ingrese su Saldo");
        this.saldoActual= Leer.nextDouble();
    }
    
    
    
    /*Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.*/
    public void ingresar(double ingreso) {
        saldoActual += ingreso;
    }

    /*Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.*/
    public void retirar(double retiro) {
        if (retiro > saldoActual) {
            saldoActual = 0;
        } else {
            saldoActual -= retiro;
        }
    }

    /*Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.*/
    public void extraccionRapida(double retiro) {
        if (retiro <= (saldoActual / 100 * 20)) {
            saldoActual -= retiro;
        } else {
            System.out.println("Con este modo de extraccion no puede sacar tanto dinero");
        }
        
    }
    
    
    /*Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.*/
    
    public void consultarSaldo(){
        System.out.println("Su saldo disponible es: "+ saldoActual);
    }
    
    /*Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
    
    public void consultarDatos(){
        System.out.println("Su DNI es: "+ DNI);
        System.out.println("Su Numero de Cuenta es: "+ numeroCuenta);
        System.out.println("Su saldo disponible es: "+ saldoActual);
    }
}
