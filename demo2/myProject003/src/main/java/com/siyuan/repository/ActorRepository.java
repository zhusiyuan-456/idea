package com.siyuan.repository;

import com.siyuan.Util.JDBCtools;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActorRepository {
    public List<Actor> findAll() throws SQLException {
        Connection con=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<Actor> list=new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/sakila?useUnicode=true&CharacterEncodingUTF-8";
            String user="root";
            String password="Character1996wot";
            con= DriverManager.getConnection(url,user,password);
            String sql="select * from actor";
            preparedStatement=con.prepareStatement(sql);
            resultSet= preparedStatement.executeQuery();
            Actor actor=null;
           while (resultSet.next()){
               Integer actor_id=resultSet.getInt(1);
               String first_name=resultSet.getString(2);
               String last_name=resultSet.getString(3);
               Date update_date=resultSet.getDate(4);
               actor=new Actor(actor_id,first_name,last_name,update_date);
               list.add(actor);
           }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCtools.release(con,preparedStatement,resultSet);
        }
        return list;
    }
    public void add(String firstName,String lastName) throws SQLException {
        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            con= JDBCtools.getCon();
            String sql = "insert into actor(first_name,last_name,last_update)values (?,?,?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,firstName);
            preparedStatement.setString(2,lastName);
            preparedStatement.setString(3,"2006-02-15 04:34:33");
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCtools.release(con,preparedStatement,null);
        }
    }

    public static void main(String[] args) throws SQLException {
        ActorRepository actorRepository=new ActorRepository();
        System.out.println(actorRepository.findAll());

    }
}
