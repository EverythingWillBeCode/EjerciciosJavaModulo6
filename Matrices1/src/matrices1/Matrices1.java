package matrices1;

import java.util.Scanner;

public class Matrices1 {

    public static void main(String[] args) {
        // Declaracion de Matriz de 5 filas x 3 columnas
        int [][] goles = new int [5][3];
        float [] promedio = new float [5];
        // Carga de Matriz
        Scanner sc = new Scanner(System.in);
        for(int f=0;f<5;f++){
            for (int c=0;c<3;c++){
                System.out.println("Ingresa la cantidad de goles del jugador "+(f+1)+" en el partido "+(c+1));
                goles[f][c] = sc.nextInt();
                
            }
        }
        // Metodo para pasar el promedio de goles a un Array
        for (int i=0;i<promedio.length;i++){
            promedio[i] = promediofila(goles,i);}
            
        
    
        // Metodo para imprimir el Array
        for (int i=0;i<promedio.length;i++){
            System.out.println("El promedio de jugador "+(i+1)+" es: "+promedio[i]);
        }
        }
        // Metodo para devolver el promedio de la fila
        public static float promediofila(int m[][],int f){
            int suma = 0;
            for (int c=0;c<3;c++)
                suma = suma + m[f][c];
            return (float) (suma)/3;
        }
            
            
        
                
            
            
            
    
    
}
