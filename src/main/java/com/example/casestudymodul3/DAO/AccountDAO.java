package com.example.casestudymodul3.DAO;

import com.example.casestudymodul3.model.Account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    public static List<Account> getall() {
        List<Account> ListAccount = new ArrayList<>();

        String Sql = "SELECT * FROM casemodul3.accounts";


        Connection connection = ConnectionMySql.getConnection();


        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(Sql);
            while (resultSet.next()) {
                int idAccounts = Integer.parseInt(resultSet.getString("idAccounts"));
                String username = resultSet.getString("username");
                String Avatar = resultSet.getString("avatarurl");
                ListAccount.add(new Account(idAccounts, username, Avatar));

            }
            return ListAccount;


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }


    public static Account ShowOneAccount(int id) {
        String sql = "SELECT * FROM casemodul3.accounts  where idAccounts=" + id;
        Connection connection = ConnectionMySql.getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            String username = resultSet.getString("username");
            String password = resultSet.getString("pasword");
            String email = resultSet.getString("email");
            String phone = resultSet.getString("phone");
            int idstatus = Integer.parseInt(resultSet.getString("idstatus"));
            String address = resultSet.getString("address");
            String Avatar = resultSet.getString("avatarurl");

            return new Account(id, username, password, email, phone, address,idstatus, Avatar);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;


    }



    public static void Delete(int id) {
        Connection connection = ConnectionMySql.getConnection();

        String sql1 = "SET FOREIGN_KEY_CHECKS=OFF; ";
        String sql2 = "delete FROM casemodul3.accounts where idAccounts= " + id;
        String sql3 = "SET FOREIGN_KEY_CHECKS=ON;";
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql1);
            statement.execute(sql2);
            statement.execute(sql3);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }



    public static void Lookup(int id) {
        Connection connection = ConnectionMySql.getConnection();

        String sql1 = "UPDATE  casemodul3.accounts SET idstatus = 2 WHERE idaccounts =  "+id;
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql1);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public static void unLook(int id) {
        Connection connection = ConnectionMySql.getConnection();

        String sql1 = "UPDATE  casemodul3.accounts SET idstatus = 1 WHERE idaccounts =  "+id;
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql1);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public static Account getTopfolow(){
        String Sql= "select accounts.idaccounts, accounts.username, accounts.avatarurl,follows.followeridaccounts from accounts " +
                "join follows on accounts.idaccounts=follows.followeridaccounts\n" +
                "Where follows.followeridaccounts=( select max(follows.followeridaccounts)from follows);";


        Connection connection= ConnectionMySql.getConnection();
        try {
            Statement statement= connection.createStatement();
            ResultSet resultSet = statement.executeQuery(Sql);
            resultSet.next();
            int idAccounts = Integer.parseInt(resultSet.getString("idAccounts"));
            String username = resultSet.getString("username");
            String Avatar = resultSet.getString("avatarurl");
            int intTop = Integer.parseInt(resultSet.getString("followeridaccounts"));
            return new Account(idAccounts,username,Avatar,intTop);



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
    public static Account getTopLike(){
        String sql="select accounts.idaccounts, accounts.username, posts.img, posts.likecount from accounts join likes on accounts.idaccounts=likes.idaccounts join posts on posts.idposts=likes.idposts where posts.likecount=(select max(posts.likecount)from posts);";

        Connection connection= ConnectionMySql.getConnection();
        try {
            Statement statement= connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            int idAccounts = Integer.parseInt(resultSet.getString("idAccounts"));
            String username = resultSet.getString("username");
            String img = resultSet.getString("img");
            int likecount = Integer.parseInt(resultSet.getString("likecount"));
            return new Account(idAccounts,username,img,likecount);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
