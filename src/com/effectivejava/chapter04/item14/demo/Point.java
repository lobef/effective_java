package com.effectivejava.chapter04.item14.demo;

/**
 * 正确的做法，提供私有域和公有方法来，改变类中的属性值和设置属性值
 *
 */
public class Point {

	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
