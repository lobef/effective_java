package com.effectivejava.chapter03.item11;

import com.effectivejava.chapter03.item11.demo.Person;

public class TestPerson {

	public static void main(String[] args) {
		Person per = new Person();
		per.setAge(12);
		per.setHobby("xuexi");
		per.setName("lining");

		Person per1 = new Person();

		per1.setAge(12);
		per1.setHobby("xuexi");
		per1.setName("lining");

		System.out.println(per.equals(per1));

		System.out.println("per.hashCode():" + per.hashCode());
		System.out.println("per1.hashCode():" + per1.hashCode());
	}

}
