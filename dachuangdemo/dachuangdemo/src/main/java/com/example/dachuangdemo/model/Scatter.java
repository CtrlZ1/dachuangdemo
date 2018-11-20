package com.example.dachuangdemo.model;

public class Scatter {
    private String city;
    private int value;

    public Scatter(String city,int value)
    {
        this.city=city;
        this.value=value;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
