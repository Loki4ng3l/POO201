/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import static data.conexion.close;
import static data.conexion.getConnection;
import domain.proveedor;
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
public class proveedorDAO {
    // ? -> campo esperado
    private static final String SQL_SELECT ="SELECT id, nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc, diasEntrega, diasCredito, Categoria FROM proveedor";
    private static final String SQL_INSERT="INSERT INTO proveedor (nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc, diasEntrega, diasCredito, Categoria) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE proveedor SET nombre = ?, apellidoP = ?, apellidoM = ?, email = ?, telefono=?, fechaNac=?, edad=?, rfc = ?, diasEntrega = ?, diasCredito = ?, Categoria = ? WHERE id = ?";
    private static final String SQL_DELETE="DELETE FROM proveedor WHERE id = ?";
    
    // Seleccionar
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
                String apellidoP = rs.getString("apellidoP");
                String apellidoM = rs.getString("apellidoM");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                String fechaNac = rs.getString("fechaNac");
                int edad = rs.getInt("edad");
                String rfc = rs.getString("rfc");
                int diasEntrega = rs.getInt("diasEntrega");
                int diasCredito = rs.getInt("diasCredito");
                String tipoCategoria = rs.getString("Categoria");
                
                proveedor = new proveedor(id, nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc, diasEntrega, diasCredito, tipoCategoria);
                
                proveedores.add(proveedor);
            }
            System.out.println(" id "+"\t"+ "   nombre   "+"\t"+"   apellidoP   "+"\t"+"   apellidoM   "+"\t"+"     email     "+"\t"+"\t"+" telefono "+"\t"+" fechaNac "+"\t"+"edad"+"\t"+"     rfc     "+"\t"+"Dias de Entrega"+"\t"+"    Dias de Credito"+"\t"+"Categoria");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(proveedores);
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
            stmt.setString(2, proveedor.getApellidoP());
            stmt.setString(3, proveedor.getApellidoM());
            stmt.setString(4, proveedor.getEmail());
            stmt.setString(5, proveedor.getTelefono());
            stmt.setString(6, proveedor.getFechaNac());
            stmt.setInt(7, proveedor.getEdad());
            stmt.setString(8, proveedor.getRfc());
            stmt.setInt(9, proveedor.getDiasEntrega());
            stmt.setInt(10, proveedor.getDiasCredito());
            stmt.setString(11, proveedor.getTipoCategoria());
            
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
    public int actualizar(proveedor proveedor){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        int registros = 0;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, proveedor.getNombre());
            stmt.setString(2, proveedor.getApellidoP());
            stmt.setString(3, proveedor.getApellidoM());
            stmt.setString(4, proveedor.getEmail());
            stmt.setString(5, proveedor.getTelefono());
            stmt.setString(6, proveedor.getFechaNac());
            stmt.setInt(7, proveedor.getEdad());
            stmt.setString(8, proveedor.getRfc());
            stmt.setInt(9, proveedor.getDiasEntrega());
            stmt.setInt(10, proveedor.getDiasCredito());
            stmt.setString(11, proveedor.getTipoCategoria());
            stmt.setInt(12, proveedor.getId());
            
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