/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, par, impar, total;
        
        par = 0;
        impar = 0;
        total = 0;
        num = 0;
        
        System.out.println("Ingrese numeros");
        do {           
           num = leer.nextInt();
           total += 1;
           switch (num % 5) {
               case 0:
                   par += 1;
                   break;
               default:
                   impar += 1;
                   break;
            }
        } while (num % 5 != 0);      
        
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
        System.out.println("Total: " + total);
              
    }
    
}
