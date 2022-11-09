/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        
        System.out.println(nombre);
        
    }
    
}
