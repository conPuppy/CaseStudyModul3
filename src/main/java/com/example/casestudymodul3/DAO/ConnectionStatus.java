package com.example.casestudymodul3.DAO;

import com.example.casestudymodul3.model.Status;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionStatus {
    public static Status ShowStatus(int id) {
        String sql = "SELECT *  FROM casemodul3.status where idstatus=" + id;
        Connection connection = ConnectionMySql.getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();

            String Status = resultSet.getString("status");

            return new Status(id,Status);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;


    }





}
