package com.effectivejava.chapter03.item09.demo;

public final class PhoneNumber {

	private final short areaCode;
	private final short prefix;
	private final short lineNumber;

	public PhoneNumber(int areaCode, int prefix, int lineNumber) {
		rangeCheck(areaCode, 999, "area code");
		rangeCheck(prefix, 999, "prefix");
		rangeCheck(lineNumber, 9999, "line number");
		this.areaCode = (short) areaCode;
		this.prefix = (short) prefix;
		this.lineNumber = (short) lineNumber;
	}

	private void rangeCheck(int arg, int max, String name) {
		if (arg < 0 || arg > max) {
			throw new IllegalArgumentException(name.concat(" : ").concat(String.valueOf(arg)));
		}
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof PhoneNumber))
			return false;
		PhoneNumber p = (PhoneNumber) o;
		return p.areaCode == areaCode && p.prefix == prefix && p.lineNumber == lineNumber;
	}

	// public int hashCode(){// 这是个糟糕的写法，因为这样会使得map中存入的元素形成一个大链表，违背了快速查找
	// return 42;
	// }

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + areaCode;
		result = 31 * result + prefix;
		result = 31 * result + lineNumber;
		return result;
	}

	@Override
	public String toString() {
		return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber);
	}

}
