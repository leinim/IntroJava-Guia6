/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros: ");
        float euros = leer.nextFloat();
        
        convertidor(euros);
    }

    public static void convertidor(float euros) {
        System.out.println("El valor ingresado en libras es " 
                + (euros * 0.86));
        System.out.println("El valor ingresado en dolares es " 
                + (euros * 1.28611));
        System.out.println("El valor ingresado en yenes es " 
                + (euros * 129.852));
    }
 
    
}
    

