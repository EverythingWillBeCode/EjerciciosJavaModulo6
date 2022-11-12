
package vectores2;

import java.util.Scanner;

public class Vectores2 {

    public static void main(String[] args) {
        int [] edades = new int [15];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<edades.length;i++){
              do{
                System.out.println("Ingrese la edad del estudiante "+(i+1));
                edades[i] = sc.nextInt();}
               while (edades[i]>100);}
       //Leer el Vector       
        for (int i=0; i<edades.length;i++){ 
            System.out.println("En La posicion "+(i));
            System.out.println(edades[i]);}
        System.out.println("El esudiante de menor edad tiene "+(menor(edades))+" años");
        System.out.println("El estudiante de mayor edad tiene "+mayor(edades)+" años");
    }
    public static int menor (int ages[]){
        int e = ages[0];
        for (int i=1; i<ages.length;i++){
            if (e>ages[i]){
                e=ages[i];
            }}
         return e;   
        }
        public static int mayor (int ages[]){
        int e = ages[0];
        for (int i=1; i<ages.length;i++){
            if (e<ages[i]){
                e=ages[i];
            }}
         return e;   
        }
        
    }
    

