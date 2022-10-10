package domain;

public class rectangulo extends figuraGeometrica{
    protected int valor2;
    
    //Constructor
    public rectangulo(int valor2, int valor1) {
        super(valor1);
        this.valor2 = valor2;
    }
    
    //Getter and Setter
    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("rectangulo{");
        sb.append("valor2=").append(valor2);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public double getArea(){
        return (this.valor1*this.valor2);
    }
    
    @Override
    public double getPerimetro(){
        return ((this.valor1*2)+(this.valor2*2));
    }
    
}