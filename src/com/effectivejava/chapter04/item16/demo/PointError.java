package com.effectivejava.chapter04.item16.demo;

/**
 * 此类用作错误的示范
 *
 */
public class PointError {
	public double x;
	public double y;
	// x和y可以直接被访问，如果不改变api，就无法改变它的表示法，也无法强加约束条件，当域被访问时，无法采取任何辅助的行动
}
