package domain;

public class Mascota {

    public static int getContador() {
        return contador;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }
    // Atributos
    private int id;
    private String nombre;
    private int tipo;
    private boolean vacunado;
    private String clasificacion;
    private static int contador;
    private int nvacunas;
    
    // Constructor
    public Mascota(String nombre, int tipo, boolean vacunado, int nvacunas){
        this.id = ++Mascota.contador;
        this.nombre = nombre;
        this.tipo = tipo;
        this.vacunado = vacunado;
        this.nvacunas = nvacunas;
    }
    
    public Mascota(int id){
        this.id = id;
    }
    
    // Set y get --> Encapsulamiento
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    public int getNvacunas() {
        return nvacunas;
    }

    public void setNvacunas(int nvacunas) {
        this.nvacunas = nvacunas;
    }
    
    public double vacunas(int tipo){
        double precio = 0;
        switch (tipo) {
            case 1:
                System.out.println("Puppy");
                precio = 250;
                break;
            case 2:
                System.out.println("Cuadruple");
                precio = 350;
                break;
            case 3:
                System.out.println("Quintuple");
                precio = 450;
                break;
            case 4:
                System.out.println("Refuerzo");
                precio = 550;
                break;
            default:
                System.out.println("No aplica");
        }
        return precio;
    }
    
    // Sobreescritura del metodo toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mascota{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", tipo=").append(tipo);
        sb.append(", vacunado=").append(vacunado);
        sb.append('}');
        return sb.toString();
    }
}