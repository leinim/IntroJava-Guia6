/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio7While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int N, num, maximo, minimo, cont, suma;
        float promedio;
        
        System.out.println("Ingrese la cantidad de números");
        N = leer.nextInt();  
        
        while (N < 1) {
           System.out.println("Ingrese la cantidad de números");
           N = leer.nextInt();
        }
        
        
        maximo = 0;
        minimo = 0;
        cont = 0;
        suma = 0;
        System.out.println("Ingrese " + N + " números");
            num = leer.nextInt();
            minimo = num;
        for (int i = 2; i <= N; i++) {
            num = leer.nextInt();
            cont += 1;
            suma += num;
            if (maximo < num) {
                maximo = num;
            }
            if (minimo > num) {
                minimo = num;
            }
        }
        promedio = suma / cont;
        System.out.println("Máximo=" + maximo + "; Mínimo=" + minimo 
                + "; Promedio=" + promedio);
    }
    
}
