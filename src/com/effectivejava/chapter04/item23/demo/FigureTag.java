package com.effectivejava.chapter04.item23.demo;

/**
 * 
 * 这段代码，充斥样板代码，包括枚举声明，标签域以及条件语句，可读性差，域不能做成final的
 * 
 *
 */
public class FigureTag {

	enum Shape {
		RECTANGLE, CIRCLE
	}

	final Shape shape;

	double length;
	double width;

	double radius;

	public FigureTag(double radius) {
		shape = Shape.CIRCLE;
		this.radius = radius;
	}

	public FigureTag(double length, double width) {
		shape = Shape.RECTANGLE;
		this.length = length;
		this.width = width;
	}

	public double area() {
		switch (shape) {
		case RECTANGLE:
			return length * width;
		case CIRCLE:
			return Math.PI * (radius * radius);
		default:
			throw new AssertionError();
		}
	}

}
