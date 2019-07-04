/**
 * 本节学习在公有类中使用访问方法而非公有域
 * 1.如果类可以在它所在的包的外部进行访问，可以提供访问方法（com.effectivejava.chapter04.item14.demo.Point）
 * 这样可以保持改变该类内部表示法的灵活性
 * 2.如果类是包级私有，或者私有的嵌套类，直接暴露它的数据并没有本质的错误（这是因为，访问的范围变小）。反面例子：Java平台中java.awt.Point和java.awt.Dimension类直接暴露的数据域
 * 3.如果公有域是不可变，这种做法的危害会变小（com.effectivejava.chapter04.item14.demo.Time）
 * 总结：共有类永远都不应该暴露可变的域；公有类暴露不可变域危害会小；包级私有或者私有嵌套类，可以暴露内部的域
 */
package com.effectivejava.chapter04.item16;