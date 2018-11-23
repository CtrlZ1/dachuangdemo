package com.example.dachuangdemo.model.dataBase;

public class SaleInfo {
    private String name;
    private String lowestPay;
    private String houseType;
    private String openTime;
    private String handinTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLowestPay() {
        return lowestPay;
    }

    public void setLowestPay(String lowestPay) {
        this.lowestPay = lowestPay;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getHandinTime() {
        return handinTime;
    }

    public void setHandinTime(String handinTime) {
        this.handinTime = handinTime;
    }


    public SaleInfo(String name, String lowestPay, String houseType, String openTime, String handinTime) {
        this.name = name;
        this.lowestPay = lowestPay;
        this.houseType = houseType;
        this.openTime = openTime;
        this.handinTime = handinTime;
    }
}
