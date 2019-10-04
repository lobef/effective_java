package com.effectivejava.chapter05.item31.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

public class Stack<E> {

	private E[] elements;
	private int size;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	@SuppressWarnings("unchecked")
	public Stack() {
		elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public E pop() {
		if (size == 0)
			throw new EmptyStackException();
		E e = elements[--size];
		elements[size] = null;
		return e;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}

	public void pushAll(Iterable<? extends E> src) {// 使用有限制的通配符类型
		for (E e : src)
			push(e);
	}

	public void popAll(Collection<? super E> dst) {
		while (!isEmpty()) {
			dst.add(pop());
		}

	}

}
