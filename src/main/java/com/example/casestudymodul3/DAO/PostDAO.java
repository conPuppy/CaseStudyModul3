package com.example.casestudymodul3.DAO;

import com.example.casestudymodul3.controller.Login;
import com.example.casestudymodul3.model.Post;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostDAO {
    public List<Post> getAll() {
    List<Post> posts = new ArrayList<>();
    String sql = "Select posts.idPosts, posts.img, posts.content, Accounts.idAccounts,Accounts.avatarurl , Accounts.username, posts.time from Posts join accounts using(idaccounts) order by time desc;";
    Connection connection = ConnectionMySql.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                String username = resultSet.getString("username");
                String noidung = resultSet.getString("content");
                String linkimg = resultSet.getString("img");
                String time = resultSet.getString("time");
                String avatarurl = resultSet.getString("avatarurl");
                posts.add(new Post(username,linkimg,noidung,time,avatarurl));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return posts;
    }

    public List<Post> getAllMyPosts(int idAccounts) {
        List<Post> posts = new ArrayList<>();
        String sql = "select posts.idPosts, posts.img, posts.content, Accounts.idAccounts,Accounts.avatarurl ,Accounts.username, posts.time from Posts join accounts on posts.idAccounts = accounts.idaccounts where accounts.idaccounts ="+idAccounts +"  order by time desc;";
        Connection connection = ConnectionMySql.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int idpost = resultSet.getInt("idposts");
                System.out.println(idpost);
                String username = resultSet.getString("username");
                String noidung = resultSet.getString("content");
                String linkimg = resultSet.getString("img");
                String time = resultSet.getString("time");
                String avatarurl = resultSet.getString("avatarurl");
                posts.add(new Post(username,linkimg,noidung,time,avatarurl,idpost));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return posts;
    }
    public static void save(Post post) {
        String sql = "INSERT INTO posts (idaccounts, content, img) VALUES ( ?, ?,?)";
        Connection connection = ConnectionMySql.getConnection();
        int id = Login.account.getIdaccount();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, post.getContent());
            preparedStatement.setString(3, post.getImg());
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean edit(Post post) {
        String sql = "update posts set content =?, img=? where idposts=?";
        Connection connection = ConnectionMySql.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(3,post.getIdPost());
            preparedStatement.setString(1, post.getContent());
            preparedStatement.setString(2,post.getImg());
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(int id) {
        String sqlcmt = "delete from comments where idposts =" + id;
        String sqllike = "delete from likes where idposts =" + id;
        String sql = "delete from posts where idposts =" + id;
        Connection connection = ConnectionMySql.getConnection();
        try {
            PreparedStatement preparedStatement1 = connection.prepareStatement(sqlcmt);
            PreparedStatement preparedStatement2 = connection.prepareStatement(sqllike);
            PreparedStatement preparedStatement3 = connection.prepareStatement(sql);
            preparedStatement1.execute();
            preparedStatement2.execute();
            preparedStatement3.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static List<Post> showpostbyusername(int idaccounts) {
        List<Post> postsbyusname = new ArrayList<>();
        String selectAllPost = "SELECT* from posts  WHERE idaccounts = "+idaccounts;
        Connection connection = ConnectionMySql.getConnection();
        try {
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(selectAllPost);
            while (rs.next()) {
                int idPost = rs.getInt("idposts");

                String content = rs.getString("content");
                String img = rs.getString("img");
                String time = rs.getString("time");

                postsbyusname.add(new Post(content, img, time, idPost));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return postsbyusname;
    }
    public Post findPostById(int id) {
        String sql = "select posts.idPosts, posts.img, posts.content, Accounts.idAccounts, Accounts.username, posts.time from Posts join accounts on posts.idAccounts = accounts.idaccounts where idPosts ="+id;
        Connection connection = ConnectionMySql.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();

            String name = resultSet.getString("username");
            String img = resultSet.getString("img");
            String content = resultSet.getString("content");

            return new Post(name,img,content);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }











}
