package domain;

public abstract class figuraGeometrica {
    protected int valor1;

    //Constructor
    public figuraGeometrica(int valor1) {
        this.valor1 = valor1;
    }
    
    //Getter and Setter
    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FiguraGeometrica{");
        sb.append("nombre=").append(valor1);
        sb.append('}');
        return sb.toString();
    }
    
    public abstract double getArea();
    
    public abstract double getPerimetro();
}
