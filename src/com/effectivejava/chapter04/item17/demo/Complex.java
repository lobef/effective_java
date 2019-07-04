package com.effectivejava.chapter04.item17.demo;

// 被final修饰的类不能被继承
// 不可变对象比较简单
public final class Complex {

	public static final Complex ZERO = new Complex(0, 0);
	public static final Complex ONE = new Complex(1, 0);
	public static final Complex I = new Complex(0, 1);

	private final double re;
	private final double im;

	// 通过构造函数赋值
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}

	// --获取相应的数值---
	public double realPart() {
		return re;
	}

	public double imaginaryPart() {
		return im;
	}

	// 四则运算法则 ：加减乘除
	public Complex plus(Complex c) {
		return new Complex(re + c.re, c.im + im);
	}

	public Complex minus(Complex c) {
		return new Complex(re - c.re, im - c.im);
	}

	public Complex times(Complex c) {
		return new Complex(re * c.re - im * c.im, re * c.im - im * c.re);
	}

	public Complex dividedBy(Complex c) {
		double tmp = c.re * c.re + c.im * im;
		return new Complex((re * c.re + im * c.im) / tmp, (im * c.re - re * c.im) / tmp);
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Complex))
			return false;
		Complex c = (Complex) o;
		return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
	}

	@Override
	public int hashCode() {
		return 31 * Double.hashCode(re) + Double.hashCode(im);
	}

	public String toString() {
		return "(" + re + " + " + im + "i)";
	}

}
