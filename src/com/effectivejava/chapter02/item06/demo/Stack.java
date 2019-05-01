package com.effectivejava.chapter02.item06.demo;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 此例中存在内存泄露问题，从栈中弹出对象后，数组中的该对象并没有被清空（应该被清空）， 还被数据对象持有，这样在极端情况下，会导致堆栈溢出。
 * 此数组中活动部分指数组的下角标小于size的部分，而大于size的部分是过期引用
 */
public class Stack {

	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		return elements[--size];
	}

	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, size * 2 + 1);
	}

	// 修复过期引用导致内存泄露问题
	public Object popBak() {
		if (elements.length == size)
			throw new EmptyStackException();
		Object e = elements[--size];
		elements[size] = null;// 将不用的引用设置为null
		return e;

	}
}
