package com.effectivejava.chapter05.item26.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class InstanceofDemo {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		if (strList instanceof List<?>) {// 可以编译通过

		}
		if (strList instanceof List) {// 也可以编译通过

		}

		// if(strList instanceof List<String>){// 编译不通过
		//
		// }
	}
	
	static void setDemo(Set<String> set){// 这么做是首选方法
		
		if(set instanceof Set){
			Set<?> s = set;
			
		}
		
	}
	

}
