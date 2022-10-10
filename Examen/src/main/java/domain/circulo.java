package domain;

public class circulo extends figuraGeometrica{
    //Constructor
    public circulo(int valor1) {
        super(valor1);
    }

    // Getter and Setter
    
    
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("circulo{");
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public double getArea(){
        return ((Math.PI)*(Math.pow(this.valor1,2)));
    }
    
    @Override
    public double getPerimetro(){
        return ((Math.PI)*(this.valor1*2));
    }
}