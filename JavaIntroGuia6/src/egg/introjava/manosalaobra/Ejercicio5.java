/*
Define una variable de tipo boolean, double y char. 
Guarda información en ellas a través del Scanner.
 */
package egg.introjava.manosalaobra;
import java.util.Scanner;
/**
 *
 * @author Mile
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Defino la variable de entrada de datos por teclado
        Scanner entrada = new Scanner(System.in);
        // defino las variables y les alojo lo ingresado de diferentes maneras
        boolean certeza;
        System.out.println("Ingrese false o true");
        certeza = entrada.nextBoolean();
        
        System.out.println("Ingrese un caracter");
        char letra = entrada.next().charAt(0);
        
        System.out.println("Ingrese un numero decimal");
        double decimal = entrada.nextDouble();
        //detección de errores
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        
    }
    
}
