/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package egg.introjava.manosalaobra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Ingrese dos números enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        EsMultiplo(num1, num2);
    }
    
    
    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("Son múltiplos");            
        } else {
            System.out.println("No son múltiplos");
        }
    }
    
}
