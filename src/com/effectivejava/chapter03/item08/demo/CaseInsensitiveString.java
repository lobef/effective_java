package com.effectivejava.chapter03.item08.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 本例中讲述的equals方法中的对称性约定
 * 一旦违反了equals约定，当其他对象面对你的对象时，你完全不知道这些对象的行为会怎么样
 *
 */
public class CaseInsensitiveString {

	private String s;

	public CaseInsensitiveString(String s) {
		if (s == null)
			throw new NullPointerException();
		this.s = s;
	}

/*	@Override
	public boolean equals(Object o) {// 这个违反了重写equals方法的自反性原则
		if (o instanceof CaseInsensitiveString)
			return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
		if (o instanceof String)
			return s.equalsIgnoreCase((String) o);
		return false;
	}
*/
	@Override
	public boolean equals(Object o) {
		return o instanceof CaseInsensitiveString && s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
	}

	public static void main(String[] args) {
		CaseInsensitiveString cis = new CaseInsensitiveString("Hello");
		String ci = "hello";
		System.out.println("ci.equals(cis):" + ci.equals(cis));
		System.out.println("cis.equals(ci):" + cis.equals(ci));
		List<CaseInsensitiveString> cisList = new ArrayList<CaseInsensitiveString>();
		cisList.add(cis);
		// ArrayList的contains底层实现是ci.equals(cis)
		System.out.println(cisList.contains(ci));
	}

}
