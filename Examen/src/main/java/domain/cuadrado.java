package domain;

public class cuadrado extends figuraGeometrica{

    //Constructor
    public cuadrado(int valor1) {
        super(valor1);
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cuadrado{");
        sb.append('}');
        return sb.toString();
    }
    
    //Getter and Setter
    
    @Override
    public double getArea(){
        return (this.valor1*this.valor1);
    }
    
    @Override
    public double getPerimetro(){
        return (this.valor1*4);
    }
}