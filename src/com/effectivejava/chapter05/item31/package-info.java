/**
 * 本节学习利用有限制通配符来提升API的灵活性
 * 1.List<String>与List<Object>两个类型两者没有什么直接关系，区别在于List<Object>可以放任何类型而List<String>只能放String类型
 * 2.有限制通配符，泛型中使用extends或者super关键以说明某个类型的子类型或者某个超类的集合（com.effectivejava.chapter05.item31.demo.Stack<E>的pushAll和popAll方法）
 * 为了获得最大限度的灵活性，要在表示生产者和消费者的输入参数上使用通配符类型，既extends或者super，简便记忆PECS表示producer-extends，consumer-super
 * 3.不要使用通配符类型作为返回值
 * 4.使用时始终应该是Comparable<? super T>优先于Comparable<T>，同样Comparator也是如此。Comparable和Comparator都是消费者
 * 5.类型参数和通配符之间具有双重性，许多方法都可以任选其一来声明。（com.effectivejava.chapter05.item31.demo.ListDemo）
 * 一般来说，如果类型参数只在方法声明中出现一次，就可以用通配符取代它
 * 
 */
package com.effectivejava.chapter05.item31;