package com.effectivejava.chapter04.item21.demo;

import java.util.Objects;
import java.util.function.Predicate;

public interface CollectionDemo<T> {

	default boolean removeIf(Predicate<T> filter){
		Objects.requireNonNull(filter);
		Object b= new Object();
		//filter.test(b);
		return false;
	}
	
}
