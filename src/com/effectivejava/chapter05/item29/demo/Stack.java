package com.effectivejava.chapter05.item29.demo;

import java.util.Arrays;
import java.util.EmptyStackException;
/**
 * 去掉告警的两种方案：
 * 第一种：也是常用的方法，直接绕过创建泛型数组的禁令，创建一个Object的数组，并将它转换成泛型数组类型。
 * 这条编程人员必须确保未受检的转换不会危及程序的类型安全性
 * 第二种：将elements域的类型从E[]改为Object[]，这样做的是在数组弹出元素时做强转类型
 * 
 * 第一种可读性更强，更简洁，只转换一次，缺点：导致堆污染
 * 第二种弹出一个元素，转换一次
 */
public class Stack<E> {

	private E[] elements;// private Object[] elements------------①
	private int size;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	@SuppressWarnings("unchecked") // 尽可能小的范围禁止警告    将这个注释掉 ------------①
	public Stack() {
		// Cannot create a generic array of E java中不能创建不可具体化的数组
		// elements = new E[DEFAULT_INITIAL_CAPACITY];
		elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY]; // 将强制转换去掉 ------------①
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public E pop() {
		if (size == 0)
			throw new EmptyStackException();
//		@SuppressWarnings("unchecked")
//		E result = (E)elements[--size];// 将数组弹出的元素强制转换 ------------①
		E result = elements[--size];
		elements[size] = null;// 防止内存泄漏
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}

}
