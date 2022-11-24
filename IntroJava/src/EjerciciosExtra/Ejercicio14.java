/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, m, edad, promedio, cont, i, j;
        
        System.out.println("Ingrese la cantidad de familias");
        n = leer.nextInt();
        
        cont = 0;
        
        
        
        for (i = 1; i <= n; i++){
            System.out.println("Ingrese la cantidad de hijos de la familia "
                    + "numero " + i);
            m = leer.nextInt();
            for (j = 1; j <= m; j++){
                System.out.println("Ingrese la edad del hijo numero "
                +  j);
                edad = leer.nextInt();
                
                cont += edad;
                
            }
            promedio = cont/m;
            System.out.println("El promedio de edad de los hijos de la familia "
            + "numero " + i + " es " + promedio + " años.");
            cont = 0;            
            promedio = 0;
        }
        
    }
    
}
