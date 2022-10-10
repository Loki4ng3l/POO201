package domain;

public class triangulo extends figuraGeometrica{
    private int valor2;
    
    //Constructor
    public triangulo(int valor2, int valor1) {
        super(valor1);
        this.valor2 = valor2;
    }
    
    //Setter and Getter
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
        sb.append("triangulo{");
        sb.append("valor2=").append(valor2);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public double getArea(){
        return ((getValor1()*valor2)/2);
    }
    
    @Override
    public double getPerimetro(){
        return 
                this.valor1 + (2* Math.sqrt((Math.pow(this.valor1,2)+Math.pow(this.valor2,2))));
    }
}