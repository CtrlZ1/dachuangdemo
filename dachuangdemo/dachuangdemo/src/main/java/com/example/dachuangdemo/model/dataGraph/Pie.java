package com.example.dachuangdemo.model.dataGraph;

public class Pie {
	private String name;
	private int  value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Pie(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}
	public Pie() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}