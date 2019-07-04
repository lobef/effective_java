package com.effectivejava.chapter04.item15.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysDemo {

	public static final Thing[] VALUES = {};// 潜在的安全漏洞，其他客户端可以修改数组中的成员

	// 修正这个此错误，有两种方法
	// 方法一，创建一个私有的不可变的数组，然后将数组转变为公有的不可修改的list
	private static final Thing[] VALUES_ONE = {};
	public static final List<Thing> VALUES_LIST = Collections.unmodifiableList(Arrays.asList(VALUES_ONE));
	// 方法二，写一个公有方法，返回私有数组的一个副本
	public static final Thing[] values() {
		return VALUES_ONE.clone();
	}

}
