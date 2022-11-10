/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero 
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo 
no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package egg.introjava.manosalaobra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, suma, contador;
        
        suma = 0;
        contador = 0;
        do {
            System.out.println("Ingrese un numero entero");
            num = leer.nextInt();
            if (num > 0) {
                suma += num;
                
            }else if (num == 0) {
                System.out.println("Se capturó el número 0");
                break;
            }
            contador += 1; /*el contador sirve para que el usuario no ingrese 
                           mas de 20 numeros */
            
        } while(contador < 20);//0 a 19 (20 iteraciones)
        
        System.out.println("La suma de los números ingresados mayores a 0 es: "
                + suma);
            
    }
    
}
