package com.example.dachuangdemo.model.dataBase;

public class CommunityInfo {
    private String name;
    private String buildingType;
    private String propertyYear;
    private String plotRate;
    private String greenRate;
    private String household;
    private String floorCondition;
    private String projectPlan;
    private String propertyFee;
    private String propertyCompany;
    private String parkNum;
    private String parkProportion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getPropertyYear() {
        return propertyYear;
    }

    public void setPropertyYear(String propertyYear) {
        this.propertyYear = propertyYear;
    }

    public String getPlotRate() {
        return plotRate;
    }

    public void setPlotRate(String plotRate) {
        this.plotRate = plotRate;
    }

    public String getGreenRate() {
        return greenRate;
    }

    public void setGreenRate(String greenRate) {
        this.greenRate = greenRate;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public String getFloorCondition() {
        return floorCondition;
    }

    public void setFloorCondition(String floorCondition) {
        this.floorCondition = floorCondition;
    }

    public String getProjectPlan() {
        return projectPlan;
    }

    public void setProjectPlan(String projectPlan) {
        this.projectPlan = projectPlan;
    }

    public String getPropertyFee() {
        return propertyFee;
    }

    public void setPropertyFee(String propertyFee) {
        this.propertyFee = propertyFee;
    }

    public String getPropertyCompany() {
        return propertyCompany;
    }

    public void setPropertyCompany(String propertyCompany) {
        this.propertyCompany = propertyCompany;
    }

    public String getParkNum() {
        return parkNum;
    }

    public void setParkNum(String parkNum) {
        this.parkNum = parkNum;
    }

    public String getParkProportion() {
        return parkProportion;
    }

    public void setParkProportion(String parkProportion) {
        this.parkProportion = parkProportion;
    }

    public CommunityInfo(String name, String buildingType, String propertyYear, String plotRate, String greenRate, String household, String floorCondition, String projectPlan, String propertyFee, String propertyCompany, String parkNum, String parkProportion) {
        this.name = name;
        this.buildingType = buildingType;
        this.propertyYear = propertyYear;
        this.plotRate = plotRate;
        this.greenRate = greenRate;
        this.household = household;
        this.floorCondition = floorCondition;
        this.projectPlan = projectPlan;
        this.propertyFee = propertyFee;
        this.propertyCompany = propertyCompany;
        this.parkNum = parkNum;
        this.parkProportion = parkProportion;
    }
}
