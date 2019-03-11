/**
 * 本条说明避免创建不必要的对象 
 * 总结： 
 * 1.将不变的对象尽可能的重用 
 * 2.尽量使用基本类型，不使用包装类型 
 * 3.减少无意识的自动拆装箱
 * 4.同时提供静态工厂方法和构造器的不可变类，优先使用静态工厂方法常见对象，如Boolean.valueOf(String)，而不使用new
 * Boolean(String);
 * 
 * 
 * 
 */
package com.effectivejava.chapter02.item05;