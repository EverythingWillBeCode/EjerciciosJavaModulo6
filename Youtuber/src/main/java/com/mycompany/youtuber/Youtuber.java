package com.mycompany.youtuber;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Youtuber {
   
    public static void main(String[] args) throws ClassNotFoundException {
        Statement stmt;
        ResultSet rs; 
        Conexion conexion;
        conexion= new Conexion();
        conexion.conectar();
        List <Video> listaVideos = new ArrayList<>();
        try {
            stmt = conexion.cx.createStatement();
            rs = stmt.executeQuery("SELECT * FROM videos");
            rs.next();
            do {
                var video = new Video(rs.getString("codigo"),rs.getString("nombre"),rs.getDate("creacion"),rs.getDate("subida"),rs.getTime("duracion"));
                listaVideos.add(video);
               }
            while(rs.next());
            System.out.println("********************************");
            System.out.println("Recorrido del la Lista de Videos");
            System.out.println("********************************");
            for (Video vid:listaVideos){
                System.out.println(vid.toString());
        }
        } catch (SQLException ex) {
            Logger.getLogger(Youtuber.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
