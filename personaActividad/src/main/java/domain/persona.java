package domain;

public class persona {
    private int id;
    private String nombre;
    private String apellidos;
    private String email;
    private String rfc;
    
    //Crear y actualizar
    public persona(int id, String nombre, String apellidos, String email, String rfc) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.rfc = rfc;
    }
    
    //Consulta
    public persona(String nombre, String apellidos, String email, String rfc) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.rfc = rfc;
    }
    
    //Para adaptar metodos al uso de objeto
    public persona(){
        
    }
    
    public persona(int id) {
        this.id = id;
    }
    
    //G&S
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("persona{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", email=").append(email);
        sb.append(", rfc=").append(rfc);
        sb.append('}');
        return sb.toString();
    }
}