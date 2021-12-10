/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validaton;

/**
 *
 * @author KASHYAP
 */
import java.sql.*;

public class SignupDB {
    Connection connection;
    Statement st;
    ResultSet rs;

    public void insert(String n, String s, String p) {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/music_db",
                    "root",
                    "Abhiraj@123");
            st = connection.createStatement();
            String query = "INSERT INTO user('"+n+"', '"+s+"', '"+p+"')";
            rs = st.executeQuery(query);
        

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
