package auto;

import java.util.Scanner;
import java.util.Stack;

public class Auto {

    String patente;
    String marca;
    String modelo;
    String color;
    String chasis;

    public Auto(String patente, String marca, String modelo, String color, String chasis) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.chasis = chasis;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }
    
     
    public static void main(String[] args) {
        Stack<Auto> pilaAutos = new Stack<Auto>();
        pilaAutos.push(new Auto("AC133KA","Toyota","Hilux","Gris","AF87548984C"));
        pilaAutos.push(new Auto("AD412AA","Ford","Focus","Blanco","AG21265498A"));
        pilaAutos.push(new Auto("AA125LM","Chevrolet","Corsa","Negro","AF12245879C"));
        pilaAutos.push(new Auto("AB487TS","Toyota","Corolla","Gris","CJ15384798B"));
        pilaAutos.push(new Auto("AA991CD","Ford","Ranger","Rojo","AZ85963174M"));
        pilaAutos.push(new Auto("AB125PO","Peugeot","Partner","Blanco","CF51897645A"));
        pilaAutos.push(new Auto("AC110BB","Volkswagen","Vento","Gris","FF58749612C"));
        
        //Recorrido de la pila
        
        for (Auto p:pilaAutos){
            System.out.println(p);
        }
        //Busequeda de auto color rojo
        System.out.println("Busqueda de auto Rojo");
        System.out.println(pilaAutos.search("Rojo"));
        System.out.println(pilaAutos.peek());
        //EKIMINAR EL AUTO DEL TOPE
        pilaAutos.pop();
        //AGREGAR 2 AUTOS A LA PILA
        System.out.println("*************************");
        System.out.println("Agregar 2 autos a la pila");
        System.out.println("*************************");
        Scanner sc = new Scanner(System.in);
        for (int i=1;i<3;i++){
            System.out.println("Ingresa los Datos del auto "+i);
            System.out.println("Patente: ");
            String patente = sc.next();
            System.out.println("Marca: ");
            String marca = sc.next();
            System.out.println("Modelo: ");
            String modelo = sc.next();
            System.out.println("Color: ");
            String color = sc.next();
            System.out.println("Chasis: ");
            String chasis = sc.next();
            pilaAutos.push(new Auto(patente,marca,modelo,color,chasis));
        }
        for (Auto p:pilaAutos){
            System.out.println(p.getModelo());
        }
        
    }
    
}
