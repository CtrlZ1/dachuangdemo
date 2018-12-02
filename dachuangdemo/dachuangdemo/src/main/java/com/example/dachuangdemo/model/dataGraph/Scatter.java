package com.example.dachuangdemo.model.dataGraph;

public class Scatter {
    private String city;
    private double value;

    public Scatter(String city,double value)
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
