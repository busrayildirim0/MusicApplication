package musiclibrary;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.SQLException; 

public class InsertRecords {
   
    private Connection connect() {  
        // SQLite connection string  
        String url = "jdbc:sqlite:C:/sqlite/User1.db";    
        Connection conn = null;  
        try {  
            conn = DriverManager.getConnection(url);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }  
   
  
    public void insert(String title, String artistOfMusic, String album, String genre, int durationInSeconds, int releaseYear, double rating, int numberOfLikes ) {  
        
        String sql = "INSERT INTO music(title, artistOfMusic, album, genre, durationInSeconds, releaseYear, rating, numberOfLikes) VALUES(?,?,?,?,?,?,?,?)";  
   
        try{  
            Connection conn = this.connect();  
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.setString(1, title);  
            pstmt.setString(2, artistOfMusic);  
            pstmt.setString(3, album); 
            pstmt.setString(4, genre); 
            pstmt.setInt(5, durationInSeconds); 
            pstmt.setInt(6, releaseYear); 
            pstmt.setDouble(7, rating);
            pstmt.setInt(8, numberOfLikes);

            pstmt.executeUpdate();  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
    
    public void insert(int accountId,String fullName, String userName, String email, String password) {  
        AccountManager accountManager = new Account();
        String sql = "INSERT INTO user(accountId, fullName, userName, email, password) VALUES(?,?,?,?,?)";  
   
        try{  
            Connection conn = this.connect();  
            PreparedStatement pstmt = conn.prepareStatement(sql); 
            pstmt.setInt(1, accountManager.accountId );
            pstmt.setString(2, fullName);  
            pstmt.setString(3, userName); 
            pstmt.setString(4, email); 
            pstmt.setString(5, password); 

            pstmt.executeUpdate();  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
    
     public static void main(String[] args) {  
   
        InsertRecords app = new InsertRecords();  
        
       
        
    } 
   
}  

