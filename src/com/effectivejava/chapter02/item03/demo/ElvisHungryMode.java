package com.effectivejava.chapter02.item03.demo;
/**
 * 这个模式是饿汉模式，可以使用ElvisHungryMode.INSTANCE获取对象
 *
 */
public class ElvisHungryMode {

	public static final ElvisHungryMode INSTANCE = new ElvisHungryMode();

	private ElvisHungryMode() {

	}

	public void leaveTheBuilding() {

	}

}
