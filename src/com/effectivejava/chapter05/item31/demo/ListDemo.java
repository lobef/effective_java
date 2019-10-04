package com.effectivejava.chapter05.item31.demo;

import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

	}

	public static <E> void swap1(List<E> list, int i, int j) {// 无限制参数类型
		list.set(i, list.set(j, list.get(i)));// 这个可以正确编译
	}

	public static void swap2(List<?> list, int i, int j) {// 无限制通配符
		// list.set(i, list.set(j, list.get(i)));
		// 出现的错误信息
		// The method set(int, capture#2-of ?) in the type List<capture#2-of ?>
		// is not applicable for the arguments (int, capture#3-of ?)
		swapHelper(list, i, j);
	}

	private static <E> void swapHelper(List<E> list, int i, int j) {

	}
}
