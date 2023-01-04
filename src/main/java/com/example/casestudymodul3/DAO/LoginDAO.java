package com.example.casestudymodul3.DAO;

import com.example.casestudymodul3.model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    public Account checklogin(String username){
        String sql = "select * from accounts where username =?";
        Connection connection = ConnectionMySql.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            int id = resultSet.getInt("idaccounts");
            String password = resultSet.getString("pasword");
            String email = resultSet.getString("email");
            String phone = resultSet.getString("phone");
            String address = resultSet.getString("address");
            int idroles = resultSet.getInt("idroles");
            int idstatus = resultSet.getInt("idstatus");
            String avatarurl = resultSet.getString("avatarurl");
            return new Account(id,username,password,email,phone,address,idroles,idstatus,avatarurl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String checkpass(String username){
        String sql = "select pasword from accounts where username=?";
        Connection connection = ConnectionMySql.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            String password = resultSet.getString("pasword");
            return password;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


}
