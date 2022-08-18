package Modelos;

public class deportes {
    
    // Atributos
    String nombre;
    int tiempo;
    String x;
    
    // un constructor es un metodo especial para inicializar los objetos
    public deportes(){
        nombre ="";
        tiempo = 0;
    }
    
    public deportes(String nombre){
        this.nombre = nombre;
    }
    
    public deportes(String name, int time, String x){
        this.nombre = name;
        this.tiempo = time;
        this.x = x;
    }
    
    public static void main(String[] args) {
        deportes d = new deportes();
        d.nombre = "Americano";
        d.tiempo = 15;
        System.out.println("El nombre del deporte es: " + d.nombre+ " con una duración de " + d.tiempo + " minutos por cuarto");
        deportes d2 = new deportes("Tenis");
        
        System.out.println(d2.nombre);
        
        deportes d3 = new deportes("Softball", 30, "Femenil");
        
        System.out.println("Categoria: " + d3.x);
    }
}