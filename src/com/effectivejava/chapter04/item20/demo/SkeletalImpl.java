package com.effectivejava.chapter04.item20.demo;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public interface SkeletalImpl {

	static List<Integer> intArrayAsList(int[] a) {
		Objects.requireNonNull(a);
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int index) {
				return a[index];
			}

			@Override
			public Integer set(int index, Integer element) {
				int oldVal = a[index];
				a[index] = element;
				return oldVal;
			}

			@Override
			public int size() {
				return a.length;
			}

		};
	}

}
