/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        String palabra;
        String FDE = "&&&&&";
        int cont1 = 0;
        int cont2 = 0;
        int i=0;
        
        do{
            
        System.out.println("Ingrese el mensaje");
        palabra = leer.nextLine();
        i = palabra.length();
        
         if(palabra.substring(0,1).equals("x") && palabra.substring(i-1,i).equals("o") 
                && i<=5 ){
            cont1 += 1;
            
            
         }else{
            cont2 += 1;
        }
        
        }while (!palabra.equals(FDE));
        
        System.out.println("La cantidad de lecturas correctas son: "+ cont1);
        System.out.println("La cantidad de lecturas incorrectas son: "+ (cont2-1));
    }

}
    

