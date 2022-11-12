package matrices4;

import java.util.Scanner;

public class Matrices4 {

    public static void main(String[] args) {
        //Declaracion de la Matriz de 20x5
        String [][] menu = new String [4][5];
        //Metodo para ingresar por teclado el menu
        Scanner sc = new Scanner(System.in);
        for (int f=0;f<menu.length;f++){
            for (int c=0;c<menu[0].length;c++){
                if (c==0){
                    System.out.println("Ingrese el plato principal "+(f+1));
                }
                else{
                    System.out.println("Ingrese la guarnicion "+c);
                }
                menu[f][c] = sc.next();
                
            }
        }
        
        //Metodo Eleccion de Plato
        System.out.println("*************************************************");
        System.out.println("***           MENU INTERACTIVO                ***");
        System.out.println("*************************************************");
        System.out.println("\n");
        for (int f=0;f<menu.length;f++){
            System.out.println((f+1)+") "+menu[f][0]);
        }
        System.out.println("Elija un Plato Principal: ");
        String plato = sc.next();
        //Busqueda del plato en la matriz
        
        if (existe(menu,plato)>0){
            System.out.println("Exelente eleccion, puedes acompañar tu plato con: ");
            for (int i=1;i<menu[0].length;i++){
                if (!"ninguna".equals(menu[indice(menu,plato)][i]))
                System.out.println(menu[indice(menu,plato)][i]);
            }
        }
        else{
            System.out.println("El plato que elejiste no esta disponible en el menu");
        }
                
                  
        
    }
    public static int existe(String m[][],String p){
        int x = 0;
        for (int f=0;f<m.length;f++){
            if ((m[f][0] == null ? p == null : m[f][0].equals(p))){
                x = 1;
                }
            }
        return (x); 
    }
     public static int indice (String m[][],String plato){
        int i = 0;
        for (int f=0;f<m.length;f++){
            if (plato == null ? m[f][0] == null : plato.equals(m[f][0])){
               i = f;
               break;
            }
        }
        return i;             
    }
        
        
    
    
}
