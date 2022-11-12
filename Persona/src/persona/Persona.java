package persona;

import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.List;

public class Persona {
    
    int dni;
    String nombre;
    String apellido;
    String direccion;
    String celular;
    int edad;

    public Persona(int dni, String nombre, String apellido, String direccion, String celular, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.celular = celular;
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    public static void main(String[] args) {
        
        List <Persona> listaPersonas = new LinkedList<Persona>();
        
        //Carga Manual de la listaPersonas
        listaPersonas.add(new Persona(27599129,"Marcos","Iglesias","23 de Agosto 331","2235308131",42));
        listaPersonas.add(new Persona(28063745,"Paula","Ibanez","23 de Agosto 331","3874754255",41));
        listaPersonas.add(new Persona(50511301,"Luz","Iglesias","23 de Agosto 331","3886543123",12));
        listaPersonas.add(new Persona(52503103,"Benicio","Iglesias","23 de Agosto 331","3886534215",9));
        listaPersonas.add(new Persona(8588857,"Alberto","Iglesias","48 N 1378","387668630",72));
        listaPersonas.add(new Persona(12880264,"Marta","Miranda","Guemes 745","2235314999",61));
        listaPersonas.add(new Persona(27445128,"Juan","Perez","JB Justo 1488","1155333518",41));
        listaPersonas.add(new Persona(28063745,"Pamela","Gomez","Peru 38","3874445253",29));
        listaPersonas.add(new Persona(40505157,"Luis","Torres","Libertad 85","3516543142",19));
        listaPersonas.add(new Persona(52503103,"Bernarda","Gimenez","Maipu 995","3815162517",24));
        listaPersonas.add(new Persona(8588857,"Ariel","Enriquez","San Martin 523","2215478536",38));
        listaPersonas.add(new Persona(40623014,"Maria","Lopez","La Paz 31","1151475931",18));
        listaPersonas.add(new Persona(23507011,"Leandro","Lopez","Jujuy 333","1165445819",46));
        listaPersonas.add(new Persona(28063745,"Pedro","Ibanez","Neuquen 9","3885255514",71));
        listaPersonas.add(new Persona(50905509,"Lucas","Barrios","Los Alamos 15","2291654128",11));
        listaPersonas.add(new Persona(33874125,"Javier","Bodega","23 de Agosto 331","3886534215",36));
        listaPersonas.add(new Persona(18441578,"Alicia","Fernandez","Salta 640","388568138",53));
        listaPersonas.add(new Persona(21123654,"Marcela","Sandes","Guemes 745","2235314999",50));
        listaPersonas.add(new Persona(41058591,"Lorena","Guitierrez","Alberdi 13","387668630",22));
        listaPersonas.add(new Persona(33612002,"Miguel","Luna","Juan Jose Paso 780","2234231288",27));
        
        //Crear Lista Mayores y Menores
        
        List <Persona> listaMenores = new LinkedList<Persona>();
        List <Persona> listaMayores = new LinkedList<Persona>();
        
        //Recorrer la lista y agregar a listaMayores o lista Menores segun corresponda
        
        for (Persona p : listaPersonas){
            if (p.getEdad()<18){
                listaMenores.add(new Persona(p.getDni(),p.getNombre(),p.getApellido(),p.getDireccion(),p.getCelular(),p.getEdad()));
            }
            else{
                listaMayores.add(new Persona(p.getDni(),p.getNombre(),p.getApellido(),p.getDireccion(),p.getCelular(),p.getEdad()));
            }
        }
        
        //Recorrer e imprimr la lista de Mayore y Menores
        System.out.println("********************************");
        System.out.println("Listado de Personas Menores");
        System.out.println("********************************");
        for (Persona p: listaMenores){
            System.out.println(p.getNombre()+" "+p.getApellido()+" "+p.getEdad());
        }
        System.out.println("********************************");
        System.out.println("Listado de Personas Mayores");
        System.out.println("********************************");
        for (Persona p: listaMayores){
            System.out.println(p.getNombre()+" "+p.getApellido()+" "+p.getEdad());
        }
        
        
                
    }
    
}
