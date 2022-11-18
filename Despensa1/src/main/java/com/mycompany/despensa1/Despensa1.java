package com.mycompany.despensa1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Despensa1 {
       
    public static void main(String[] args) {
       String user ="root";
       String pass = "";
       String url ="jdbc:mysql://localhost:3306/productos";
       Connection con;
       Statement stmt;
       ResultSet rs;
       
       int codigo = 0;
       String nombre = "";
       String marca = "";
       double precio = 0;
       int cantidad_stock = 0;
       
       boolean salida = false;
       
       Scanner teclado = new Scanner(System.in);
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Despensa1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(url,user,pass);
            stmt = (Statement) con.createStatement();

            
            while (!salida) {
                
                System.out.print("Ingrese el nombre del producto (o ingrese 0 para salir): ");
                String nombre1 = teclado.nextLine();
                if (nombre1.equals("0")) {
                    salida = true;
                } else {                    
                    nombre = "'"+nombre1+"'";
                    
                    System.out.print("Ingrese la código del producto : ");
                    codigo = teclado.nextInt();
                    
                    String bashura = teclado.nextLine();
                    
                    System.out.print("Ingrese la marca del producto : ");
                    String marca1 = teclado.nextLine();
                    marca = "'"+marca1+"'";
                    
                    System.out.print("Ingrese precio del producto : ");
                    precio = teclado.nextDouble();
                    
                    System.out.print("Ingrese stock del producto : ");
                    cantidad_stock = teclado.nextInt();  
                    
                    String basura = teclado.nextLine();
                    
                    stmt.executeUpdate("INSERT INTO productos VALUES ("+codigo+", "+nombre+", "+marca+", "+precio+", "+cantidad_stock+");");
                    }
            }            
        } catch (SQLException ex) {
            Logger.getLogger(Despensa1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
