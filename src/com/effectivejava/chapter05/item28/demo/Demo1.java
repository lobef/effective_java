package com.effectivejava.chapter05.item28.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		Object[] objectArray = new Long[1];
		objectArray[0] = "I don't fit in";// 只有在运行期才报异常：java.lang.ArrayStoreException
		
//		List<Object> ol = new ArrayList<Long>();// 编译不通过AssignmentOperator Expression
//		ol.add("I don't fit in");
		
		// 数组和泛型不能很好的混合使用   泛型数组创建错误
//		new List<Object>[10];
//		new List<String>[10];
		List<?>[] li = new List<?>[10];// 这样是可以的
		Object[] ob = li;
		List<Integer> list = new ArrayList<Integer>();
		list.add(42);
		ob[0]=list;
		
		@SuppressWarnings("unused")
		String s = (String) ((List<?>) ob[0]).get(0);// java.lang.ClassCastException
		
		
		
		
		
		
		
	}

}
