package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCSingleton {

    private static JDBCSingleton jdbc;

    private JDBCSingleton(){}

    public static JDBCSingleton getInstance() {
        if (jdbc == null) {
            jdbc = new JDBCSingleton();
        }
        return jdbc;
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwanirajput", "root", "ashwani");
        return connection;
    }

//    public int insert(String name, String pass) throws SQLException {
//        Connection connectionInsert = null;
//        PreparedStatement preparedStatement = null;
//        int recordCounter = 0;
//
//        try {
//            connectionInsert = getConnection();
//            preparedStatement = connectionInsert.prepareStatement("insert into userdata(uname,upassword)values(?,?)");
//            preparedStatement
//        } catch (Exception e) {
//
//        }
//    }
}
