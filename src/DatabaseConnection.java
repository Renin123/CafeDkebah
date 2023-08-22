package src;

import java.sql.*;

public class DatabaseConnection {

    public static Connection dbConnect() {
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cafe", "root", "luckyiscat2");
                System.out.println("Database Connected!");
                return conn;
            } catch (Exception e) {
                return null;
            }

        }

    }

}
