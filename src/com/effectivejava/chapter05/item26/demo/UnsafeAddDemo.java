package com.effectivejava.chapter05.item26.demo;

import java.util.ArrayList;
import java.util.List;

public class UnsafeAddDemo {
	
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
//		unsafeAdd(strings, Integer.valueOf(42));
		String s = strings.get(0);
		System.out.println(s);
		
		// 不能将任何元素放到Collection<?>中，null除外
		List<?> list = new ArrayList<>();
//		list.add(34);
//		list.add("sfsdf");
		
		
	}
	
//	这个方法在编译期没有问题，但是运行期则会出现ClassCastException问题
//	private static void unsafeAdd(List list,Object o){
//		list.add(o);
//	}
	// 如果将原生态List转换为List<Object>，则编译不通过
	private static void unsafeAdd(List<Object> list,Object o){
		list.add(o);
	}

}
