package com.effectivejava.chapter02.item04;

import java.lang.reflect.Constructor;

import com.effectivejava.chapter02.item04.demo.ReflectCreateObject;

public class DemoTest {

	public static void main(String[] args) {
		try {
			Class<ReflectCreateObject> rcoc = ReflectCreateObject.class;
			// 通过有参数的获取相应的构造器
			Constructor<ReflectCreateObject> con = rcoc.getDeclaredConstructor(Integer.class, String.class);
			System.out.println(con.getName());
			con.setAccessible(true);
			ReflectCreateObject refect = con.newInstance(12,"String");
			System.out.println(refect.getName());
			
			// 获取无参的构造器
			Constructor<ReflectCreateObject> cor = rcoc.getDeclaredConstructor();
			System.out.println(cor.getName());
			cor.setAccessible(true);
			ReflectCreateObject refect2= cor.newInstance();
			System.out.println(refect2.getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
