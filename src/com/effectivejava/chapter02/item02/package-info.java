/**
 * 
 * 遇到多个构造器参数时要考虑构造器，一般分三种模式：
 * 1.重叠构造器模式（com.effectivejava.chapter02.item02.demo.NutritionFacts）
 * 缺点：重叠构造器模式可行，但仅限于参数数量少的情况。当参数数量很多时，客户端很难编写，并且较难阅读。 容易产生错误，需要知道每个参数代表的是什么。
 * 2.Java Bean模式（com.effectivejava.chapter02.item02.demo.NutritionFactsJavaBean）
 * 使用无参构造器创建对象，然后调用setter方法为必须参数设置值，以及设置可选参数 缺点：
 * 1).在多个调用过程中，在构造过程中JavaBean可能处于数据不一致的状态，试图使用状态不一致的对象，将会导致失败
 * 2).JavaBean模式阻止了把类做成不可变的可能，需要程序员做额外的努力保证数据安全
 * 3.builder模式（com.effectivejava.chapter02.item02.demo.NutritionFactsBuilder）
 * 优点：客户端代码易于编写和阅读，比JavaBean模式更加安全 缺点：对性能有略微影响，十分注重性能的应用可能会受到影响
 * 建议：参数过多的情况（4个以上）优先使用这个builder模式，扩展性良好
 */
package com.effectivejava.chapter02.item02;