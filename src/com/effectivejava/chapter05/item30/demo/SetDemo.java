package com.effectivejava.chapter05.item30.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	// 不带有<E>则会出现告警
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}
	
	public static void main(String[] args) {
		Set<String> guys = new HashSet<String>(Arrays.asList("Tom","Dick","Harry"));
		Set<String> stooges = new HashSet<String>(Arrays.asList("Larry","Moe","Curly"));
		Set<String> aflCio = union(guys,stooges);
		System.out.println(aflCio);
	}

}
