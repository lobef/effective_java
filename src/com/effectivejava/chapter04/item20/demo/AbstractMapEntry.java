package com.effectivejava.chapter04.item20.demo;

import java.util.Map;
import java.util.Objects;

public abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {

	@Override
	public V setValue(V value) {

		throw new UnsupportedOperationException();
	}

	@Override
	public int hashCode() {

		return Objects.hashCode(getKey()) ^ Objects.hashCode(getValue());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof AbstractMapEntry)) {
			return false;
		}
		Map.Entry<K, V> e = (Map.Entry<K, V>) obj;
		return Objects.equals(getKey(), e.getKey()) && Objects.equals(getValue(), e.getValue());
	}

	@Override
	public String toString() {

		return getKey() + " = " + getValue();
	}

}
