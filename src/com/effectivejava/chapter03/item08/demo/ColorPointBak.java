package com.effectivejava.chapter03.item08.demo;

import java.awt.Color;

// 这个是避免继承添加属性的权宜之计，既可以满足equals方法，又可以避免破坏规则
// 在java类库中timestamp和date是父子类，timestamp方法增加了nanoseconds域，所以不能将两者混用，防止出现不正确的事情发生
public class ColorPointBak {

	private final Point point;
	private final Color color;

	public ColorPointBak(int x, int y, Color color) {
		if (color == null)
			throw new NullPointerException();
		point = new Point(x, y);
		this.color = color;
	}

	public Point asPoint() {
		return point;
	}

	public boolean equals(Object o) {
		if (!(o instanceof ColorPointBak))
			return false;
		ColorPointBak p = (ColorPointBak) o;
		return p.point.equals(point) && p.color == color;
	}

}
