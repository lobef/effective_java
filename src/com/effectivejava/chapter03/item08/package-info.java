/**
 * 本条主要讲述覆盖equals方法遵守通用约定
 * 1.不覆盖equals方法的情况：说明类的每个实例都与自身相等
 * 	1）类的每个实例本质上都是唯一的
 * 	2）不关心类是否提供“逻辑相等”的测试功能
 * 	3）超类已经覆盖了equals方法，从超类继承过来的行为对于子类是合适
 * 	4）类是私有的或者包级私有的，可以确定它的equals方法永远被调用(例子PrivateInPackage)
 * 2.覆盖equals方法的情况
 * 	类具有自己的“逻辑相同”，与对象等同不同，在这种情况下，需要重写equals，一般是比较对象中属性的值是否都相同来判断对象是否相同
 * 3.覆盖equals方法的需要遵守的规定
 * 	1）自反性，对于任何非null的引用值x，x.equals(x)必须返回true；
 * 	2）对称性，对于任何非null的引用值x和y，只有x.equals(y)返回true时，y.equals(x)必须返回true；
 * 	3）传递性，对于任何非null的引用值x，y和z，当x.equals(y)返回true，同时y.equals(z)返回true时，x.equals(z)必须返回true；
 * 	4）一致性，对于任何非null的引用值x和y，只要equals比较操作中所用到的信息没有被修改，则多次调用x.equals(y)时，要么都返回true或者要么都返回false
 * 	5）非空性，对于任何非null的引用值x，x.equals(null)必须返回false
 * 4.一致性的说明
 * 对象的在没有被修改的情况下，多次调用equals方法比较结果是相同的
 * 强调一点：在做类型转换时，需要验证是否为某一类型。
 * 
 * 5.实现高质量的equals方法的诀窍
 * 	1）使用==操作符检查“参数是否为这个对象的引用”
 * 	2）使用instanceof操作符检查“参数是否为正确的类型”
 * 	3）把参数转换为正确的类型
 * 	4）对于该类中的每个“关键”域，检查参数中的域是否与该对象中的对应域相匹配。
 * 	注意：
 * 	非float和double的基本类型可以使用==操作符进行比较，引用类型使用递归的方式调用父类中的equals方法，如果是float和double类型时需要使用Float.compare和Double.compare方法
 * 	数组域需要比较数组中的每一个元素，在java1.5中有Array.equals方法进行数组比较
 * 	域的比较顺序会影响equals方法的性能，所以需要比较开销低或者最不可能相等域，最好两者兼顾，而达到高效的目的。
 * 	5）当编写完equals方法之后，需要问自己三个问题，它是否满足对称性，是否满足传递性，是否满足一致性。
 * 	注意：
 * 	覆盖equals方法的同时需要覆盖hashCode方法
 * 	不要企图让equals方法过于智能
 * 	不要将equals声明中的Object对象替换为其他类型，如果被替换，则不是重写equals方法，而是重新定义一个equals方法
 */
package com.effectivejava.chapter03.item08;