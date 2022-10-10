package domain;

public class masajistas extends futbol{
    public String titulacion;
    public int aniosExperiencia;
    
    //Constructor
    public masajistas( int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    //Getter and Setter
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    //toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("masajistas{");
        sb.append("titulacion=").append(titulacion);
        sb.append(", aniosExperiencia=").append(aniosExperiencia);
        sb.append('}');
        return sb.toString();
    }
    
    public void darMasaje(){
        System.out.println("Masaje listo");
    }
}