package com.effectivejava.chapter02.item03.demo;

/**
 * 这个模式是懒汉模式，以下两种都可以
 * 
 *
 */
public class ElvisStaticFactoryMode {

	private final static ElvisStaticFactoryMode INSTANCE = new ElvisStaticFactoryMode();

	private ElvisStaticFactoryMode() {

	}

	public static ElvisStaticFactoryMode getInstance() {
		return INSTANCE;
	}

	public void leaveTheBuilding() {

	}

}

// 这种写法的变体，使用静态代码块进行创建对象
class ElvisStaticBlockMode {
	private static ElvisStaticBlockMode INSTANCE = null;

	static {
		INSTANCE = new ElvisStaticBlockMode();
	}

	private ElvisStaticBlockMode() {

	}

	public static ElvisStaticBlockMode getInstance() {
		return INSTANCE;
	}

	public void leaveTheBuilding() {

	}
}
