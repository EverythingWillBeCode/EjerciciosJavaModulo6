package vectores4;

import java.util.Arrays;
import java.util.Scanner;
public class Vectores4 {

    public static void main(String[] args) {
        int [] temp = new int [23];
        int [] maximas = new int [5];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<temp.length;i++){
              do{
                System.out.println("Ingrese la temperatura para la provinicia "+(i+1));
                temp[i] = sc.nextInt();}
               while (temp[i]>60);}
       //Ordena el Arreglo de menor a Mayor
        Arrays.sort(temp);
        for (int i=0;i<maximas.length;i++){
            maximas[i]=temp[(temp.length-(i+1))];
        }
            
        for (int i=0; i<maximas.length;i++){ 
            System.out.println("En La posicion "+(i));
            System.out.println(maximas[i]);}
    }
    
    public static void ordenar (int t[]){
        int n = 0;
        int comp = 0;
        while (n<24){
            for (int i=0; i<(t.length-1);i++){
                if (t[i]<t[(i+1)]){
                    comp = t[i];
                    t[i] = t[(i+1)];
                    t[(i+1)] = comp;
                    
                }
             n++;
            }
            
        }
                
    }
    
}
