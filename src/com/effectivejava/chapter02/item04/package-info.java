/**
 * 本条是通过私有构造器强化不可实例化的能力
 * 
 * 通过上一条（第三条），通过私有构造器的方式，使得类不用实例化。由于这些类实例化没有任何意义， 如Collections工具类，仅对集合记性操作
 * 防止出现给人的错觉，在私有构造器上添加相应的注释，加以说明。
 * 
 * 这种类的弊端：
 * 当子类继承这种类时，子类找不到相应的构造器，导致这种类不能子类化。
 * 
 * 除了可以使用工厂方法，或者单例模式外，创建含有私有构造器的类的对象，还可以使用反射创建相应的对象，但是需要设置AccessibleObject.setAccessible()设置可见性
 * com.effectivejava.chapter02.item04.DemoTest为例子
 * 
 */
package com.effectivejava.chapter02.item04;