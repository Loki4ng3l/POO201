package domain;

public class cubo extends cuadrado{

    //Constructor
    public cubo(int valor1) {
        super(valor1);
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cubo{");
        sb.append('}');
        return sb.toString();
    }
    
    //Getter and Setter
    @Override
    public double getArea(){
        return (this.valor1*this.valor1*6);
    }
}