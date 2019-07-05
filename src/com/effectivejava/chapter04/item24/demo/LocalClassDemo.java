package com.effectivejava.chapter04.item24.demo;

public class LocalClassDemo {

	public static void main(String[] args) {
		System.out.println("-----LocalClassDemo----");
		LocalClassDemo lcd = new LocalClassDemo();
		lcd.test();
	}

	public void test() {
		class LocalClass {
			private int age;
			private String name;

			// public int getAge() {
			// return age;
			// }

			public void setAge(int age) {
				this.age = age;
			}

			// public String getName() {
			// return name;
			// }

			public void setName(String name) {
				this.name = name;
			}

			@Override
			public String toString() {
				return "LocalClass [age=" + age + ", name=" + name + "]";
			}

			void println() {
				System.out.println("这个是方法的局部类");
			}
		}

		LocalClass lc = new LocalClass();
		lc.setAge(23);
		lc.setName("tomddf");
		lc.println();
		System.out.println(lc);
	}

}
