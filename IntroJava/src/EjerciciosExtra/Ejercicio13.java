/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int altura, i, j;
        
        System.out.println("Ingrese la altura de la escalera");
        altura = leer.nextInt();
        
        for ( i = 1; i <= altura; i++){
            for (j = 1; j <= i; j++){
                System.out.print(j);
                
            }
            System.out.println("");
        }
            
    }
    
}
