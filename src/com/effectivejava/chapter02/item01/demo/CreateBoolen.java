package com.effectivejava.chapter02.item01.demo;

/**
 * 使用静态工厂方法代替构造器
 * 
 * @author LOBEF
 *
 */

public class CreateBoolen {

	public static Boolean valueOf(boolean b) {
		return b ? Boolean.TRUE : Boolean.FALSE;
	}

	public static void main(String[] args) {
		System.out.println(valueOf(true) == valueOf(true));

	}

}
