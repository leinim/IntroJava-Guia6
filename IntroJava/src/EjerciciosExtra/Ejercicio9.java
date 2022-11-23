/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2, residuo, cociente;
        
        System.out.println("Ingrese el dividendo");
        num1 = leer.nextInt();
        System.out.println("Ingrese el divisor");
        num2 = leer.nextInt();
        
        residuo = 0;
        cociente = 0;
        
        if (num1 == num2) {
            residuo = 0;
            cociente = 1;
        } else {
            do {
               residuo = num1 - num2;
               num1 -= num2;
               cociente++;
            } while (residuo >= num2);
        }
        
        System.out.println("Resto: " + residuo);
        System.out.println("Cociente: " + cociente);
        
    }
    
}
