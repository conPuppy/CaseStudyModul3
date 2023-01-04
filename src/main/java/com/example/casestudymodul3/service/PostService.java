package com.example.casestudymodul3.service;

import com.example.casestudymodul3.DAO.PostDAO;
import com.example.casestudymodul3.model.Post;

import java.util.List;

public class PostService {
    static PostDAO postDAO = new PostDAO();

    public static List<Post> getAll() {
        return postDAO.getAll();
    }

    public static List<Post> getAllMyPosts(int idAccounts) {
        return postDAO.getAllMyPosts(idAccounts);
    }

    public static void save(Post post) {
        postDAO.save(post);
    }

    public static void edit(Post post) {
        postDAO.edit(post);
    }
    public static void delete(int id) {
        postDAO.delete(id);
    }
    public static Post findPostById(int id) { return postDAO.findPostById(id); }
    public static List<Post> showPostByUsername(int idaccounts) {
        return   PostDAO.showpostbyusername(idaccounts);
    }
}
