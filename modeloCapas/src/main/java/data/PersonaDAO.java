package data;

import domain.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static data.conexion.*;

public class PersonaDAO {
    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    public static final String SQL_INSERT = "insert into persona(nombre, apellido, email, telefono) values(?,?,?,?)";
    
    public List<Persona> seleccionar(){
        Connection conn = null;
        PreparedStatement smtm = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        
        try {
            conn = getConnection();
            smtm = conn.prepareStatement(SQL_SELECT);
            rs = smtm.executeQuery();
            
            while(rs.next()){
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getNString("nombre");
                String apellido = rs.getNString("apellido");
                String email = rs.getNString("email");
                String telefono = rs.getNString("telefono");
                
                persona = new Persona(idPersona, nombre, apellido, email, telefono);
            }
        } catch (Exception e) {
        }
    }
}