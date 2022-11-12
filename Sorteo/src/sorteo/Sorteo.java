package sorteo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sorteo {

    
    public static void main(String[] args) throws ClassNotFoundException {
        Conexion conexion=new Conexion();
        conexion.conectar();
        Statement stmt;
        ResultSet rs; 
        List <Participante> listaParticipantes = new ArrayList<>();
        try {
            stmt = conexion.cx.createStatement();
            rs = stmt.executeQuery("SELECT * FROM participantes");
            rs.next();
            stmt.executeUpdate("DELETE FROM participantes WHERE NOT comento OR NOT compartio");
            rs = stmt.executeQuery("SELECT * FROM participantes");
            rs.next();
            do{
                var participante = new Participante(rs.getNString("nombre"),rs.getNString("apellido"),rs.getInt("edad"),rs.getBoolean("comento"),rs.getBoolean("compartio"));
                listaParticipantes.add(participante);
            }
            while(rs.next());
            System.out.println("***************************************");
            System.out.println("Recorrido del la Lista de Participantes");
            System.out.println("***************************************");
            for (Participante part:listaParticipantes){
                System.out.println(part.toString());}
            }       
        catch (SQLException ex) {
            Logger.getLogger(Sorteo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
