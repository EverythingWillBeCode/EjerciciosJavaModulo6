package vectores5;

import java.util.Scanner;

public class Vectores5 {

    public static void main(String[] args) {
        String [] animales = new String [10];
        String [] oi = new String [10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<animales.length;i++){
            System.out.println("Ingrese un Animal");
            animales[i] = sc.next();}
        //copiar valores en orden inverso
        for (int i=0;i<oi.length;i++){
            oi[(i)] = animales[(animales.length-(i+1))];
            
        }
        //imprimir los dos arreglos
        for (int i=0;i<animales.length;i++){
            System.out.println(animales[i]+" "+oi[i]);
        }
    }
    
}
