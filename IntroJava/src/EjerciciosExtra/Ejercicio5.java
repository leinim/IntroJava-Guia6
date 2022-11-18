/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package EjerciciosExtra;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

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
        String socio;
        
        double tarifaA = 30000;
        double tarifaB = 26500;
        int tarifaC = 18700;
        
        do {
        System.out.println("Ingrese su tipo de membresía (A, B o C)");
        socio = leer.next();
        }while (!socio.equalsIgnoreCase("a") && !socio.equalsIgnoreCase("b") && 
                !socio.equalsIgnoreCase("c"));
        
        switch (toLowerCase(socio)) {
            case "a":
                tarifaA -= (tarifaA * 0.50);
                System.out.println("El importe a pagar es " + tarifaA );
                break;
            case "b":
                tarifaB -= (tarifaB * 0.35);
                System.out.println("El importe a pagar es " + tarifaB );
                break;
            case "c":
                System.out.println("El importe a pagar es " + tarifaC);
                    
        }
    }
    
}
