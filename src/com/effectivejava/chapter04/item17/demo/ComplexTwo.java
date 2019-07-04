package com.effectivejava.chapter04.item17.demo;

public class ComplexTwo {

	private final double re;
	private final double im;

	private ComplexTwo(double re,double im){
		this.re = re;
		this.im=im;
	}
	
	public static ComplexTwo valueOf(double re,double im){
		return new ComplexTwo(re, im);
	}
	

}
