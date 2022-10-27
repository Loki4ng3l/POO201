/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author pepe
 */
public class persona {
    private int id;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String email;
    private String telefono;
    private String fechaNac;
    private int edad;
    private String rfc;
    
    
    //Constructor
    public persona(int id, String nombre, String apellidoP, String apellidoM, String email, String telefono, String fechaNac, int edad, String rfc) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.email = email;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.edad = edad;
        this.rfc = rfc;
    }
    
    public persona(String nombre, String apellidoP, String apellidoM, String email, String telefono, String fechaNac, int edad, String rfc) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.email = email;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.edad = edad;
        this.rfc = rfc;
    }
    
    public persona(int id){
        this.id = id;
    }
    
    public persona(){
        
    }

    // Getter && Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    private String espacioNombre;
    private String espacioApellidoP;
    private String espacioApellidoM;
    private int caracteresApellidoP;
    private int caracteresApellidoM;
   
    //private int caracteresNombre = id.length();
    
    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append("\t");
        sb.append(nombre);
        sb.append("     ");
        sb.append("\t");
        sb.append(apellidoP);
        sb.append("     ");
        sb.append("\t");
        sb.append(apellidoM);
        sb.append("     ");
        sb.append("\t");
        sb.append(email);
        sb.append("     ");
        sb.append("\t");
        sb.append(telefono);
        sb.append("\t");
        sb.append(fechaNac);
        sb.append("\t");
        sb.append(" ");
        sb.append(edad);
        sb.append(" ");
        sb.append("\t");
        sb.append(rfc);
        sb.append("\t");
        return sb.toString();
    }
    
}

