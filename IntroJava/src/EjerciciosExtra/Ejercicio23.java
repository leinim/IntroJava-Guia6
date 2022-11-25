/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        
        String palabras;
        int fila, l, k;
        
        l = 0;
        k = 0;
        System.out.println("Ingrese cinco palabras de entre 3 y 5 caracteres:");
        do {     
                                     
            for (int i = 0; i < 5; i++) { 
                fila = (int) (Math.floor(Math.random()*19));
                palabras = leer.nextLine();
                for (int j = 0; j < palabras.length(); j++){                    
                        
                    sopa[fila][j] = palabras.substring(k, k + 1);
                    k++; 
                }
                
                k = 0;
                l++;                
            }                        
        } while (l < 5);   
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++){
                
            if (sopa[i][j] == null) {
                sopa[i][j] = String.valueOf((int)Math.floor
                (Math.random()*9));
                }
            
            }                
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++){
                System.out.print("[" + sopa[i][j] + "]");  
            }
            System.out.println("");
        }                
    } 
}
