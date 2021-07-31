package com.siyuan.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/sakila?useUnicode=true&CharacterEncodingUTF-8";
            String user="root";
            String password="Character1996wot";
            Connection con= DriverManager.getConnection(url,user,password);
            System.out.println(con);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
