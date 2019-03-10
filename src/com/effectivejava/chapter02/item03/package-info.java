/**
 * 本条讲述的是用私有构造器或者枚举类型强化Singleton属性 1）Singleton：是指仅仅实例化一次的类，这样的类只会创建一次，多次调用。
 * 缺点：由于不能替换模拟实现，导致使用Singleton创建对象使得客户端测试变得困难重重。 2）在java1.5之前有两种创建Singleton对象的模式
 * 1.饿汉模式（com.effectivejava.chapter02.item03.demo.ElvisHungryMode）
 * 2.静态工厂+饿汉模式（com.effectivejava.chapter02.item03.demo.ElvisStaticFactoryMode）
 * 以上缺点：类装载的过程中进行了实例化数据，避免了线程同步和线程安全问题。但是没有进行懒加载（Lazy-loading），造成内存不必要的浪费
 * 3）枚举类型创建Singleton（com.effectivejava.chapter02.item03.demo.ElvisEnumMode）
 * 可以使用内部枚举类型创建单例模式
 * 
 * 
 * 
 * 4）Singleton的延伸：
 * 1.懒汉模式（com.effectivejava.chapter02.item03.demo.ElvisLazyMode）：即只有调用的时候才能够创建
 * 懒汉模式包括：线程安全创建，非线程安全创建，双重判断创建
 * 
 * 5）创建对象和调用对象分离，这种与双重判断的变体（com.effectivejava.chapter02.item03.demo.ElvisCreateAndCallMode）
 * 
 * 
 */
package com.effectivejava.chapter02.item03;