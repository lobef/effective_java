/**
 * 本节讲述谨慎地覆盖clone方法
 *  1.调用类的clone前提条件
 *  该类一定要实现Cloneable接口，并且重写clone方法。如果重写了clone方法但是并没有实现Cloneable接口，clone方法被调用则会抛出CloneNotSupportedException异常
 *  
 *  这节讲述的是Cloneable接口暂时看了一遍，没有系统的总结，先放到这里，看下一节，这一节不是那么重要
 *  
 *  
 *  
 *  
 *  
 */
package com.effectivejava.chapter03.item11;