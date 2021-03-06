/**
 * 本条学习谨慎并用泛型和可变参数
 * 1.可变参数：定义方法不知道参数的个数，但是知道参数的类型
 * 格式为（参数类型... 参数名）（例子com.effectivejava.chapter05.item32.demo.VarargDemo）
 * 2.@SafeVarargs注解是消除带有泛型可变参数的告警，是通过放的设计者做出承诺，声明这是类型安全的（java.util.Arrays.asList(T...)）
 * 3.允许另一个方法访问一个泛型可变参数数组是不安全的，以下两种情况除外：
 * 	①将数组传给另一个用@SafeVarargs正确注解过的可变参数方法
 * 	②将数组传给只计算数组内容部分函数的非可变参数方法
 * 4.泛型可变参数方法什么条件下是安全的
 * 	①它没有在可变参数数组中保存任何值
 *	②它没有堆不被信任的代码开放该数组（或者其克隆程序）
 * 5.@SafeVarargs使用限制java8中只有静态方法和final实例方法中才能使用，在java9中添加私有方法也可以添加
 * 
 * 
 * 
 */
package com.effectivejava.chapter05.item32;