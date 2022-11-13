/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros");
        int num1, num2;
               num1=leer.nextInt();
               num2=leer.nextInt();
        String salida = " ";
        int opcion = 0;
                
        do{
            System.out.println("-- MENU --");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");
            opcion= leer.nextInt();
            switch (opcion){ 

                case 1: 
                    System.out.println("La suma de los números es: "
                            + (num1+num2) );
                    break;
                case 2:
                    System.out.println("La resta de los números es: "
                            + (num1-num2));
                    break;
                case 3: 
                    System.out.println("La multiplicación de los números"
                            + (num1*num2));
                    break;
                case 4: 
                    System.out.println("La division de los números es: "
                            + (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Quiere salir del programa? (S/N)");
                    salida= leer.next();
                    break;
                default:
                    System.out.println("Opcion Incorrecta, intente de nuevo!!");
            }
        }while ((salida.equals("N")) && (opcion  >= 1 || opcion <= 5 ));
    }
    
}
