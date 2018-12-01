package com.example.dachuangdemo.model.dataGraph;

public class Pie {
	
	private String name;
	private String  value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Pie(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	public Pie() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}