
package ConnectionFac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexao {
    
    private String url;
    private String usuario;
    private String senha;
    
    public Connection getConnection(){
        url = "jdbc:postgresql://localhost:5432/postgres";
        usuario = "postgres";
        senha = "daburahboy123";
        
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url,usuario,senha);
            
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
    public static void closeConnection(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException{
        close(conn,ps,rs);
    }
    
    public static void closeConnection(Connection conn, PreparedStatement ps) throws SQLException{
        close(conn,ps,null);
    }
     
    public static void closeConnection(Connection conn) throws SQLException{
        close(conn,null,null);
    }

    private static void close(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException {
        try {
            if(conn!= null)
                conn.close();
            if(ps!=null)
                ps.close();
            if(rs != null)
                rs.close();;
        } catch (Exception e) {
            throw new SQLException(e.getMessage());            
        }
        
    }

    
}
