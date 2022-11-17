/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Mile
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [][] M = new double[10][10];
        double [][] P = new double[3][3];
        int i, j;
        
        //Asigno valores random a la matriz 10x10
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                M[i][j] = Math.floor(Math.random() * 10);
            }
        }
        
        //Asigno valores random a la matriz 3x3
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                P[i][j] = Math.floor(Math.random() * 10);
            }
        }
        
        //Imprimo la matriz 10x10   
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print("[" + M[i][j] + "]");
            }
            System.out.println("");
        }
          
        System.out.println("");
        
        //Imprimo la matriz 3x3
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("[" + P[i][j] + "]");
            }
            System.out.println("");
        }
        
        

        
    }
    
}
