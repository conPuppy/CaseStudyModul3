package com.example.casestudymodul3.DAO;

import com.example.casestudymodul3.controller.Login;
import com.example.casestudymodul3.model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RepassDAO {
    private Connection connection = ConnectionMySql.getConnection();
    public void updatepass(Account account1){
        String sql = "UPDATE casemodul3.accounts SET pasword = ? WHERE username = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,account1.getPassword());
            preparedStatement.setString(2,Login.account.getUsername());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
