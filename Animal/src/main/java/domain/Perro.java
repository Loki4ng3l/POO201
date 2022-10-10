package domain;

public class Perro extends Animal {
    public String tipo = "Perro";
    @Override
    public void soy(){
        System.out.println("Soy un perro");
    }
    public void imprimir(){
        soy();
    }
    @Override
    public void sonido(){
        System.out.println("El perro hace guau guau");
    }
    
    public void imprimeTipo(){
        System.out.println("Soy un " + tipo);
        System.out.println("Soy un " + super.tipo);
    }
}