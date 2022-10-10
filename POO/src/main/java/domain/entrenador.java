package domain;

public class entrenador extends futbol{
    public String federacion;
    
    //Constructor
    public entrenador( int id, String nombre, String apellidos, int edad, String federacion) {
        super(id, nombre, apellidos, edad);
        this.federacion = federacion;
    }
    
    //Getter and Setter
    public String getFederacion() {
        return federacion;
    }

    public void setFederacion(String federacion) {
        this.federacion = federacion;
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("entrenador{");
        sb.append("federacion=").append(federacion);
        sb.append('}');
        return sb.toString();
    }
    
    public void dirigirPartido(){
        System.out.println("Estoy dirigiendo un partido");
    }

    public void dirigirEntrenamiento(){
        System.out.println("Estoy dirigiendo un entrenamiento");
    }
}