package com.effectivejava.chapter02.item03.demo;

/**
 * 
 * 这种模式是懒加载模式
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

	// 线程安全模式，将synchronized写在方法里面如下,这种模式，效率低下，与上面的类似
	public static ElvisLazyMode getSyncFuntionInstance() {
		if (INSTANCE == null) {
			synchronized (ElvisLazyMode.class) {
				INSTANCE = new ElvisLazyMode();
			}
		}
		return INSTANCE;
	}

	// 使用双重判断，既保证了高效，也保证线程安全——推荐使用
	public static ElvisLazyMode getDoubleJudgeSyncInstance() {
		if (INSTANCE == null) {
			synchronized (ElvisLazyMode.class) {
				if (INSTANCE == null)
					INSTANCE = new ElvisLazyMode();
			}
		}
		return INSTANCE;
	}

}
