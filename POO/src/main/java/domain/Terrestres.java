package domain;

public class Terrestres extends Vehiculo{
    private int nllantas;
    private int npuertas;
    private int medidaRin;

    public Terrestres(int nllantas, int npuertas, int medidaRin, String marca, int capacidad, int anio, String origen, String color) {
        super(marca, capacidad, anio, origen, color);
        this.nllantas = nllantas;
        this.npuertas = npuertas;
        this.medidaRin = medidaRin;
    }

    public int getNllantas() {
        return nllantas;
    }

    public void setNllantas(int nllantas) {
        this.nllantas = nllantas;
    }

    public int getNpuertas() {
        return npuertas;
    }

    public void setNpuertas(int npuertas) {
        this.npuertas = npuertas;
    }

    public int getMedidaRin() {
        return medidaRin;
    }

    public void setMedidaRin(int medidaRin) {
        this.medidaRin = medidaRin;
    }
}