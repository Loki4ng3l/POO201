package Modelos;

public class frutas {
    String nombre = "Sandia";
    String magnitud = "piezas";
    String color = "rojo/verde";
    
    public static void main(String[] args) {
        // un objeto por medio de una instancia
        mascota m = new mascota();
        mascota araceli = new mascota();
        
        araceli.tipo = "Pato";
        
        // modificar atributos
        m.tipo = "Gato";
        
        System.out.println(araceli.tipo);
    }
}