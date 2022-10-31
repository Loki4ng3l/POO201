/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import static data.conexion.close;
import static data.conexion.getConnection;
import domain.empleado;
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
public class empleadoDAO {
    // ? -> campo esperado     id, nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc, NSS, curp, antiguedad, puesto
    private static final String SQL_SELECT ="SELECT * FROM empleado";
    private static final String SQL_INSERT="INSERT INTO empleado(nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc, NSS, curp, antiguedad, puesto) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE empleado SET nombre = ?, apellidoP = ?, apellidoM = ?, email = ?, telefono=?, fechaNac=?, edad=?, rfc = ?, NSS = ?, curp = ?, antiguedad = ?, puesto = ? WHERE id = ?";
    private static final String SQL_DELETE="DELETE FROM empleado WHERE id = ?";
    
    
    // INSERT INTO empleados(edad) VALUES (truncate((datediff(current_date(), FechaNac) /365),0));  
    
    private String saltoLinea;
    
    // Seleccionar
    public List<empleado> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        empleado empleado = null;
        List<empleado> empleados = new ArrayList<>();
        
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
                String NSS = rs.getString("NSS");
                String curp = rs.getString("curp");
                String antiguedad = rs.getString("antiguedad");
                String puesto = rs.getString("puesto");
                
                empleado = new empleado(id, nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc, NSS, curp, antiguedad, puesto);
                
                empleados.add(empleado);
            }
            System.out.println(" id "+"\t"+ "   nombre   "+"\t"+"   apellidoP   "+"\t"+"   apellidoM   "+"\t"+"     email     "+"\t"+"\t"+" telefono "+"\t"+" fechaNac "+"\t"+"edad"+"\t"+"     rfc     "+"\t"+"    NSS    "+"\t"+"       curp       "+"\t"+"antiguedad"+"\t"+"   puesto   ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(empleados);
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
        
        return empleados;
    }
    
        
    //Insertar
    public int insertar(empleado empleado){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        int registros = 0;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getApellidoP());
            stmt.setString(3, empleado.getApellidoM());
            stmt.setString(4, empleado.getEmail());
            stmt.setString(5, empleado.getTelefono());
            stmt.setString(6, empleado.getFechaNac());
            stmt.setInt(7, empleado.getEdad());
            stmt.setString(8, empleado.getRfc());
            stmt.setString(9, empleado.getNSS());
            stmt.setString(10, empleado.getCurp());
            stmt.setString(11, empleado.getAntiguedad());
            stmt.setString(12, empleado.getPuesto());
            
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
    public int actualizar(empleado empleado){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        int registros = 0;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getApellidoP());
            stmt.setString(3, empleado.getApellidoM());
            stmt.setString(4, empleado.getEmail());
            stmt.setString(5, empleado.getTelefono());
            stmt.setString(6, empleado.getFechaNac());
            stmt.setInt(7, empleado.getEdad());
            stmt.setString(8, empleado.getRfc());
            stmt.setString(9, empleado.getNSS());
            stmt.setString(10, empleado.getCurp());
            stmt.setString(11, empleado.getAntiguedad());
            stmt.setString(12, empleado.getPuesto());
            stmt.setInt(13, empleado.getId());
            
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
    public int eliminar(empleado empleado){
        // Reinician los parametros, para garantizar una instancia nueva.
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            
            stmt.setInt(1, empleado.getId());
            
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