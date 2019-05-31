package com.effectivejava.chapter03.item12.demo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

public class BigDecimalDemo {
	// hashset与treeset这两个集合打印出来的结果不一样
	// 由于hashset调用的equals方法，而treeset调用的是Comparable接口的compareTo方法进行比较
	// BigDecimal的equals方法和compareTo方法返回的结果是不一致的
	public static void main(String[] args) {
		HashSet<BigDecimal> hb = new HashSet<>();
		hb.add(new BigDecimal("1.0"));
		hb.add(new BigDecimal("1.00"));
		System.out.println(hb);
		TreeSet<BigDecimal> tb = new TreeSet<>();
		tb.add(new BigDecimal("1.0"));
		tb.add(new BigDecimal("1.00"));
		System.out.println(tb);
	}

}
