package com.effectivejava.chapter04.item17.demo;

import java.math.BigInteger;

public class BigIntegerDemo {

	// BigInteger进行检查

	public static BigInteger safeInstance(BigInteger val) {
		return val.getClass() == BigInteger.class ? val : new BigInteger(val.toByteArray());
	}

}
