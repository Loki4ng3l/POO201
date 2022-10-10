package test;

import domain.*;

public class PruebaAnimal {
    
    public static void main(String[] args) {
        Animal padre = new Animal();
        Perro perro = new Perro();
        Gato gato = new Gato();
        padre.soy();
        perro.soy();
        gato.soy();
        
        perro.imprimeTipo();
    }
}