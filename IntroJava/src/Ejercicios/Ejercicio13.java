/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero entero para crear el "
                + "cuadrado...");
        int n = leer.nextInt();

        if (n >= 0 && n <= 50) {

            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }

            System.out.println();

            for (int i = 0; i < n - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("El número ingresado debe ser entero y no mayor "
                    + "a 50...");
        }

    }
    
}
