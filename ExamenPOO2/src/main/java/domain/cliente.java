package domain;

public class cliente extends persona{
    private int diasCredito;
    private int metodoPago;
    private int tipoPersona;
    
    //Constructor
    public cliente(int diasCredito, int metodoPago, int tipoPersona) {
        this.diasCredito = diasCredito;
        this.metodoPago = metodoPago;
        this.tipoPersona = tipoPersona;
    }
    
    //G&S
    
}