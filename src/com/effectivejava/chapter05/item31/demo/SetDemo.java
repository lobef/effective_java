package com.effectivejava.chapter05.item31.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Set<Integer> integers = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Double> doubles = new HashSet<>(Arrays.asList(1.0, 2.0, 3.0));
		// java 8之前
		Set<Number> numbers = SetDemo.<Number>union(integers, doubles);
		// java8
		Set<Number> numbers2 = SetDemo.union(integers, doubles);
	}

	// 不带有<E>则会出现告警
	public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}

	// Comparable是消费者
	public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
		// 使用的是排序
		return null;
	}

}
