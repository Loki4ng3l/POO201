/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author pepe
 */
public class cliente extends persona{
    private int diasCredito;
    private int MetodosPago;
    private int tipoPersona;
    private String tipoMetodosPago;
    private String menuTipoPersona;
    
    // Constructores
   
    // Insertar y Actualizar
    public cliente(int id, String nombre, String apellidoP, String apellidoM, String email, String telefono, String fechaNac, int edad, String rfc, int diasCredito, String tipoMetodosPago, String menuTipoPersona) {
        super(id, nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc);
        this.diasCredito = diasCredito;
        this.tipoMetodosPago = tipoMetodosPago;
        this.menuTipoPersona = menuTipoPersona;
    }
    
    // Seleccionar
    public cliente(String nombre, String apellidoP, String apellidoM, String email, String telefono, String fechaNac, int edad, String rfc, int diasCredito, String tipoMetodosPago, String menuTipoPersona) {
        super(nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc);
        this.diasCredito = diasCredito;
        this.tipoMetodosPago = tipoMetodosPago;
        this.menuTipoPersona = menuTipoPersona;
    }

    // Eliminar
    public cliente(int id) {
        super(id);
    }
    
    public cliente() {
    }
    
    // Getter && Setter
    public int getDiasCredito() {
        return diasCredito;
    }

    public void setDiasCredito(int diasCredito) {
        this.diasCredito = diasCredito;
    }

    public int getMetodosPago() {
        return MetodosPago;
    }

    public void setMetodosPago(int MetodosPago) {
        this.MetodosPago = MetodosPago;
    }

    public int getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(int tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getTipoMetodosPago() {
        return tipoMetodosPago;
    }

    public void setTipoMetodosPago(String TipoMetodosPago) {
        this.tipoMetodosPago = TipoMetodosPago;
    }

    public String getMenuTipoPersona() {
        return menuTipoPersona;
    }

    public void setMenuTipoPersona(String MenuTipoPersona) {
        this.menuTipoPersona = MenuTipoPersona;
    }
    
    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\t");
        sb.append(diasCredito);
        sb.append("\t");
        sb.append("    ");
        sb.append("  ");
        sb.append(tipoMetodosPago);
        sb.append("    ");
        sb.append("\t");
        sb.append("    ");
        sb.append(menuTipoPersona);
        sb.append("\n");
        return sb.toString();
    }
    
}
