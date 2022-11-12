
package vectores3;

import java.util.Scanner;

public class Vectores3 {

   
    public static void main(String[] args) {
        int [] dni = new int [3];
        String [] nombre = new String [3];
        String [] apellido = new String [3];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<dni.length;i++){
              
                System.out.println("Ingrese el dni para el registro "+(i+1));
                dni[i] = sc.nextInt();
                System.out.println("Ingrese el nombre para el registro "+(i+1));
                nombre[i] = sc.next();
                System.out.println("Ingrese el apellido para el registro "+(i+1));
                apellido[i] = sc.next();
              }
              
         
       //Leer el Vector       
        for (int i=0; i<dni.length;i++){ 
            System.out.println("En La posicion "+(i));
            System.out.println("DNI: "+(dni[i]));
            System.out.println("Nombre: "+(nombre[i]));
            System.out.println("Apellido: "+(apellido[i]));
            }
    }
    
}
