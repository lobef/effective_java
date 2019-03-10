package com.effectivejava.chapter02.item01.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateReferenceObject {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		Map<String,List<String>> map1 = newInstance();

	}

	public static <K, V> Map<K, V> newInstance() {
		return new HashMap<K, V>();
	}

}
