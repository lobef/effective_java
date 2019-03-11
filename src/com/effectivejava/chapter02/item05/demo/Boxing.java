package com.effectivejava.chapter02.item05.demo;

public class Boxing {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Long sum = 0l;
				long start = System.currentTimeMillis();
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					sum += i;
				}
				long end = System.currentTimeMillis();

				System.out.println("所求和为：" + sum);
				System.out.println("t1耗费的时间：" + (end - start));
			}
		});
		t1.start();
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				long sum = 0l;
				long start = System.currentTimeMillis();
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					sum += i;
				}
				long end = System.currentTimeMillis();
				System.out.println("所求和为：" + sum);
				System.out.println("t2耗费的时间：" + (end - start));
			}
		});
		t2.start();
	}
	// 这段代码本身没有什么问题，但是在每次相加时都会创建一个Long的对象，创建Integer.MAX_VALUE个对象，这样严重影响效率
	// 所求和为：2305843005992468481
	// t2耗费的时间：796
	// 所求和为：2305843005992468481
	// t1耗费的时间：4399
	// 两者对比，影响明显
}
