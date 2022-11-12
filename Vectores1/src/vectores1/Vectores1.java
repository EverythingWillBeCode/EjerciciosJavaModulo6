
package vectores1;

import java.util.Scanner;

public class Vectores1 {
        
  




  
    public static void main(String[] args) {
        int [] vector = new int [10];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<vector.length;i++){
              do{
                System.out.println("Ingrese un entero entre 1 y 100  para la posicion "+i);
                vector[i] = sc.nextInt();}
               while (vector[i]>100||vector[i]<1);}
       //Leer el Vector       
        for (int i=0; i<vector.length;i++){ 
            System.out.println("En La posicion "+(i));
            System.out.println(vector[i]);}
    }
    
    
}
