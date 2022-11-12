
package sorteo;


public class Participante {
    String nombre;
    String apellido;
    int edad;
    boolean comento;
    boolean compartio;

    public Participante() {
    }

    public Participante(String nombre, String apellido, int edad, boolean comento, boolean compartio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.comento = comento;
        this.compartio = compartio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isComento() {
        return comento;
    }

    public void setComento(boolean comento) {
        this.comento = comento;
    }

    public boolean isCompartio() {
        return compartio;
    }

    public void setCompartio(boolean compartio) {
        this.compartio = compartio;
    }

    @Override
    public String toString() {
        return "Participante{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    
    
    
    
}
