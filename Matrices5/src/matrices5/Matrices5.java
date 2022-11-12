package matrices5;

import java.util.concurrent.ThreadLocalRandom;

public class Matrices5 {


    public static void main(String[] args) {
        int [][] horas = new int [15][6];
        int [] horasExtra = new int [15];
        //Metodo para cargar la matriz
        int min_val = 10;
        int max_val = 240;
        for (int f=0;f<horas.length;f++){
            for (int c=0;c<horas[0].length;c++){
                ThreadLocalRandom tlr = ThreadLocalRandom.current();
                int randomNum = tlr.nextInt(min_val, max_val + 1);
                horas[f][c]= randomNum;
            }
        }
        for (int f=0;f<horas.length;f++){
            for (int c=0;c<horas[0].length;c++){
                System.out.println(horas[f][c]);
                }
            }
        
        for (int i=0;i<horasExtra.length;i++){
            horasExtra[i]=sumaExtras(horas,i);    
        }
        System.out.println("************************");
        System.out.println("Horas Extras");
        for (int i=0;i<horasExtra.length;i++){
            System.out.println("el Total de horas del empleado "+(i+1)+" es:"+horasExtra[i]);
        }
    }
    public static int sumaExtras (int m[][],int f){
        int suma = 0;
        for (int c=0;c<m[0].length;c++){
            suma = suma + extras(m,f,c);
        }
        return suma;
    }
    public static int extras (int m[][], int f, int c){
        int horas = ((m[f][c]-160));
        if (horas<1){
            horas = 0;
        } 
        return horas;    
    }
    
}
