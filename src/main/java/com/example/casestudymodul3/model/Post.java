package com.example.casestudymodul3.model;

import java.util.Date;

public class Post {
    private int idPost;
    private String userName;
    private String content;
    private String img;
    private Date time;
    private int likecount;


    public Post() {
    }


    public Post(int idPost, String content, String img, Date time, int likecount) {
        this.idPost = idPost;
        this.content = content;
        this.img = img;
        this.time = time;
        this.likecount = likecount;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getLikecount() {
        return likecount;
    }

    public void setLikecount(int likecount) {
        this.likecount = likecount;
    }
}
