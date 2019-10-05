package com.effectivejava.chapter05.item32.demo;

import java.util.Arrays;
import java.util.List;

public class MixGenericsAndVarargsDemo {

	public static void main(String[] args) {

	}

	/*
	 * 出现如下警告：
	 * Type safety: Potential heap pollution（堆污染） via varargs parameter stringLists
	 * 由此可以得出将值保存在泛型可变参数数组参数中是不安全的
	 */
	public static void dangerous(List<String>... stringLists) {
		List<Integer> intList = Arrays.asList(42);
		Object[] objects = stringLists;
		objects[0] = intList;
		String s = stringLists[0].get(0);
	}

}
