package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306control_clientes?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";
    
    public static BasicDataSource dataSource;
    
    public static DataSource getDataSource(){
        
        if(dataSource == null){
            dataSource = new BasicDataSource();
            
            dataSource.setUrl(JDBC_URL);
            dataSource.setUsername(JDBC_USER);
            dataSource.setPassword(JDBC_PASSWORD);
            
            dataSource.setInitialSize(10);
            
        }
        return dataSource;
    }
    
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
    
    public static void close(ResultSet rs){
        try{
            rs.close();
        } catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn){
        try{
            conn.close();
        } catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}