package datos;

import java.sql.*;
/**
 *
 * @author brusb
 */
public class Conexion {
    //Conexion 
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    //Establecer usuario que hay en mysql en el puerto 3306
    private static final String JDBC_USER = "root";
    //Establecer password que ingresamos al momento de crear la BD en 3306
    private static final String JDBC_PASSWORD = "admin.";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
    
}
