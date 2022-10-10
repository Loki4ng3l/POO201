package domain;

public class Gato extends Animal{
    @Override
    public void soy(){
        System.out.println("Soy un gato");
    }
    public void sonido(){
        System.out.println("El gato hace miau miau");
    }
}