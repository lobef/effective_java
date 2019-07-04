package com.effectivejava.chapter02.item06.demo;

public class StringObject {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 不能这样创建对象，因为虚拟机中"stringette"本身是一个对象，之后在赋值给s
		// 如果大量创建这种类型的对象，严重影响效率
		String s = new String("stringette");
		// 正确做法
		String s1 = "stringette";

	}

}
