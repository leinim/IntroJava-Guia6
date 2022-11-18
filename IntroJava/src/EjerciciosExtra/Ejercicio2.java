/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int A, B, C, D;
        int i = 0;
        
        System.out.println("Ingrese cuatro numeros enteros");
        A = leer.nextInt();
        B = leer.nextInt();
        C = leer.nextInt();
        D = leer.nextInt();
        
        System.out.println("A="+ A + ";B=" + B + ";C=" + C + ";D=" + D);
        
        //b=c, c=a, a=d, d=b
        i = B;
        B = C;
        C = A;
        A = D;
        D = i;
        
        System.out.println("A="+ A + ";B=" + B + ";C=" + C + ";D=" + D);        
        
    }
    
}
