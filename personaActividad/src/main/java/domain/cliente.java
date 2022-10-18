package domain;

public class cliente extends persona{
    private int diasCredito;
    private int tipoPago;
    private String strtiPago;
    
    // Crear y Actualizar
    public cliente(int id, String nombre, String apellidos, String email, String rfc, int diasCredito, int tipoPago, String strtiPago) {
        super(id, nombre, apellidos, email, rfc);
        this.diasCredito = diasCredito;
        this.tipoPago = tipoPago;
        this.strtiPago = strtiPago;
    }
    
    // Consulta
    public cliente(String nombre, String apellidos, String email, String rfc, int diasCredito, int tipoPago, String strtiPago) {
        super(nombre, apellidos, email, rfc);
        this.diasCredito = diasCredito;
        this.tipoPago = tipoPago;
        this.strtiPago = strtiPago;
    }
    
    // Eliminar
    public cliente(int id) {
        super(id);
    }
    
    //Para adaptar metodos al uso de objeto
    public cliente(){
        
    }
    // G&S
    public int getDiasCredito() {
        return diasCredito;
    }

    public void setDiasCredito(int diasCredito) {
        this.diasCredito = diasCredito;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getStrtiPago() {
        return strtiPago;
    }

    public void setStrtiPago(String strtiPago) {
        this.strtiPago = strtiPago;
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cliente{");
        sb.append("diasCredito=").append(diasCredito);
        sb.append(", tipoPago=").append(tipoPago);
        sb.append(", strtiPago=").append(strtiPago);
        sb.append('}');
        return sb.toString();
    }
}