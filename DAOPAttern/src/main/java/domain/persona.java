package domain;

public class persona {
    
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    //Para adaptar metodos al uso de objeto
    public persona(){
        
    }   

    //Eliminar
    public persona(int idPersona){
        this.idPersona = idPersona;
    }
    
    //Consulta
    public persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    
    //Crear Actualizar
    public persona(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    // S&G
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    
    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", email=").append(email);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
}