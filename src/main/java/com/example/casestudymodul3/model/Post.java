package com.example.casestudymodul3.model;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Post {
    private int idPost;
    private int idaccount;
    private String username;
    private String img;
    private String content;
    private String time;
    private String avatarurl;

    public Post() {
    }

    public Post(int idaccount, String username, String img, String content, String time, String avatarurl) {
        this.idaccount = idaccount;
        this.username = username;
        this.img = img;
        this.content = content;
        this.time = time;
        this.avatarurl = avatarurl;
    }
    public Post( String username, String img, String content, String time, String avatarurl,int idPost) {
        this.idPost = idPost;
        this.username = username;
        this.img = img;
        this.content = content;
        this.time = time;
        this.avatarurl = avatarurl;
    }

    public Post(int idPost, int idaccount, String username, String img, String content, String time, String avatarurl) {
        this.idPost = idPost;
        this.idaccount = idaccount;
        this.username = username;
        this.img = img;
        this.content = content;
        this.time = time;
        this.avatarurl = avatarurl;
    }

    public Post(int idPost, String username, String img, String content) {
        this.idPost = idPost;
        this.username = username;
        this.img = img;
        this.content = content;
    }

    public Post(int idPost,  String img, String content) {
        this.idPost = idPost;
        this.img = img;
        this.content = content;
    }

    public Post( String img, String content) {
        this.img = img;
        this.content = content;
    }
    public Post(String username, String img, String content) {
        this.username = username;
        this.img = img;
        this.content = content;
    }

    public Post(String username, String linkimg, String noidung, String time, String avatarurl) {
        this.username = username;
        this.img = linkimg;
        this.content = noidung;
        this.time = time;
        this.avatarurl = avatarurl;
    }

    public Post( String username, String img, String content,int idPost) {
        this.idPost = idPost;
        this.username = username;
        this.img = img;
        this.content = content;
    }

//    public Post(String username, String img, String content) {
//        this.username = username;
//        this.img = img;
//        this.content = content;
//    }

    public int getIdaccount() {
        return idaccount;
    }

    public void setIdaccount(int idaccount) {
        this.idaccount = idaccount;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    public Post(String username, String img, String content, String time) {
        this.username = username;
        this.img = img;
        this.content = content;
        this.time = time;
    }

    public Post(int idPost, String username, String img, String content, String time) {
        this.idPost = idPost;
        this.username = username;
        this.img = img;
        this.content = content;
        this.time = time;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
