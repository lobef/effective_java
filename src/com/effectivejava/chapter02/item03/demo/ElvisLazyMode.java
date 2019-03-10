package com.effectivejava.chapter02.item03.demo;

/**
 * 
 * 这种模式是懒加载模式，但是非线程安全模式
 *
 */
public class ElvisLazyMode {

	private static ElvisLazyMode INSTANCE = null;

	private ElvisLazyMode() {

	}

	// 非线程安全模式
	public static ElvisLazyMode getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ElvisLazyMode();
		}
		return INSTANCE;
	}

	// 线程安全的单利模式，但是效率低下，只有一个线程可以进入，其他线程需要等待
	public static synchronized ElvisLazyMode getSyncInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ElvisLazyMode();
		}
		return INSTANCE;
	}
	// 双重线程安全模式
	public static ElvisLazyMode getDoubleSyncInstance(){
		
		return INSTANCE;
	}

}
