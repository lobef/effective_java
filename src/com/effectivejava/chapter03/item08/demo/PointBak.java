package com.effectivejava.chapter03.item08.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 里氏替换原则：一个类的属性和方法，在其子类同样适用
 *
 */
public class PointBak {

	private final int x;
	private final int y;

	public PointBak(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object o) {
		if (o == null || o.getClass() != getClass())
			return false;
		PointBak p = (PointBak) o;
		return p.x == x && p.y == y;
	}
	
	private static Set<PointBak> sp = new HashSet<>();
	static{
		sp.add(new PointBak(0, 1));
		sp.add(new PointBak(1, 0));
		sp.add(new PointBak(0, -1));
		sp.add(new PointBak(-1, 0));
	}
	
	public static boolean onUnitCircle(PointBak pointBak){
		return sp.contains(pointBak);
	}
	public static void main(String[] args) {
		System.out.println(PointBak.onUnitCircle(new CounterPoint(1, 0)));
	}
	
}

class CounterPoint extends PointBak{

	private final static AtomicInteger counter = new AtomicInteger();
	
	public CounterPoint(int x, int y) {
		super(x, y);
		counter.incrementAndGet();
	}
	
	public int numberCreated(){
		return counter.get();
	}
	
	
}


