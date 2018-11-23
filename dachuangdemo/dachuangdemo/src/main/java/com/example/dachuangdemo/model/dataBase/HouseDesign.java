package com.example.dachuangdemo.model.dataBase;

public class HouseDesign {
    private String name;
    private String houseType;
    private String distribute;
    private String saleState;
    private String area;
    private String F6;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getDistribute() {
        return distribute;
    }

    public void setDistribute(String distribute) {
        this.distribute = distribute;
    }

    public String getSaleState() {
        return saleState;
    }

    public void setSaleState(String saleState) {
        this.saleState = saleState;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getF6() {
        return F6;
    }

    public void setF6(String f6) {
        F6 = f6;
    }

    public HouseDesign(String name, String houseType, String distribute, String saleState, String area, String f6) {
        this.name = name;
        this.houseType = houseType;
        this.distribute = distribute;
        this.saleState = saleState;
        this.area = area;
        F6 = f6;
    }
}
