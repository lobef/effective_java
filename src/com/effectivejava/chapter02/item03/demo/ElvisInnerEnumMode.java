package com.effectivejava.chapter02.item03.demo;

/**
 * 
 * 内部枚举类型，这种方式效果与懒加载类似，因为内部枚举类型，只有创建外部类加载时才会进行类加载，这样使得java虚拟机保证线程安全问题——推荐使用
 */
public class ElvisInnerEnumMode {

	private ElvisInnerEnumMode() {

	}

	private enum ElvisEnum {
		INSTANCE;
		private ElvisInnerEnumMode INNER_ENUM_INSTANCE;

		private ElvisEnum() {
			INNER_ENUM_INSTANCE = new ElvisInnerEnumMode();
		}

		public ElvisInnerEnumMode getInstance() {
			return INNER_ENUM_INSTANCE;
		}
	}

	public static ElvisInnerEnumMode getInstance() {
		return ElvisEnum.INSTANCE.getInstance();
	}

}
