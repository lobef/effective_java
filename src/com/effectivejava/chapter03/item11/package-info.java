/**
 * 本条主要讲述覆盖equals方法总是要覆盖hashCode方法
 * 1.Object对象的hashCode方法的通用约定
 * 在每一个覆盖equals方法的类中总是覆盖hashCode方法，如果不这样做，就违反了Object的hashCode方法的通用约定，以下是约定内容：
 * 1）在应用执行期间，只要对象的equals方法的比较所用到的信息没有被修改，那么多次调用对象的hashCode的方法返回的整数是一致的。在同一个应用执行过程中，每次执行可以返回不同的整数
 * 2）两个对象通过equals方法比较是相等的，则这两个对象调用hashCode方法返回的整数必须也是相同的
 * 3）两个对象通过equals方法比较是不相等的，则这两个对象调用hashCode方法返回的整数不一定是相同的。但程序员需要知道不相同的对象产生不同的整数，是为了提高散列表性能
 * 2.覆写hashCode方法的简单办法（理想的hashCode方法是不相等的对象能够获取不同的散列值，均匀的分布）
 * 1）把某一个非零的常数值，比如说17，保存在一个名为result的int类型的变量中
 * 2）把对象中每个关键域f（指equals方法涉及到所有域），完成如下步骤：
 * 	a.为该域计算int类型的散列码c：
 * 	     Ⅰ.该域为boolean类型，则计算(f?1:0)，f为true，则为1，反之为0
 * 	     Ⅱ.该域为byte，char，short或者int类型，则计算（int）f,将f强制转换为int
 * 	     Ⅲ.该域为long类型，则计算(int)(f^(f>>>32))
 *    Ⅳ.该域为float类型，则计算Float.floatToIntBits(f)
 *    Ⅴ.该域为double类型，则计算Double.doubleToLongBits(f)，然后按照a.Ⅲ获得long类型的散列码
 *    Ⅵ.该域为引用类型，并且该类的equals方法通过递归调用equals方法来比较这个域，则同样这个域通过递归调用hashCode。如果这个域为null，则返回0（或者其他常数，通常是0）
 * 	     Ⅶ.如果该域是一个数组，则需要单独处理每一个元素。递归的应用上诉原则。也可以使用jdk1.5中的Arrays.hashCode方法获取散列值
 * 	b.通过下面的公式，将步骤2）.a中的计算得到的散列码c合并到result中：
 *    result = result * 31 + c
 *    注：选择31，可以写作31*i = (i<<<5)-i，有更好的性能，第二个原因是习惯使用素数计算
 * 3）返回result；
 * 4）测试hashCode方法，相等对象得到的hashCode的值必须要相同
 * 注意：需要排除冗余域（多余的域），必须要排除的域是在equals方法中没有用到的域
 * 3.计算散列码是不能排除关键域的来提高性能，即使能够提高性能，可能导致慢到无法使用
 * 
 */
package com.effectivejava.chapter03.item11;