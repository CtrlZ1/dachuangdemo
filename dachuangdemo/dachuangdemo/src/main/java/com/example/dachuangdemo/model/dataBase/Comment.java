package com.example.dachuangdemo.model.dataBase;
public class Comment {
    private String housename;
    private String text;
    public Comment(String housename, String text) {
        this.housename = housename;
        this.text = text;
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public Comment() {
    }
}
