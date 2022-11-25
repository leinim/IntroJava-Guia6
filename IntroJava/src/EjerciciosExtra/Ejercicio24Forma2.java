/*
Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio24Forma2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, n1, n2, n3, i;
        
        System.out.println("Ingrese el término n de la sucesión:");
        n = leer.nextInt();
        int[] vector = new int[n];
        
        
        n1 = 1;
        n2 = 1;    
        n3 = 0;
        for (i = 0; i < n; i++) {
            if (i < 2) {
                vector[i] = 1;                
            } else { 
                n3 = n1 + n2;
                vector[i] = n3;
                n1 = n2;
                n2 = n3;                              
            }            
        }
        
        for (i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
            
        }
        
    }
    
}
