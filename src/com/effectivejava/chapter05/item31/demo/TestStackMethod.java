package com.effectivejava.chapter05.item31.demo;

import java.util.ArrayList;
import java.util.Collection;

public class TestStackMethod {
	
	public static void main(String[] args) {
		Stack<Number> numberStack = new Stack<>();
		Iterable<Integer> integers = new ArrayList<>();
		numberStack.pushAll(integers);
		
		Collection<Object> objects = new ArrayList<>();
		numberStack.popAll(objects);
		
		
	}

}
