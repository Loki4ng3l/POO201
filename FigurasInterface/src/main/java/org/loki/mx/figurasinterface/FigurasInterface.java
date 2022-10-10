package org.loki.mx.figurasinterface;

import java.sql.Connection;

interface metodos2valores{
    // Permite adaptar clases a diferentes métodos genéricos
    int getArea(int valor1, int valor2);
}

interface metodossimples{
    void getArea(int valor);
    void getPerimetro(int valor);
}

class rectangulo implements metodos2valores{
    
    @Override
    public int getArea(int valor1, int valor2) {
        return valor1 * valor2;
    }
}

class triangulo implements metodos2valores{

    @Override
    public int getArea(int valor1, int valor2) {
        return (valor1 * valor2)/2;
    }
}

class cuadro implements metodossimples{
    
    cuadro(){
        
    }
    cuadro(int valor){
        
    }

    @Override
    public void getArea(int valor) {
        System.out.println("El area del cuadro es: " + valor * valor);
    }

    @Override
    public void getPerimetro(int valor) {
        System.out.println("El perimetro del cuadro es: " + (valor * 4));
    }
}

public class FigurasInterface {

    public static void main(String[] args) {
        rectangulo r = new rectangulo();
        int resultado = r.getArea(10, 15);
        System.out.println("El area del rectangulo es: " + resultado);
        
        cuadro c = new cuadro();
        c.getArea(10);
        c.getPerimetro(10);
        
        cuadro c1 = new cuadro(10);
        
        c1.getArea(resultado);
    }
}