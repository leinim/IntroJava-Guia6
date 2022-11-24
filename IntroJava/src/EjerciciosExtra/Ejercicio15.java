/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float num1, num2, opcion, suma, resta, multiplicacion, division;
        
        
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextFloat();
        num2 = leer.nextFloat();
        
        do {
            System.out.println("MENU");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            opcion = leer.nextFloat();
            
        switch ((int) opcion) {
            case 1:
                suma = suma(num1, num2);
                System.out.println((int)num1 + "+" + (int)num2 + "=" 
                + (int)suma);
                break;
            case 2:
                resta = resta(num1, num2);
                System.out.println((int)num1 + "-" + (int)num2 + "=" 
                + (int)resta);
                break;
            case 3:
                multiplicacion = multiplicacion(num1, num2); 
                System.out.println((int)num1 + "*" + (int)num2 + "=" 
                + (int)multiplicacion);
                break;
            case 4:
                division = division(num1, num2);
                System.out.println((int)num1 + "/" + (int)num2 + "=" + division);
                break;
            case 5:
                System.out.println("Hasta pronto.");
                break;
            default:                 
                System.out.println("Opcion incorrecta. Intentelo nuevamente");
                break;
            }
        
        } while ((opcion > 0 || opcion < 5) && (opcion != 5));    
      
    }
    public static float suma(float num1, float num2){
        float suma;
        suma = num1 + num2;
        return suma;
    }
    public static float resta(float num1, float num2){
        float resta;
        resta = num1 - num2;
        return resta;
    }
    public static float multiplicacion(float num1, float num2){
        float multiplicacion;
        multiplicacion = num1 * num2;
        return multiplicacion;
    }
    public static float division(float num1, float num2){
        float division;
        division = num1 / num2;
        return division;
    }
}
