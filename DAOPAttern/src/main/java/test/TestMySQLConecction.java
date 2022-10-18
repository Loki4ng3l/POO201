package test;

import java.sql.*;

public class TestMySQLConecction {
    
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/daoPattern?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "root");
            Statement instruccion = conexion.createStatement();
            
            var sql ="SELECT * FROM persona";
            
            ResultSet resultado = instruccion.executeQuery(sql);
            
            while(resultado.next()){
                System.out.println("Id persona: \t" + resultado.getInt("idpersona"));
                System.out.println("Nombre : \t" + resultado.getString("nombre"));
                System.out.println("Apellido : \t" + resultado.getString("apellido"));
                System.out.println("Email : \t" + resultado.getString("email"));
                System.out.println("Telefono : \t" + resultado.getString("telefono"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
