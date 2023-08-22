package kebah;

import java.sql.*;

public class DatabaseConnection {
    
    public static Connection myDatabase()
    {
        {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Cafe","root","luckysicat2");
                    System.out.println("Database Connected!");
                    return conn;
        }
        catch (Exception e)
        
        {
        return null;    
        }
        
        }
        
       
    }
}
    

