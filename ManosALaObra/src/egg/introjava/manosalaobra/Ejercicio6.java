/*
Implementar un programa que le pida dos números enteros a usuario y 
determine si ambos o alguno de ellos es mayor a 25.
 */
package egg.introjava.manosalaobra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos números son mayores a 25");
        } else if (num1 > 25 || num2 > 25) {
            System.out.println("Uno de los números es mayor a 25");
        } else {
            System.out.println("Ninguno de los números es mayor a 25");
        }
        
    }
    
}
