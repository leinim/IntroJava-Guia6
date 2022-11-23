/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double num1, num2, respuesta;
        
        num1 = Math.floor(Math.random()* 10);
        num2 = Math.floor(Math.random()* 10);
        
        System.out.println("¿Cuánto es " + num1 + " * " + num2 + "?");
        respuesta = leer.nextInt();
        while (respuesta != num1 * num2) {
            System.out.println("Incorrecto. Intentalo nuevamente.");
            respuesta = leer.nextInt();
        }
        
        System.out.println("Correcto. El resultado es " + respuesta);
        
    }
    
}
