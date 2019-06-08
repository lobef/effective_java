package com.effectivejava.chapter04.item16;

import java.util.Arrays;

import com.effectivejava.chapter04.item16.demo.InstrumentedHashSet;

public class TestInstrumentedHashSet {

	public static void main(String[] args) {
		InstrumentedHashSet<String> ihs = new InstrumentedHashSet<>();
		ihs.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		System.out.println(ihs.getAddCount());
	}
	/**
	 * 在此说明： 期望值是3，而实际值是6，造成差异的原因是父类中addAll方法会遍历集合中元素，每一个元素会调用一次add方法
	 * 在调用InstrumentedHashSet的addAll方法时，addCount会加三，而每一个元素调用add时，addCount都会加一，所以是6
	 * 
	 * 修正方法：1.重写addAll方法，遍历集合，调用add方法，这种与父类中的实现是一致的（是否有必要）。
	 * 2.去掉InstrumentedHashSet中的addAll方法，直接使用父类中的addAll方法，
	 * 这种写法过于一类父类，只要父类发生变化，可能就会受到影响，这种写法过于脆弱，会随着父类变化而变化
	 * 
	 * 
	 * 
	 * 
	 */

}
