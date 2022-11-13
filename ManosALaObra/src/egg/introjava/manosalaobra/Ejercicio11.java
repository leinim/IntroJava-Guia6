/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package egg.introjava.manosalaobra;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Mile
 */
public class Ejercicio11 {

  
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in); 
        String frase;
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();       
        
        String retorno = cod(frase);
        
        System.out.println("La frase es: " + frase);
        System.out.println("La frase codificada es: " + retorno);
    }
 public static String cod(String frase) {
    String frase2;
    int i;
    
    frase2 = " ";
    
    for (i = 0; i < frase.length() ; i++ ) {
      switch ((toLowerCase(frase.substring(i, i+1)))) {
          case "a":
              frase2 += "@";
              continue;
          case "e":
              frase2 += "#";
              continue;
          case "i":
              frase2 += "$";
              continue;
          case "o":
              frase2 += "%";
              continue;
          case "u":
              frase2 += "*";
              continue;
          default:
              frase2 += frase.substring(i, i+1);
      }
              
    }
    
        return frase2;

    }
   
    }
    
   



