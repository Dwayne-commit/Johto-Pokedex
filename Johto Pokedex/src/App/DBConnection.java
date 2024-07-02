package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
//URL
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dex";
    //USERNAME
    private static final String USER = "root";
    //PASSWORD
    private static final String PASSWORD = "Wayneb22";
//CREATE CONNECTION
    public static Connection getConnection(){
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL,USER,PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection(Connection connection){
        try {
            if(connection != null && connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
