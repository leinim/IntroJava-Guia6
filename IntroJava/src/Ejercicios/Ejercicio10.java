/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int suma, num;
        System.out.println("Ingrese un valor límite positivo");
        int limite = leer.nextInt();
        
        suma = 0;
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            suma += num;
        }while (suma <= limite);
        
        System.out.println("La suma es " + suma + " para el límite superado de " 
                + limite);
    }
        
}
