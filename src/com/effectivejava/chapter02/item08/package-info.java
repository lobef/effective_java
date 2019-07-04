/**
 * 
 * 本节主要讲述避免使用终结方法，使用终结方法会导致行为不稳定，降低性能以及可移植性问题。致
 * 1.缺点：
 * 	1）终结方法不能保证被及时的执行，也就是说垃圾回收器回收无效对象的时间不固定，。
 * 	注重时间的任务不能使用终结方法来完成。总结：不应该依赖终结方法更新重要的持久状态。
 * 	2）使用终结方法导致性能损耗，所以终结方法不能随便使用。d
 * 2.需要终止对象的资源，不编写终结方法的情况下，怎么办？
 * 	使用显示的终止方法，并且要求该来客户端在每个实例不再有用的时候调用这个方法。
 * 	典型的例子InputStream,OutputStream,java.sql.Connectiong的close方法，另外一个java.util.Timer的cancel方法，以上都能很温和的终止资源
 * 	显示的终止方法一般会与try-finally结构联合使用，确保终止方法及时起作用。
 * 3.终结方法的用处：
 * 	1）安全网，显示的终止方法没有被调用，终结方法会起到安全网的作用将资源终止回收。如果使用终结方法作为安全网，需要考虑这种额外的代价是否值得
 * 	2）与本地对等体有关。本地对等体是一个本地对象，普通对象通过本地方法代理一个本地对象，该本地对象不是普通对象，所以垃圾回收器不知道它，导致不能被回收。
 * 	如果本地对等体并不拥有关键资源的前提下，使用终结方法来释放资源是合理的
 * 4.总结：
 * 	1）除了安全网或者为了终止非关键的本地资源，不要使用终结方法
 * 	2）使用终结方法的子类，必须使用super.finalize
 * 	3）如果终结方法作为安全网，必须记录终结方法的非法使用 
 * 	4）终结方法与非final的类联合使用时，考虑使用终结方法守卫者（com.effectivejava.chapter02.item07.demo.Foo例子），以确保子类没有调用super.finalize时，该终结方法也会被执行
 */
package com.effectivejava.chapter02.item08;