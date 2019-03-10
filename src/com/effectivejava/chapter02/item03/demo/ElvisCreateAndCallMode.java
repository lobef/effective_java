package com.effectivejava.chapter02.item03.demo;

/**
 * 
 * 创建对象和调用对象分离
 *
 */
public class ElvisCreateAndCallMode {

	private static ElvisCreateAndCallMode INSTANCE = null;

	private ElvisCreateAndCallMode() {

	}

	private static synchronized ElvisCreateAndCallMode createInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ElvisCreateAndCallMode();
		}
		return INSTANCE;
	}

	public static ElvisCreateAndCallMode getInstance() {
		if (INSTANCE == null) {
			INSTANCE = createInstance();
		}
		return INSTANCE;
	}

}
