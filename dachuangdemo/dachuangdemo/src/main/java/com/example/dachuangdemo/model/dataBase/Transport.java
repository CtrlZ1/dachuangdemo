package com.example.dachuangdemo.model.dataBase;

public class Transport {
    private String name;
    private Integer distance;
    private String point;
    private String line;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public Transport(String name, Integer distance, String point, String line) {
        this.name = name;
        this.distance = distance;
        this.point = point;
        this.line = line;
    }
}
