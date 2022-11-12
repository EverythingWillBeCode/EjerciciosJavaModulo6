package matrices3;

import java.util.Scanner;

public class Matrices3 {

    public static void main(String[] args) {
        int [][] matriz = new int [4][4];
        for (int f=0;f<matriz.length;f++){
            for (int c=0;c<matriz[0].length;c++){
                if (f==c){ matriz[f][c] =  0;}
                else{ matriz[f][c] = 1;}
                
            }
        }
         System.out.println("Matriz de 4x4 con su diagonal en 0");
         System.out.println("**********************************");
        for (int f=0;f<matriz.length;f++){
            System.out.println(" "+matriz[f][0]+"    "+matriz[f][1]+"    "+matriz[f][2]+"    "+matriz[f][3]);
            System.out.println("");
        }
    }
    
}
