package com.effectivejava.chapter04.item24.demo;

interface AnonInner {
	int add(int y);
}

// 
public class AnonymousClassDemo {

	public AnonInner getAnonInner(final int x) {
		return new AnonInner() {
			int z = 100;

			@Override
			public int add(int y) {

				return x + y + z;
			}
		};
	}

}
