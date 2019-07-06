/**
 * 本节学习消除非受检的警告
 * 1.主要讲述非常难以消除的警告，尽可能的消除每一个非受检警告
 * 2.如果无法消除警告，同时可以证明引起警告的代码是类型安全的，
 * 只有在这种情况下，才可以使用@SupperessWarnings("unchecked")注解来禁止这条警告
 * 如果不进行代码类型安全验证，有可能会在运行出现ClassCastException异常
 * 3.SupperessWarnings注解可以用在任何粒度级别中，局部变量，方法或者类上面，
 * 但是应该始终在尽可能小的范围内使用SupperessWarnings注解，这样使用在大的范围内掩盖其他重要的非受检警告
 * 4.每当使用@SupperessWarnings("unchecked")注解时，都要添加一条注释，说明为什么这么做是安全的
 * 同时也可以帮助其他人更好的理解，最重要的是可以尽量减少其他人修改代码后导致计算不安全的概率
 * 总结：
 * 非受检警告很重要，不要忽略他们，每条警告都有可能在运行时出现ClassCastException异常
 */
package com.effectivejava.chapter05.item27;