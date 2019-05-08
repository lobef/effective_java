package com.effectivejava.chapter03.item08.demo;

import java.awt.Color;

// equals的方法的传递性
public class Point {

	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Point))
			return false;
		Point p = (Point) o;
		return p.x == x && p.y == y;
	}

}

/*
 * 该类继承于Point类 在此类中没有重写equals方法时，则会使用父类中的equals方法，从而忽略颜色信息
 */
class ColorPoint extends Point {

	private Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

/*	@Override
	public boolean equals(Object o) {// 此equals方法破坏对称性
		if (!(o instanceof ColorPoint))
			return false;
		return super.equals(o) && ((ColorPoint) o).color == color;
	}
	
	public static void main(String[] args) {
		Point p = new Point(1, 2);
		ColorPoint cp = new ColorPoint(1, 2, Color.RED);
		System.out.println(p.equals(cp));// 此比较忽略了颜色
		System.out.println(cp.equals(p));// 此比较p的类型不对，所以返回false
	}
*/
	
	public boolean equals(Object o) {// 此equals破坏了传递性
		if (!(o instanceof Point))
			return false;
		if (!(o instanceof ColorPoint))
			return super.equals(o);
		return super.equals(o) && ((ColorPoint) o).color == color;
	}
	
	public static void main(String[] args) {
		
		ColorPoint cp1 = new ColorPoint(1, 2, Color.RED);
		Point p = new Point(1, 2);
		ColorPoint cp2 = new ColorPoint(1, 2, Color.GREEN);
		System.out.println(cp1.equals(p));
		System.out.println(p.equals(cp2));
		System.out.println(cp1.equals(cp2));
		
	}
	
	// 存在矛盾点：无法在扩展可实例化的类的同时，即增加新的值组件，又保留equals约定
	// 解决方式：放弃面向对象的抽象所带来的优势

}
