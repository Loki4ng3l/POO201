package test;

import data.personaDAO;
import domain.persona;
import java.util.List;

public class TestPersonaDAO {
    public static void main(String[] args) {
        /*persona p = new persona(1, "Miguel", "Gomez", "miguel@gmail.com", "4776098946");
        persona p2 = new persona("Daniel", "Moreno", "daniel@gmail.com", "1234567890");
        persona p3 = new persona(1, "Joshua", "Delgado", "joshua@gmail.com", "4771234567");
        persona p4 = new persona(3, "Angel", "Garcia", "angel@gmail.com", "4777654321");
        persona p5 = new persona(5, "Jose", "Muñeton", "jose@gmail.com", "4771357911");
        
        System.out.println(p.toString());*/
        
        personaDAO pdao = new personaDAO();
        
        /*
        //Insertar
        persona personaNueva = new persona("Angel", "García", "angel@gmail.com", "4776787856");
        pdao.insertar(personaNueva);
        */
        
        /*
        // Modificar
        persona personaModificar = new persona(1, "Diego", "Gomez", "andregomez@gmail.com", "4776014033");
        pdao.actualizar(personaModificar);
        */
        
        /*
        //Eliminar
        persona personaEliminar = new persona(2);
        pdao.eliminar(personaEliminar);
        */
        
        /*
        List<persona> personas = pdao.seleccionar();
        
        personas.forEach(persona ->{
            System.out.println("personas =" + persona);
        });
        */
    }
}