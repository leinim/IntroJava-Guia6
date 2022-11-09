/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas 
y después toda en minúsculas. Nota: investigar la función toUpperCase() 
y toLowerCase() en Java.
 */
package Ejercicios;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

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
        String frase;
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        System.out.println(toUpperCase(frase));
        System.out.println(toLowerCase(frase));
    }
    
}
