package com.effectivejava.chapter05.demo;

public class Test {

	public static void main(String[] args) {
		System.out.println(Utensil.NAME + Dessert.NAME);
	}

	private class Utensil {
		static final String NAME = "pan";
	}

	private class Dessert {
		static final String NAME = "cake";
	}

}
