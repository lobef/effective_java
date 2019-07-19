package com.effectivejava.chapter05.item28.demo;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ChooserArray {

	private final Object[] choiceArray;

	public ChooserArray(Collection choices) {// 这里有一个告警
		choiceArray = choices.toArray();
	}

	public Object choose() {
		Random rnd = ThreadLocalRandom.current();

		return choiceArray[rnd.nextInt(choiceArray.length)];
	}

}
