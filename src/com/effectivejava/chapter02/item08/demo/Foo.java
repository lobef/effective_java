package com.effectivejava.chapter02.item08.demo;

@SuppressWarnings("unused")
public class Foo {
	// 终结方法守卫者，将终结方法在匿名类中，该类的作用是终结外围实例
	private Object finalizerGuardian = new Object() {// 匿名类
		@Override
		protected void finalize() throws Throwable {
			// finalize outer Foo object
			super.finalize();
		}
	};

	@Override
	protected void finalize() throws Throwable {
		try {
			// todo other thing
		} finally {
			super.finalize();
		}
	}

}
