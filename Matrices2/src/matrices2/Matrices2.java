package matrices2;

import java.util.Scanner;

public class Matrices2 {

     public static void main(String[] args) {
         //Declaracion de Matriz 10x4
         double [][] notas = new double [10][4];
         double nota = 0; 
         //metodo para cargar las notas
         Scanner sc = new Scanner(System.in);
         for (int f=0;f<notas.length;f++){
             for (int c=0;c<notas[0].length-1;c++){
                 System.out.println("Ingrese la nota "+(c+1)+" de alumno "+(f+1));
                 nota=sc.nextDouble();
                 if (0<nota&&nota<11){
                     notas[f][c]=nota;
                 }
                 else{
                     System.out.println("Nota fuera de rango, por favor ingrese una nota entre 1 y 10");
                     c--;
                 }
             }
         }
         //Metodo para cargar el promedio de notas en la Matriz
         for (int f=0;f<notas.length;f++){
             notas[f][3] = promediofila(notas,f);
             
         }
         //Metodo para imprimir la Matriz
         for (int f=0;f<notas.length;f++){         
                 System.out.println("Alumno: "+(f+1));
                 System.out.println("Nota 1: "+notas[f][0]);
                 System.out.println("Nota 2: "+notas[f][1]);
                 System.out.println("Nota 3: "+notas[f][2]);
                 System.out.println("Promedio: "+notas[f][3]);
                 System.out.println("****************************");
                 
         }
         
             
         
         
                 
    }
    // Metodo para devolver el promedio de la fila
        public static float promediofila(double m[][],int f){
            double suma = 0;
            for (int c=0;c<3;c++)
                suma = suma + m[f][c];
            return (float) (suma)/3;
    }
}
