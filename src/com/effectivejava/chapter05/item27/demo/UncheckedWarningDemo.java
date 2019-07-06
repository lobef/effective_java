package com.effectivejava.chapter05.item27.demo;

import java.util.HashSet;
import java.util.Set;

public class UncheckedWarningDemo {
	
	public static void main(String[] args) {
		// 产生一条警告unchecked conversion
		// 消除告警new HashSet<>() java7以上可以
		@SuppressWarnings("unused")
		Set<String> exaltation = new HashSet<>();
	}
	

}
