/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el punto de Fibonacci al cual desea llegar");
        int Fibonacci = leer.nextInt(), f1 = 1, f2 = 1;
        int vector[] = new int[Fibonacci];
        for (int i = 0; i < Fibonacci; i++) {
            if (i < 2){
                vector[i] = 1;
            }
            else{
                vector[i] = f1 + f2;
                f1 = f2;
                f2 = vector[i];
            }
        }
        for (int i = 0; i < Fibonacci; i++) {
            if (i == 0){
            System.out.print(vector[i]);
            } else{
                System.out.print(", " + vector[i]);
            }
        }
        System.out.println("");
    }
    
}
