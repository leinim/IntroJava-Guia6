/*
Escribir un programa que lea un número entero por teclado 
y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, doble, triple;
        double raiz;
        
        System.out.println("Ingrese un numero entero");
        num = leer.nextInt();
        
        doble = num * 2;
        triple = num * 3;
        raiz = Math.sqrt(num);
        
        System.out.println("El número ingresado es " + num);
        System.out.println("Doble: " + doble);
        System.out.println("Triple: " + triple);
        System.out.println("Raiz: " + raiz);
                
        
        
    }
    
}
