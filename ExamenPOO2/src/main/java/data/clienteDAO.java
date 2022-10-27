/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import static data.conexion.close;
import static data.conexion.getConnection;
import domain.cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pepe
 */
public class clienteDAO {
    // ? -> campo esperado
    private static final String SQL_SELECT ="SELECT id, nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc, diasCredito, metodoPago, tipoPersona FROM cliente";
    private static final String SQL_INSERT="INSERT INTO cliente(nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc, diasCredito, metodoPago, tipoPersona) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE cliente SET nombre = ?, apellidoP = ?, apellidoM = ?, email = ?, telefono=?, fechaNac=?, edad=?, rfc = ?, diasCredito = ?, metodoPago = ?, tipoPersona = ? WHERE id = ?";
    private static final String SQL_DELETE="DELETE FROM cliente WHERE id = ?";
    
    // Seleccionar
    public List<cliente> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        cliente cliente = null;
        List<cliente> clientes = new ArrayList<>();
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellidoP = rs.getString("apellidoP");
                String apellidoM = rs.getString("apellidoM");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                String fechaNac = rs.getString("fechaNac");
                int edad = rs.getInt("edad");
                String rfc = rs.getString("rfc");
                int diasCredito = rs.getInt("diasCredito");
                String tipoMetodosPago = rs.getString("metodoPago");
                String menuTipoPersona = rs.getString("tipoPersona");
                
                cliente = new cliente(id, nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc, diasCredito, tipoMetodosPago, menuTipoPersona);
                
                clientes.add(cliente);
            }
            System.out.println(" id "+"\t"+ "   nombre   "+"\t"+"   apellidoP   "+"\t"+"   apellidoM   "+"\t"+"     email     "+"\t"+"\t"+" telefono "+"\t"+" fechaNac "+"\t"+"edad"+"\t"+"     rfc     "+"\t"+"Dias de Credito"+"\t"+"    "+"Metodo de Pago"+"\t"+"Tipo de Persona");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(clientes);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return clientes;
    }
    
        
    //Insertar
    public int insertar(cliente cliente){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        int registros = 0;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellidoP());
            stmt.setString(3, cliente.getApellidoM());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getTelefono());
            stmt.setString(6, cliente.getFechaNac());
            stmt.setInt(7, cliente.getEdad());
            stmt.setString(8, cliente.getRfc());
            stmt.setString(9, Integer.toString(cliente.getDiasCredito()));
            stmt.setString(10, cliente.getTipoMetodosPago());
            stmt.setString(11, cliente.getMenuTipoPersona());
            
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
            }
        }
        
        return registros;
    }
    
    //Actualizar
    public int actualizar(cliente cliente){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        int registros = 0;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellidoP());
            stmt.setString(3, cliente.getApellidoM());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getTelefono());
            stmt.setString(6, cliente.getFechaNac());
            stmt.setInt(7, cliente.getEdad());
            stmt.setString(8, cliente.getRfc());
            stmt.setString(9, Integer.toString(cliente.getDiasCredito()));
            stmt.setString(10, (cliente.getTipoMetodosPago()));
            stmt.setString(11, (cliente.getMenuTipoPersona()));
            stmt.setInt(12, cliente.getId());
            
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
            }
        }
        
        return registros;
    }
    
    //Eliminar
    public int eliminar(cliente cliente){
        // Reinician los parametros, para garantizar una instancia nueva.
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            
            stmt.setInt(1, cliente.getId());
            
            registros = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
}
