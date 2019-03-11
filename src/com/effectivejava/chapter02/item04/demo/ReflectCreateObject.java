package com.effectivejava.chapter02.item04.demo;

public class ReflectCreateObject {

	private Integer age;
	private String name;

	private ReflectCreateObject() {

	}

	private ReflectCreateObject(Integer age, String name) {
		this.age = age;
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
