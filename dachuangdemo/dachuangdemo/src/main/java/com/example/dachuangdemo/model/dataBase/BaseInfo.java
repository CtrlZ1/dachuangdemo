package com.example.dachuangdemo.model.dataBase;

public class BaseInfo {
    private String housename;
    private String saleState;
    private String feature;
    private String price;
    private String sumPrice;
    private String propertise;
    private String developer;
    private String region;
    private String location;

    @Override
    public String toString() {
        return "BaseInfo{" +
                "housename='" + housename + '\'' +
                ", saleState='" + saleState + '\'' +
                ", feature='" + feature + '\'' +
                ", price='" + price + '\'' +
                ", sumPrice='" + sumPrice + '\'' +
                ", propertise='" + propertise + '\'' +
                ", developer='" + developer + '\'' +
                ", region='" + region + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
    }

    public String getSaleState() {
        return saleState;
    }

    public void setSaleState(String saleState) {
        this.saleState = saleState;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(String sumPrice) {
        this.sumPrice = sumPrice;
    }

    public String getPropertise() {
        return propertise;
    }

    public void setPropertise(String propertise) {
        this.propertise = propertise;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /*public BaseInfo(){}
    public BaseInfo(String housename, String saleState, String feature, String price, String sumPrice, String propertise, String developer, String region, String location) {
        this.housename = housename;
        this.saleState = saleState;
        this.feature = feature;
        this.price = price;
        this.sumPrice = sumPrice;
        this.propertise = propertise;
        this.developer = developer;
        this.region = region;
        this.location = location;
    }*/
}
