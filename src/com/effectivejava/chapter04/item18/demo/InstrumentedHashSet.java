package com.effectivejava.chapter04.item18.demo;

import java.util.Collection;
import java.util.HashSet;

public class InstrumentedHashSet<T> extends HashSet<T> {

	private static final long serialVersionUID = -401133990003713249L;

	private int addCount = 0;

	public InstrumentedHashSet() {

	}

	public InstrumentedHashSet(int initCap, float loadFactor) {
		super(initCap, loadFactor);
	}

	@Override
	public boolean add(T e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends T> col) {
		addCount += col.size();
		return super.addAll(col);
	}

	public int getAddCount() {
		return addCount;
	}

}
