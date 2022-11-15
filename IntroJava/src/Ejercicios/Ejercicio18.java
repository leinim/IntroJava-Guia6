/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package Ejercicios;

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
        double[][] mat = new double[4][4];
        int[][] matT = new int [4][4];
        
        //Asignar valores random a la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = Math.floor(Math.random()*10);
            }
        }
        //Imprimir la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        //Transponer la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matT[i][j] = (int) mat[j][i];
            }
        }        
         //Imprimir la matriz transpuesta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matT[i][j] + "]");
            }
            System.out.println("");
        }
        
    }
    
}
