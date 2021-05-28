package com.example.demo;

import java.util.List;

public class Triangle {

//	private List<Point>points;
//
//	public List<Point> getPoints() {
//		return points;
//	}

//	public void setPoints(List<Point> points) {
//		this.points = points;
//	}
//	
//	
//	public void draw() {
//		
//		for (Point point:points)
//			System.out.println("Point A = "+point.getX()+", "+point.getY());
//
//	}
	
	
	
	
	
	private Point pointA;
	private Point pointB;
	private Point pointC;

	
	
	
	
	public void draw() {
		System.out.println("Point A = "+getPointA().getX()+", "+getPointA().getY());
		System.out.println("Point B = "+getPointB().getX()+", "+getPointB().getY());
		System.out.println("Point C = "+getPointC().getX()+", "+getPointC().getY());
	}

	
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private String type;
//	private int hight;
//
//	public Triangle(int hight) {
//		this.hight=hight;
//	}
//	
//	public Triangle(String type) {
//		this.type=type;
//	}
//	
//	public Triangle(String type, int hight) {
//		this.type=type;
//		this.hight=hight;
//	}
	


//	public void draw() {
//		
//		System.out.println(getType() + " Triangle drawn hight is: "+getHight());
//		
//	}
	
//	public int getHight() {
//		return hight;
//	}
//
//	public String getType() {
//		return type;
//	}

//	public void setType(String type) {
//		this.type = type;
//	}
	
}
