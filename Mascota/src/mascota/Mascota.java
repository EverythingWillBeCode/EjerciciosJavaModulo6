package mascota;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mascota {
    
    String nombre;
    String especie;
    String sexo;
    String color;
    String pelaje;
    String raza;

    public Mascota(String nombre, String especie, String sexo, String color, String pelaje, String raza) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.color = color;
        this.pelaje = pelaje;
        this.raza = raza;
    }

    private Mascota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getSexo() {
        return sexo;
    }

    public String getColor() {
        return color;
    }

    public String getPelaje() {
        return pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    

    
    public static void main(String[] args) {
        List <Mascota> listaMascotas = new ArrayList<Mascota>();
        listaMascotas.add(new Mascota("Toto","Perro","Macho","Beige","Largo","Labrador"));
        listaMascotas.add(new Mascota("Negro","Perro","Macho","Negro","Largo","Mestizo"));
        listaMascotas.add(new Mascota("Nahir","Gato","Hembra","Blanco","Corto","Domestico"));
        listaMascotas.add(new Mascota("Tomasa","Gato","Hembra","Gris","Corto","Domestico"));
        listaMascotas.add(new Mascota("Blanco","Perro","Macho","Blanco","Largo","Mestizo"));
        
        for (Mascota m : listaMascotas) {
            System.out.println("Nombre: "+ m.getNombre());
            System.out.println("Especie: "+ m.getEspecie());
            System.out.println("Pelaje: "+ m.getPelaje());      
        }
        
        System.out.println("**************************************");
        System.out.println("**************************************");
        System.out.println("**************************************");
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<listaMascotas.size();i++) {
            System.out.println("Mascota "+(i+1)+" de "+listaMascotas.size());
            System.out.println(listaMascotas.get(i).getEspecie()+" "+listaMascotas.get(i).getNombre());
            System.out.println("Desea cambiar el nombre de esta mascota?");
            String respuesta = sc.next();
            if ("si".equals(respuesta)){
                System.out.println("Ingrese el nuevo nombre");
                listaMascotas.get(i).setNombre(sc.next());
            }
        }
        for (Mascota m : listaMascotas) {
            System.out.println("Nombre: "+ m.getNombre()); 
        }
        System.out.println("**************************************");
        System.out.println("**************************************");
        System.out.println("**************************************");
        System.out.println("Agregar dos Mascotas nuevas");
        for (int i=1;i<3;i++){
            System.out.println("Ingrese los datos de la mascota"+(i));
            System.out.println("Nombre: ");
            String nombre = sc.next();
            System.out.println("Especie:");
            String especie = sc.next();
            System.out.println("Sexo:");
            String sexo = sc.next();
            System.out.println("Color:");
            String color = sc.next();
            System.out.println("Pelaje");
            String pelaje = sc.next();
            System.out.println("Raza:");
            String raza = sc.next();
            listaMascotas.add(new Mascota(nombre,especie,sexo,color,pelaje,raza));
            
        }
        for (Mascota m : listaMascotas) {
            System.out.println("Nombre: "+ m.getNombre()); 
        }
        System.out.println("**************************************");
        System.out.println("**************************************");
        System.out.println("**************************************");
        
        System.out.println("Nombres de las Mascotas Perrunas");
        for (Mascota m : listaMascotas) {
            if ("Perro".equals(m.getEspecie())){
               // System.out.println("Nombre: "+ m.getEspecie());
                System.out.println("Nombre: "+ m.getNombre()); 
            }
        }
    }
    
}
