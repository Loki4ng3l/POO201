package Modelos;

public class autos {
    String fabrica = "Chevrolet";
    int n_puertas = 5;
    int modelo = 2022;
    
    public int acelera(){
        System.out.println("run run run");
        return 0;
    }
    
    static void metodo(){
        
    }
    
    public static void main(String[] args) {
        autos chevy = new autos();
        System.out.println(chevy.acelera());
        frutas f = new frutas();
        System.out.println(f.nombre);
    }
}