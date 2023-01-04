package com.example.casestudymodul3.DAO;

import com.example.casestudymodul3.model.Account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {
    public List<Account> findByUsername(String username) {
        List<Account> ListAccount = new ArrayList<>();

        String sql = "SELECT * FROM  casemodul3.accounts WHERE username LIKE  '%" + username + "%'";
        Connection connection = ConnectionMySql.getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int idAccounts = Integer.parseInt(resultSet.getString("idAccounts"));
                String username1 = resultSet.getString("username");
                String Avatar = resultSet.getString("avatarurl");

                ListAccount.add(new Account(idAccounts, username1, Avatar));

            }
            return ListAccount;
        } catch (Exception e) {
            e.printStackTrace();
            return ListAccount;
        }
    }
}
