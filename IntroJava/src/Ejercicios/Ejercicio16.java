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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        double vector[]= new double[tam];
        int cont=0;
        int i,j;
        
        for (i = 0; i < tam; i++) {
            
            vector[i]=Math.floor(Math.random()*10);
        }
         System.out.println("Ingrese un número a buscar");
          int buscar = leer.nextInt();
        j=0;
        for (i = 0; i < tam; i++) {
            if (vector[i]==buscar ) {
                cont +=1;
                j=i;    
            }
         }
        System.out.println("El número se encuentra en la posición "+ j 
                + " y la cantidad de veces que se repite es "+ cont);
       
        for (i = 0; i < tam; i++){
            System.out.println("["+vector[i]+"]");
        }

    }
    
}
