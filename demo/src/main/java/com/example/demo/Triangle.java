package com.example.demo;


public class Triangle {

	private String type;
	private int hight;

	public Triangle(int hight) {
		this.hight=hight;
	}
	
	public Triangle(String type) {
		this.type=type;
	}
	
	public Triangle(String type, int hight) {
		this.type=type;
		this.hight=hight;
	}
	


	public void draw() {
		
		System.out.println(getType() + " Triangle drawn hight is: "+getHight());
		
	}
	
	public int getHight() {
		return hight;
	}

	public String getType() {
		return type;
	}

//	public void setType(String type) {
//		this.type = type;
//	}
	
}
