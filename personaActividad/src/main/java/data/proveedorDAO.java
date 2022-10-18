package data;

import static data.conexion.*;
import domain.proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class proveedorDAO {
    private static final String SQL_SELECT ="SELECT id, nombre, apellidos, email, rfc, producto, idProveedor FROM proveedor";
    private static final String SQL_INSERT="INSERT INTO proveedor(nombre, apellidos, email, rfc, producto, idProveedor) VALUES(?,?,?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE proveedor SET nombre = ?, apellidos = ?, email = ?, rfc = ?, producto = ?, idProveedor = ? WHERE id = ?";
    private static final String SQL_DELETE="DELETE FROM proveedor WHERE id = ?";
    
    //Seleccionar
    public List<proveedor> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        proveedor proveedor = null;
        List<proveedor> proveedores = new ArrayList<>();
        
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
                String producto = rs.getString("producto");
                int idProveedor = rs.getInt("idProveedor");
                
                proveedor = new proveedor(id, nombre, apellidos, email, rfc, producto, idProveedor);
                
                proveedores.add(proveedor);
            }
            System.out.println(proveedores);
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
        return proveedores;
    }
    
    //Insertar
    public int insertar(proveedor proveedor){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        int registros = 0;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, proveedor.getNombre());
            stmt.setString(2, proveedor.getApellidos());
            stmt.setString(3, proveedor.getEmail());
            stmt.setString(4, proveedor.getRfc());
            stmt.setString(5, proveedor.getProducto());
            stmt.setInt(6, proveedor.getIdProveedor());
            
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
    public int actualizar(proveedor proveedor){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        int registros = 0;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, proveedor.getNombre());
            stmt.setString(2, proveedor.getApellidos());
            stmt.setString(3, proveedor.getEmail());
            stmt.setString(4, proveedor.getRfc());
            stmt.setString(5, proveedor.getProducto());
            stmt.setInt(6, proveedor.getIdProveedor());
            
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
    public int eliminar(proveedor proveedor){
        // Reinician los parametros, para garantizar una instancia nueva.
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, proveedor.getId());
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