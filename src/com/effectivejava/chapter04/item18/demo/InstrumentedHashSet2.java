package com.effectivejava.chapter04.item18.demo;

import java.util.Collection;
import java.util.Set;

public class InstrumentedHashSet2<T> extends ForwardingSet<T> {

	private int addCount;

	public InstrumentedHashSet2(Set<T> s) {
		super(s);
	}

	@Override
	public boolean add(T e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}

}
