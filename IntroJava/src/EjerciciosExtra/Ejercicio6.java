/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double altura, sumaBajo, sumaGeneral, promedioBajo, promedioGeneral, 
        contBajo, contGeneral, N;
                
        System.out.println("Ingrese la cantidad de personas");
        N = leer.nextInt();
        
        contBajo = 0;
        contGeneral = 0;
        sumaBajo = 0;
        sumaGeneral = 0;
        
        
        for (int i = 1; i <= N; i++){
            System.out.println("Ingrese la altura de la persona " + i);
            altura = leer.nextDouble();
            if (altura < 1.60) {
                contBajo += 1;
                sumaBajo += altura;
            }
            contGeneral += 1;
            sumaGeneral += altura;
        }
        promedioBajo = sumaBajo / contBajo;
        promedioGeneral = sumaGeneral / contGeneral;
        
        System.out.println("Promedio de altura de las personas con altura menor "
                + "a 1.60 metros: " + promedioBajo);
        System.out.println("Promedio de altura de todas las personas: " 
                + promedioGeneral );
        
    }
    
}
