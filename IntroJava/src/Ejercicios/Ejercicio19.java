/*
Realice un programa que compruebe si una matriz dada es anti simétrica. 
Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia 
traspuesta, pero cambiada de signo. Es decir, A es anti simétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT 
y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int n = leer.nextInt();
        
        int[][] mat = new int [n][n];
        int[][] matT = new int [n][n];
        
        //Asignar valores random a la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor(positivo o negativo) "
                        + "para la posición " + "[" + i + "]" + "[" + j + "]");
                mat[i][j] = leer.nextInt();
            }
        }
        //Imprimir la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        //Transponer la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matT[i][j] = mat[j][i];
            }
        }        
         //Imprimir la matriz transpuesta
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matT[i][j] + "]");
            }
            System.out.println("");
        }
        
        //Creo un contador y reviso si es anti simétrica
        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                if (mat[i][j] == -(matT[i][j])) {
                    cont += 1;
                }    
           }
        }
        
        if (cont == 16) {
            System.out.println("La matriz es anti simétrica");
        } else {
            System.out.println("La matriz es simétrica");
        }
            
         
       
    }
    
}
