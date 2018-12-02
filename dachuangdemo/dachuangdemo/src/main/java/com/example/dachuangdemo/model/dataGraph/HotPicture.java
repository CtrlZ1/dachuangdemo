package com.example.dachuangdemo.model.dataGraph;

public class HotPicture {
    private double lng;
    private double lat;
    private Integer count;

    public HotPicture(double lng, double lat, Integer count) {
        this.lng = lng;
        this.lat = lat;
        this.count = count;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
