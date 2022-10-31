/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author pepe
 */
public class conexion {
    // SSL = es el puerto seguro
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ExamenPOO2?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="root1234";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        
    }
    // Result set devuelve los datos de consulta
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    // Una vez ejecutada la función devuelve resultados (exito/fracaso)
    public static void close(Statement stmt) throws SQLException{
        stmt.close();
    }
    
    //Precompliado de la secuencia SQL
    public static void close(PreparedStatement stmt) throws SQLException{
        stmt.close();
    }
    
    //Cerrar conexion
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
