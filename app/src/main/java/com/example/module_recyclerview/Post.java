package com.example.module_recyclerview;

public class Post {
    String userName;
    String imgUrl;
    String description;

    public Post(String username, String imgUrl, String description) {
        this.userName = username;
        this.imgUrl = imgUrl;
        this.description = description;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
