package com.effectivejava.chapter04.item16;

import java.util.Arrays;
import java.util.HashSet;

import com.effectivejava.chapter04.item16.demo.InstrumentedHashSet2;

public class TestInstrumentedHashSet2 {

	public static void main(String[] args) {
		InstrumentedHashSet2<String> ihs = new InstrumentedHashSet2<>(new HashSet<>());
		ihs.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		System.out.println(ihs.getAddCount());
	}

}
