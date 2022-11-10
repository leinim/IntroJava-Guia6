/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima 
el número ingresado seguido de tantos asteriscos como indique su valor. 
Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package egg.introjava.manosalaobra;

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
        int num1, num2, num3, num4;
        
        System.out.println("Ingrese cuatro numeros comprendidos entre 1 y 20");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        
        System.out.print(num1);
        for (int i = num1; i > 0; i--) {
            System.out.print("*"); 
        }
        System.out.println(" ");
        
        System.out.print(num2);
        for (int i = num2; i > 0; i--) {
            System.out.print("*"); 
        }
        System.out.println(" ");
        
        System.out.print(num3);
        for (int i = num3; i > 0; i--) {
            System.out.print("*"); 
        }
        System.out.println(" ");
        
        System.out.print(num4);
        for (int i = num4; i > 0; i--) {
            System.out.print("*"); 
        }
        System.out.println(" ");
    }
    
    
}
