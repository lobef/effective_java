package com.effectivejava.chapter05.item32.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ReferenceToGenParArray {

	public static void main(String[] args) {
		String[] attributes = pickTwo("Good", "Fast", "Cheap");// 需要String类型的返回值
	}

	public static <T> T[] pickTwo(T a, T b, T c) {
		switch (ThreadLocalRandom.current().nextInt(3)) {
		case 1:
			return toArray(a, b);
		case 2:
			return toArray(b, c);
		case 3:
			return toArray(a, c);
		}
		throw new AssertionError();
	}

	/*
	 * Type safety: Potential heap pollution via varargs parameter args
	 */
	public static <T> T[] toArray(T... args) {// 返回的Object的类型
		return args;
	}

	@SafeVarargs
	public static <T> List<T> flatten(List<? extends T>... lists) {
		List<T> result = new ArrayList<>();
		for (List<? extends T> list : lists)
			result.addAll(list);
		return result;
	}

	public static <T> List<T> flatten(List<List<? extends T>> lists) {
		List<T> result = new ArrayList<>();
		for (List<? extends T> list : lists)
			result.addAll(list);
		return result;
	}

}
