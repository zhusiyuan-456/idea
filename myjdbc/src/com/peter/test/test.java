package com.peter.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
        //load driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //got connection
            String url="jdbc:mysql://localhost:3306/sakila";
            String user="root";
            String password="Character1996wot";
            Connection connection= DriverManager.getConnection(url,user,password);
            
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
