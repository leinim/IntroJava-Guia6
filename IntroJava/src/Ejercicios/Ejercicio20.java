/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int num = 0;
        int suma = 0;
        int cont = 0;
        int sumaP = 0;
        
        System.out.println("Ingrese los valores de la matriz");
        
        //Relleno la matriz con numeros por teclado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    num = leer.nextInt();
                    matriz[i][j] = num;
                }while (num < 1 && num > 9);
            }
        }
         
        //Elijo una fila de referencia
        for (int i = 0; i == 0; i++) {
            for (int j = 0; j < 3; j++) {
                sumaP += matriz[i][j];
            }
        }
        
        //Comparo sumaP con la suma de las filas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               suma += matriz [i][j];
               if (suma == sumaP) {
                   cont += 1;
               }
            }
            System.out.println(suma);
            suma = 0;
        }
        
        //Comparo sumaP con la suma de las columnas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma += matriz[j][i];
                if (suma == sumaP) {
                    cont += 1;
                }
            }
            System.out.println(suma);
            suma = 0;
        }
        
        //Comparo sumaP con la suma de la diagonal principal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == i) {
                    suma += matriz [i][j];
                }
            }
        }
        if (suma == sumaP) {
            cont += 1;
        }
        System.out.println(suma);
        suma = 0;
        
        //Comparo sumaP con la suma de la otra diagonal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2 - i) {
                    suma += matriz[i][j];
                }
            }
        }
        if (suma == sumaP) {
            cont += 1;
        }
        System.out.println(suma);
        
        //Muestro el resultado
        if (cont == 8) {
            System.out.println("La matriz es mágica, y la suma mágica es " 
                    + suma);
        } else {
            System.out.println("La matriz no es mágica");
        }
        
        //Muestro la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
