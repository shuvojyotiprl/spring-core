package com.shuvo.hl.spb.bean;

public class Tringle {
	
	Point pointA;
	Point pointB;
	Point pointC;
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
	@Override
	public String toString() {
		return "Tringle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}

	

}
