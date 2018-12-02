package com.example.dachuangdemo.model;

import java.util.ArrayList;


public class LineAndBar {
    private ArrayList<String> xName;
    private ArrayList<Integer> yValue;

    public ArrayList<String> getxName() {
        return xName;
    }

    public void setxName(ArrayList<String> xName) {
        this.xName = xName;
    }

    public ArrayList<Integer> getyValue() {
        return yValue;
    }

    public void setyValue(ArrayList<Integer> yValue) {
        this.yValue = yValue;
    }

    public LineAndBar(ArrayList<String> xName, ArrayList<Integer> yValue) {
        this.xName = xName;
        this.yValue = yValue;
    }
}
