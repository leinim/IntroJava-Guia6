/*
Escriba un programa que valide si una nota está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota 
sea correcta.
 */
package egg.introjava.manosalaobra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double nota;
        
        System.out.println("Ingrese la nota");
        nota = entrada.nextInt();
        
        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese una nota válida (0 a 10)");
            nota = entrada.nextDouble();
        }
    }
    
}
