/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author pepe
 */
public class empleado extends persona{
    private String NSS;
    private String curp;
    private String antiguedad;
    private String puesto;
    
    // Constructor
    
    // Insertar y Actualizar
    public empleado(int id, String nombre, String apellidoP, String apellidoM, String email, String telefono, String fechaNac, int edad, String rfc, String NSS, String curp, String antiguedad, String puesto) {
        super(id, nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc);
        this.NSS = NSS;
        this.curp = curp;
        this.antiguedad = antiguedad;
        this.puesto = puesto;
    }

    // Seleccionar   
    public empleado(String nombre, String apellidoP, String apellidoM, String email, String telefono, String fechaNac, int edad, String rfc, String NSS, String curp, String antiguedad, String puesto) {
        super(nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc);
        this.NSS = NSS;
        this.curp = curp;
        this.antiguedad = antiguedad;
        this.puesto = puesto;
    }
    
    // Eliminar
    public empleado(int id) {
        super(id);
    }

    public empleado() {
    }
    
    // Getter && Setter
    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(NSS);
        sb.append("\t");
        sb.append(curp);
        sb.append("\t");
        sb.append("    ");
        sb.append(antiguedad);
        sb.append("    ");
        sb.append("\t");
        sb.append("  ");
        sb.append(puesto);
        sb.append("\n");
        return sb.toString();
    }
}