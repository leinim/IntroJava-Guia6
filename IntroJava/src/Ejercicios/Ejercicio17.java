/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String j = "";
        int cont1, cont2, cont3, cont4, cont5;
        String num;
        
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        
        for (int i = 0; i < n; i++) {             
            System.out.println("Ingrese números de entre 1 y 5 dígitos");
            vector[i] = leer.nextInt();
            
            j = String.valueOf(vector[i]);
                     
                      
            switch (j.length()) {
                case 1:
                    cont1 += 1;
                    break;
                case 2:  
                    cont2 += 1;
                    break;
                case 3:
                    cont3 += 1;
                    break;
                case 4:
                    cont4 += 1;
                    break;
                case 5:
                    cont5 += 1;
                    break;
                default:
                    System.out.println("El número ingresado es inválido");
                    break;
                
            }
        }
            
        System.out.println("Números de 1 dígito: " + cont1);
        System.out.println("Números de 2 dígitos: " + cont2);
        System.out.println("Números de 3 dígitos: " + cont3);
        System.out.println("Números de 4 dígitos: " + cont4);
        System.out.println("Números de 5 dígitos: " + cont5);
   
        
        
        
    }
    
}
