/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package EjerciciosExtra;

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
        int n;
        String persona, opcion;
        
        
        do {
            persona = persona();
            System.out.println(persona);
            System.out.println("¿Desea continuar?");
            opcion = leer.nextLine();
        } while (!opcion.equalsIgnoreCase("no"));
        
        System.out.println("Hasta pronto.");
        
        
    }
    public static String persona(){
        Scanner leer = new Scanner(System.in);
        int edad;
        String nombre;
        System.out.println("Ingrese el nombre:");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad:");
        edad = leer.nextInt();
        if (edad < 18) {
            return "Nombre:" + nombre + ". Edad:" + edad + ". Menor de edad."; 
        } else {
            return "Nombre:" + nombre + ". Edad:" + edad + ". Mayor de edad.";
        }
            
        
    }
}
