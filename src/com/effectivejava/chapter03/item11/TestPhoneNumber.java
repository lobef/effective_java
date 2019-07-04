package com.effectivejava.chapter03.item11;

import java.util.HashMap;
import java.util.Map;

import com.effectivejava.chapter03.item11.demo.PhoneNumber;

/**
 * 在PhoneNumber类中没有覆盖hashCode方法，而只覆盖了equals方法，违反了Object类的通用约定的第二条（package-info.java类中）
 * 相等的对象必须具有相等的散列码
 *
 */
public class TestPhoneNumber {

	public static void main(String[] args) {
		Map<PhoneNumber, String> m = new HashMap<>();
		m.put(new PhoneNumber(707, 867, 5309), "Jerry");
		System.out.println(m.get(new PhoneNumber(707, 867, 5309)));
	}
	// 此例中期望返回Jerry，但是返回的是null，这是PhoneNumber类中没有覆写hashCode方法，导致这两个对象返回不同hashCode码
}
