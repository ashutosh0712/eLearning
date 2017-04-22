package datalayer;
import java.sql.*;

public class DBOperations {

    private static Connection con = null;

    public static Connection getConnection() {
        try {
            if (con == null) {
                Class.forName("com.mysql.jdbc.Driver");
                con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjectDB?/&useSSL=false", "root", "root");
            }//if
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch
        return con;
    }//getConnection
}//DBOperations
