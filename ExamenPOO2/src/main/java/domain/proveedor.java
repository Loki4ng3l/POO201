/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author pepe
 */
public class proveedor extends persona{
    private int diasEntrega;
    private int diasCredito;
    private int categoria;
    private String tipoCategoria;
    
    // Constructor
    
    // Insertar y Actualizar
    public proveedor(int id, String nombre, String apellidoP, String apellidoM, String email, String telefono, String fechaNac, int edad, String rfc, int diasEntrega, int diasCredito, String tipoCategoria) {
        super(id, nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc);
        this.diasEntrega = diasEntrega;
        this.diasCredito = diasCredito;
        this.tipoCategoria = tipoCategoria;
    }
    
    // Seleccionar    
    public proveedor(String nombre, String apellidoP, String apellidoM, String email, String telefono, String fechaNac, int edad, String rfc, int diasEntrega, int diasCredito, String tipoCategoria) {
        super(nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc);
        this.diasEntrega = diasEntrega;
        this.diasCredito = diasCredito;
        this.tipoCategoria = tipoCategoria;
    }
    
    // Eliminar
    public proveedor(int id) {
        super(id);
    }

    // 
    public proveedor() {
        
    }

    public proveedor(int diasEntrega, int diasCredito, String tipoCategoria) {
        this.diasEntrega = diasEntrega;
        this.diasCredito = diasCredito;
        this.tipoCategoria = tipoCategoria;
    }
    
    // Getter && Setter
    public int getDiasEntrega() {
        return diasEntrega;
    }

    public void setDiasEntrega(int diasEntrega) {
        this.diasEntrega = diasEntrega;
    }

    public int getDiasCredito() {
        return diasCredito;
    }

    public void setDiasCredito(int diasCredito) {
        this.diasCredito = diasCredito;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }
    
    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("      ");
        sb.append(diasEntrega);
        sb.append("      ");
        sb.append("\t");
        sb.append("\t");
        sb.append("    ");
        sb.append(diasCredito);
        sb.append("\t");
        sb.append("\t");
        sb.append(tipoCategoria);
        sb.append("\t");
        sb.append("\n");
        return sb.toString();
    }
    
}
