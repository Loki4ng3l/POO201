package domain;

public class proveedor extends persona{
    private String producto;
    private int idProveedor;
    
    //Para adaptar metodos al uso de objeto
    public proveedor(){
        
    }
    
    // Crear y Actualizar
    public proveedor(int id, String nombre, String apellidos, String email, String rfc, String producto, int idProveedor) {
        super(id, nombre, apellidos, email, rfc);
        this.producto = producto;
        this.idProveedor = idProveedor;
    }

    // Consulta
    public proveedor(String nombre, String apellidos, String email, String rfc, String producto, int idProveedor) {
        super(nombre, apellidos, email, rfc);
        this.producto = producto;
        this.idProveedor = idProveedor;
    }
    
    // Eliminar
    public proveedor(int id) {
        super(id);
    }
    
    //G&S
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("proveedor{");
        sb.append("producto=").append(producto);
        sb.append(", idProveedor=").append(idProveedor);
        sb.append('}');
        return sb.toString();
    }
}