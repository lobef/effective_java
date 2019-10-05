package com.effectivejava.chapter05.item32.demo;

/**
 * 在网上找的例子测试了一下
 *
 */
public class VarargDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int result = sum(a, b);
		System.out.println("result:" + result);

		int c = 30;
		result = sum(a, b, c);
		System.out.println("result:" + result);

		int d = 40;
		result = sum(a, b, c, d);
		System.out.println("result:" + result);

		System.out.println("可变参数的方法:" + sum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
		System.out.println("可变参数的方法:" + sum(1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

	private static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	private static int sum(int b, int... a) {
		int s = 0;
		for (int i : a) {
			s += i;
		}
		return s + b;
	}

}
