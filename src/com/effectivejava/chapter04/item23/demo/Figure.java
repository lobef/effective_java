package com.effectivejava.chapter04.item23.demo;

/**
 * 这段代码将标签类转换为类层次，代码清晰明了，扩展良好
 *
 */
public abstract class Figure {

	public abstract double area();

}

// 圆形
class Circle extends Figure {

	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * (radius * radius);
	}

}

// 矩形
class Rectangle extends Figure {

	private final double length;
	private final double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}

}

// 正方形
class Square extends Figure {

	private final double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}

}
