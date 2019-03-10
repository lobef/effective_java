package com.effectivejava.chapter02.item03.demo;

/**
 * 这个模式是懒汉模式
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
