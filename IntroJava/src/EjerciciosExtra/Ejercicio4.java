/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
                
        System.out.println("Ingrese un número entre el 1 y el 10");
        numero = leer.nextInt();
                       
        switch (numero) {
	    case 1:
		System.out.println("El uno en Romano es:I");
                break;
            case 2:
		System.out.println("El dos en Romano es:II");
                break;
            case 3:
		System.out.println("El tres en Romano es:III");
                break;
            case 4:
		System.out.println("El cuatro en Romano es:IV");
                break;
            case 5:
		System.out.println("El cinco en Romano es:V");
                break;
            case 6:
		System.out.println("El seis en Romano es:VI");
                break;
            case 7:
		System.out.println("El siete en Romano es:VII");
                break; 
            case 8:
		System.out.println("El ocho en Romano es:VIII");
                break;    
            case 9:
		System.out.println("El nueve en Romano es:IX");
                break; 
            case 10:
		System.out.println("El diez en Romano es:X");
                break;     
            default:
		System.out.println("Número inválido (fuera de rango)");
        }
    }
    
}
