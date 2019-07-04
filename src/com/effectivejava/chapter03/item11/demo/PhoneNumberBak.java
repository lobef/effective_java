package com.effectivejava.chapter03.item11.demo;

/**
 * 如果一个类是不可变的，并且计算散列码的开销很大，就应该考虑将散列码缓存在对象的内部.
 * 如果这种类型的对象大多数会被计算散列键值，应在创建对象时计算散列码。否则使用懒加载的方式来计算散列码，即第一次使用hashCode方法
 * 尚不清楚时，则使用该类中的方式处理
 */
public class PhoneNumberBak {

	private short areaCode;
	private short prefix;
	private short lineNumber;

	public PhoneNumberBak(int areaCode, int prefix, int lineNumber) {
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
		if (!(o instanceof PhoneNumberBak))
			return false;
		PhoneNumberBak p = (PhoneNumberBak) o;
		return p.areaCode == areaCode && p.prefix == prefix && p.lineNumber == lineNumber;
	}

	private volatile int hashCode;

	@Override
	public int hashCode() {
		int result = hashCode;
		if (result == 0) {
			result = 31 * result + areaCode;
			result = 31 * result + prefix;
			result = 31 * result + lineNumber;
			hashCode = result;
		}
		return result;
	}

}
