package com.effectivejava.chapter04.item17.demo;

import java.math.BigInteger;
import java.util.BitSet;

// 不可变对象的缺点演示
// 重复创建对象，对性能有一定影响
public class ImmutableObject {

	public static void main(String[] args) {

		BigInteger moby = new BigInteger("1222");
		moby = moby.flipBit(0);
		BitSet moby1 = new BitSet(2343434);
		moby1.flip(0);
	}
}
