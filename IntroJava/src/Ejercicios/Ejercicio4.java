/*
Dada una cantidad de grados centígrados se debe mostrar 
su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double gradosC, gradosF;
        
        System.out.println("Ingrese los grados centígrados");
        gradosC = leer.nextDouble();
        
        gradosF = 32 + (9 * gradosC / 5);
        
        System.out.println("La equivalencia entre " + gradosC + " grados "
        + "centígrados en grados Fahrenheit es " + gradosF);
        
        
    }
    
}
