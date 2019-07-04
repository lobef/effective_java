/**
 * 本节讲述始终要覆盖toString方法
 * 1.覆盖toString方法的通用约定
 * 简洁的，但信息丰富，并且易于阅读的表达形式。建议所有的子类都覆盖toString方法
 * 2.在实际应用中，toString方法应该返回对象中包含的所有值得关注的信息，如果打印的对象信息太大，则需要打印摘要信息
 * 
 * 3.toString的不足：如果这个类被广泛使用，一旦指定格式就必须始终如一地坚持这种格式
 * 4.无论是否指定toString格式，都应该在文档中明确地表明你的意图(com.effectivejava.chapter03.item09.demo.PhoneNumber)
 * 5.无论是否指定toString格式，都为toString返回值中包含的所有信息，提供一种编程式的访问路径
 */
package com.effectivejava.chapter03.item12;