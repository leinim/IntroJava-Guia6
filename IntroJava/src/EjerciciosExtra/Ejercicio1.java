/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int horas, dias;
        
        System.out.println("Ingrese la cantidad de minutos");
        int minutos = leer.nextInt();
        
        //1 * 60 * 24
        if (minutos < 1440) {
            horas = (int) Math.floor(minutos / 60);
            minutos -= horas * 60;
            System.out.println("Los minutos ingresados equivalen a " + horas 
                    + " hora/s y " + minutos + " minuto/s.");
        } else if (minutos == 1440) {
            System.out.println("Los minutos ingresados equivalen a 1 día.");
                        
        } else if (minutos > 1440) {
            dias = (int) Math.floor(minutos / 1440);
            horas = (minutos - 1440) / 60;
            minutos -= 1440 + (horas*60);
            System.out.println("Los minutos ingresados equivalen a " + dias + " dia/s " + horas + " hora/s y " + minutos + " minuto/s.");
           
            
        }
        
    }
    
}
