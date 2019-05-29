package com.effectivejava.chapter03.item11.demo;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

	private Object[] elements;
	private int size = 0;
	private final static int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object element = elements[--size];
		elements[size] = null;// 将不使用的元素变为null，以便垃圾回收器回收无用的对象
		return element;
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, size * 2 + 1);
		}
	}

}
