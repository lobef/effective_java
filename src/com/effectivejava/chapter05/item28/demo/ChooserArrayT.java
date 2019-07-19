package com.effectivejava.chapter05.item28.demo;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ChooserArrayT<T> {

	private final T[] choiceArray;

	public ChooserArrayT(Collection<T> choices) {
		choiceArray = (T[]) choices.toArray();// 有受检警告
	}
	
	public Object choose(){
		Random rnd = ThreadLocalRandom.current();
		return choiceArray[rnd.nextInt(choiceArray.length)];
	}

}
