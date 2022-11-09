/*
Escribir un programa que pida dos números enteros por teclado y 
calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
https://youtu.be/S546WF_XrNI
https://youtu.be/GQjDCW7BmHY

 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma;
        
        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        suma = num1 + num2;
        System.out.println("La suma de los dos numeros es " + suma);
        
        
        
    }
    
}
