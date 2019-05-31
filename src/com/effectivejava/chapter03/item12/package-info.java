/**
 * 本节学习考虑实现Comparable接口
 * 1.总体说明
 * Comparable接口只有一个方法是compareTo方法，此方法进行等同性比较，还可以允许执行循序比较。
 * 与Object方法的equals方法有类似的特征 。
 * 还是泛型，类如果实现了Comparable接口，该类的实例具有内在的排序关系。
 * 2.compareTo方法的返回值
 * 大于、小于或者等于分别对应正整数，负整数或者0
 * 3.compareTo方法的性质或者特性(sgn：表达式的意思)
 * 1）自反性：确保所有的x和y都满足sgn(x.compareTo(y))==-sgn(y.compareTo(x)),意味着一个抛出异常，另一个也必须抛出异常
 * 2）对称性：x.compareTo(y)==0暗示着所有z满足sgn(x.compareTo(z))==sgn(x.compareTo(y))
 * 3）传递性：x.compareTo(y)>0&&y.compareTo(z)>0则x.compareTo(z)>0
 * 4）强烈建议(x.compareTo(y)==0)==(x.equals(y))，如果不一致则需要特殊说明
 * 4.使用compareTo方法运算符的使用
 * 1）整数型基本类型的域可以使用关系运算符<和>
 * 2）浮点数使用Float.compareTo()和Double.compareTo()方法
 * 3）数组将以上的规则应用到数组中的每一个元素
 * 5.多个关键域的compareTo方法的比较顺序如何？
 * 应该从最关键的域开始，逐一比较，直至所有关键域都被比较
 * 注意：当直接返回两个数的差值时，当心超过int的最大值变为负数，导致排序混乱
 */
package com.effectivejava.chapter03.item12;