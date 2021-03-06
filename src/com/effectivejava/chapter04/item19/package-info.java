/**
 * 
 * 本节讲述要么设计集成并提供文档说明，要么禁止继承
 * 1.该类文档必须精确地描述覆盖每个方法所带来的影响，也就说，该类必须要有文档说明它可覆盖的方法的自用型。
 * 2.对于为了继承而设计的类，唯一的测试方法是编写子类，编写三个子类足以测试可扩展的类
 * 3.构造器决不能调用被覆盖的方法，这个由于父类会先于子类执行，这样会产生子类没有初始化则被调用导致失败
 * 4.对于那些并非为了安全地进行子类化而设计和编写文档的类，要禁止子类化。使用final修饰类，或者类的所有构造器用private修饰
 * 
 * 
 */
package com.effectivejava.chapter04.item19;