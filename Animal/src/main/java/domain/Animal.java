package domain;

public class Animal {
    //Atributos
    private String nombre;
    private int edad;
    private String color;
    private double peso;
    protected String tipo = "animal";
    
    public void soy(){
        System.out.println("Soy un animal");
    }
    public void sonido(){
        System.out.println("Los animales tienen distintos sonidos");
    }
}