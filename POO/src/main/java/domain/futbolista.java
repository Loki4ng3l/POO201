package domain;

public class futbolista extends futbol{
    private int dorsal;
    private String demarcacion;

    public futbolista( int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("futbolista{");
        sb.append("dorsal=").append(dorsal);
        sb.append(", demarcacion=").append(demarcacion);
        sb.append('}');
        return sb.toString();
    }
    
    public void concentrarse(){
        
    }
    
    public void viajar(){
        
    }
    
    public void JugarPartido(){
        System.out.println("Estoy jugando");
    }

    public void entrenar(){
        System.out.println("Estoy entrenando");
    }
}