
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        boolean conf = false;
        int inc = 0;
        int incont = 0;
        int matrizA[][] = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
        {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
        {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
        {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
        {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
        {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
        {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
        {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
        {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
        {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        int matrizN[][] = {{36, 5, 67,}, {89, 90, 75}, {14, 22, 26}};

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizN[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizA[i][j] == matrizN[0][0]) {
                    cont++;
                    inc = j;
                    incont = j + 3;
                    if (i < 8 && j < 8) {
                        for (int k = 0; k < 3; k++) {

                            for (int l = 0; l < 3; l++) {

                                if (matrizA[i][j] == matrizN[k][l]) {
                                    cont++;
                                    if (cont != 2) {
                                        System.out.println(i + "," + j);
                                        conf = true;
                                    }
                                    j++;
                                    if (j == incont) {

                                        i++;
                                        j = inc;

                                    }
                                    
                                }
                            }
                        }
                    }
                }
            }

        }
        System.out.println(conf);
    }
}
