/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package EjerciciosExtra;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Mile
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Ingrese una letra");
         String letra = leer.next();
         if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
             letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || 
             letra.equalsIgnoreCase("u")) {
             System.out.println("La letra " + letra + " es una vocal");
         } else {
             System.out.println("La letra " + letra + " no es una vocal");
         }
         
    }
    
}
