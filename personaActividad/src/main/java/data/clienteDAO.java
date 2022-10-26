package data;

import static data.conexion.*;
import domain.cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class clienteDAO {
    private static final String SQL_SELECT ="SELECT * FROM cliente";
    private static final String SQL_INSERT="INSERT INTO cliente(nombre, apellidos, email, rfc, diasCredito, tipoPago, strtiPago) VALUES(?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE cliente SET nombre = ?, apellidos = ?, email = ?, rfc = ?, diasCredito = ?, tipoPago = ?, strtiPago = ? WHERE id = ?";
    private static final String SQL_DELETE="DELETE FROM cliente WHERE id = ?";
    
    //Seleccionar
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
                String apellidos = rs.getString("apellidos");
                String email = rs.getString("email");
                String rfc = rs.getString("rfc");
                int diasCredito = rs.getInt("diasCredito");
                int tipoPago = rs.getInt("tipoPago");
                String strtiPago = rs.getString("strtiPago");
                
                cliente = new cliente(id, nombre, apellidos, email, rfc, diasCredito, tipoPago, strtiPago);
                
                clientes.add(cliente);
            }
            System.out.println(clientes);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
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
            stmt.setString(2, cliente.getApellidos());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getRfc());
            stmt.setString(5, Integer.toString(cliente.getDiasCredito()));
            stmt.setString(6, Integer.toString(cliente.getTipoPago()));
            stmt.setString(7, cliente.getStrtiPago());
            
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
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
            stmt.setString(2, cliente.getApellidos());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getRfc());
            stmt.setString(5, Integer.toString(cliente.getDiasCredito()));
            stmt.setString(6, Integer.toString(cliente.getTipoPago()));
            stmt.setString(7, cliente.getStrtiPago());
            
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
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
        } finally{
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