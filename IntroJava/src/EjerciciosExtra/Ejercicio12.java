/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        String i3, j3, k3, codigo;
        
        codigo = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    i3 = String.valueOf(i);
                    j3 = String.valueOf(j);
                    k3 = String.valueOf(k);                                       
                    
                    if (i3.equals("3")) {
                        i3 = "E"; 
                    }                         
                    
                     if (j3.equals("3")) {
                        j3 = "E";                        
                    }   
                     
                    if (k3.equals("3")) {
                        k3 = "E";                      
                    }
                    
                    codigo = i3 + "-" + j3 + "-" + k3;
                    System.out.println(codigo);
                }
            }
        }
        
       
        
    }
    
}
