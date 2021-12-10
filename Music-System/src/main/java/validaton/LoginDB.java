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

public class LoginDB {
    Connection connection;
    Statement st;
    ResultSet rs;
    boolean login=false;

    public boolean validate(String u, String p) {
        try {
            String query = "select * from user";
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/music_db",
                    "root",
                    "Abhiraj@123");
            st = connection.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                if (u.equals(rs.getString(2)) && p.equals(rs.getString(3))) {
                    login = true;
                    break;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return login;
    }

}
