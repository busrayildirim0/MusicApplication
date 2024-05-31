
package musiclibrary;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement;  

public class CreateTable {
    public static void createNewTable() {  
        // SQLite connection string  
        String url = "jdbc:sqlite:C:/sqlite/User1.db";  
          
        // SQL statement for creating a new table  
        String sql = "CREATE TABLE IF NOT EXISTS user("  
                + "     accountId INTEGER,"  
                + "     fullName text,"  
                + "     userName text," 
                + "     email text,"
                + "     password text"
                + ");";   
          
        try{  
            Connection conn = DriverManager.getConnection(url);  
            Statement stmt = conn.createStatement();  
            stmt.execute(sql);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
    public static void main(String[] args) {  
        createNewTable();  
    }  
}
