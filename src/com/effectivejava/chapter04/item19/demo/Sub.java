package com.effectivejava.chapter04.item19.demo;

import java.time.Instant;

public class Sub extends Super {

	private final Instant instant;
	
	Sub(){
		instant= Instant.now();
	}
	
	public void overrideMe(){
		System.out.println(instant);
	}
	
	public static void main(String[] args) {
		Sub sub = new Sub();// 会出现null，子类的变量还没有初始化instant，父类就调用了
		sub.overrideMe();// 正常的时间
	}
	
	
	
}
