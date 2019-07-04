package com.effectivejava.chapter03.item14.demo;

public final class CaseInsensitiveString implements Comparable<CaseInsensitiveString> {

	private final String s;

	public CaseInsensitiveString(String s) {
		if (s == null)
			throw new NullPointerException();
		this.s = s;
	}

	@Override
	public int compareTo(CaseInsensitiveString o) {
		return String.CASE_INSENSITIVE_ORDER.compare(s, o.s);
	}

}
