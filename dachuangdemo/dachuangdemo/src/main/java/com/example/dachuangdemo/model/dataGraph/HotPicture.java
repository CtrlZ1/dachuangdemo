package com.example.dachuangdemo.model.dataGraph;

public class HotPicture {
    private double lng;
    private double lat;
    private double count;

    public HotPicture(double lng, double lat, double count) {
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

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }
}
