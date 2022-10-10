package domain;

public class Vehiculo {
    private String marca;
    private int capacidad;
    private String origen;
    private int anio;
    private String color;
    
    public Vehiculo(String marca, int capacidad, int anio, String origen, String color) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.anio = anio;
        this.origen = origen;
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("marca=").append(marca);
        sb.append(", capacidad=").append(capacidad);
        sb.append(", origen=").append(origen);
        sb.append(", anio=").append(anio);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }
    
    //Metodos

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}