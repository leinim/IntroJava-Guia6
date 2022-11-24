/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, suma;
        
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        
        int[] vector = new int [n];
        
        suma = 0;
        for (int i = 0; i < n; i++){
            System.out.println("Ingrese el valor para la posición " + i); 
            vector [i] = leer.nextInt();
            suma += vector [i];                       
        }
        System.out.println("La suma de los valores del vector es igual a " 
        + suma);  
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
        }
    }
     
}
