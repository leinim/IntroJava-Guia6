/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package egg.introjava.manosalaobra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio13y14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[] equipo = new String[6];
        String nombre;
        
        System.out.println("Ingrese los nombres");
        for (int i = 0; i < 6; i++) {
            equipo[i] = leer.nextLine();   
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.print("[" + equipo[i] + "]");   
        }
        
        
    }
    
}
