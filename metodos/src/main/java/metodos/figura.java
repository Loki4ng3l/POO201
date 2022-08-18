package metodos;

public class figura {
    // Atributos
    double lado1;
    double lado2;
    double perimetro;
    double area;
    
    double radio;
    
    double base;
    double altura;
    
    // Overwritting / Overloading
    
    // Constructor
    public figura(){
        lado1 = 0.0;
        perimetro= 0.0;
        area = 0.0;
    }
    
    // circulo
    public figura(double radio){
        this.radio = radio;
    }
    
    // Cuadrado
    public figura(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public figura(double base, double altura, double area){
        
    }
    
    public void calcularArea(){
        area = lado1 * lado2;
    }
    
    private void calcularPerimetro(){
        System.out.println("Método privado");
        
    }
    
    
    public static void main(String[] args) {
        figura f = new figura(15);
        figura fcuad = new figura(2, 5);
    }
}