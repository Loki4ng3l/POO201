package test;

import domain.Mascota;
import java.util.Scanner;

public class prueba {
    
    public static void verificarVacunas(Mascota m){
        if (m.isVacunado() == false) {
            System.out.println("La última vacuna de "+ m.getNombre() + " fue " + m.getNvacunas() + ", el costo de la siguiente vacuna es " + m.vacunas(m.getNvacunas()+1));
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Desea aplicar vacuna ahora?");
            String desicion = sc.nextLine();
            if (desicion.equals("si")) {
                System.out.println("Total = " + m.vacunas((int) (m.getNvacunas() + 1.16)));
            }else{
                System.out.println("Desobligao");
            }
            
        } else{
            System.out.println("Su mascota se encuentra al día con su cartilla de vacunación.");
        }
    }
    
    public static void main(String[] args) {
        Mascota m = new Mascota("Max", 1, true,1);
        m.setNombre("Solovino");
        
        switch (m.getTipo()) {
            case 1:
                m.setClasificacion("Perro");
                break;
            case 2:
                m.setClasificacion("Gato");
                break;
            case 3:
                m.setClasificacion("Ratón");
                break;
            default:
                m.setClasificacion("NPI");
        }
        
        
        System.out.println(m.toString());
        
        Mascota m1 = new Mascota("Firulais",5,false,1);
        System.out.println(m1.toString());
        
        Mascota m2 = new Mascota("Max",5,true,2);
        System.out.println(m2.toString());
        
        verificarVacunas(m1);
    }
}