package test;

import domain.figuraGeometrica;
import domain.circulo;
import domain.cuadrado;
import domain.cubo;
import domain.rectangulo;
import domain.triangulo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pruebaFigura {
    private static int valor1;
    private static int valor2;
    
    //constructor
    public pruebaFigura() {
    }
    
    
    public static void captura(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor1");
        valor1 = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el valor2");
        valor2 = Integer.parseInt(sc.nextLine());
        
    }
    
    public static void main(String[] args) {
        captura();
        
        circulo cir = new circulo(valor1);
        cuadrado cuad = new cuadrado(valor1);
        cubo cub = new cubo(valor1);
        rectangulo rectan = new rectangulo(valor1, valor2);
        triangulo trian = new triangulo(valor1, valor2);
        
        System.out.println("El area del circulo es: " + cir.getArea());
        System.out.println("El perimetro del circulo es: " + cir.getPerimetro());
        
        System.out.println("El area del cuadrado es: " + cuad.getArea());
        System.out.println("El perimetro del cuadrado es: " + cuad.getPerimetro());
        
        System.out.println("El area del cubo es: " + cub.getArea());
        
        System.out.println("El area del rectangulo es: " + rectan.getArea());
        System.out.println("El perimetro del rectangulo es: " + rectan.getPerimetro());
        
        System.out.println("El area del triangulo es: " + trian.getArea());
        System.out.println("El perimetro del triangulo es: " + trian.getPerimetro());
        
    }
}