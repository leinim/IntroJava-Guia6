/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, digitos;
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        digitos = 0;
        do {
            num /= 10;
            digitos++;
        } while (num % 10 != 0 || num == 10);
        
        System.out.println("Digitos: " + digitos);
    }
    
      
}
