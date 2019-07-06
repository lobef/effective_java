package com.effectivejava.chapter05.item26.demo;

import java.util.Set;

public class UnboundTypeDemo {

	// 不确定或者不关心实际的类型的 类型参数，原生态类型的写法
	static int numElementsInCommon(Set s1, Set s2) {
		int result = 0;
		for (Object o1 : s1) {
			if (s2.contains(o1))
				result++;
		}
		return result;
	}

	// 使用无限制通配符类型写法，这样做的目的是安全
	static int numElementsInCommon2(Set<?> s1, Set<?> s2) {
		int result = 0;
		for (Object o1 : s1) {
			if (s2.contains(o1))
				result++;
		}

		return result;

	}

}
