/**
 * 
 * 本节学习为后代设计接口
 * 1.为什么为后代设计接口
 * 1）java8之前在不破坏现有的实现，为接口添加新方法是不可能的，这是由于接口中添加新方法，实现类没有这个方法，导致编译不过问题
 * 2）java8中添加缺省方法构造，目的就是允许给现有的接口添加方法
 * 2.在接口中声明缺省方法充满风险的
 * 1）缺省方法的声明中包括一个缺省实现，这是给实现了该接口但没有实现默认方法的所有类使用的。
 * 2）在java中增加了缺省方法之后，不能确保这些方法在实现中运行很好，这是由于实现者并不知道，接口新添加了方法
 * 3）并非每一个可能的实现的所有变体，始终都可以编写出一个缺省方法
 * 3.有缺省方法的好处
 * 有了缺省方法，接口的现有实现就不会出现编译时没有报警或者警告和运行却异常的情况
 * 4.对缺省方法的告诫
 * 1.尽量避免利用缺省方法在现有接口上添加新的方法，除非有特殊需要。即使添加新的方法，也要考虑缺省的方法实现是否破坏现有的接口实现
 * 2.创建接口的时候，用缺省方法提供标准的方法实现是非常方便的，简化实现接口的任务
 * 3.缺省方法不支持从接口中删除方法，也不支持修改现有方法的签名，因为修改或删除一定会对客户端代码产生影响
 * 总结：
 * 尽管缺省方法现在是java平台的组成部分，但谨慎设计接口仍然是至关重要的，在现有的接口中添加缺省方法存在很大风险
 * 在功能发布之前尽量做好测试，每个接口写至少三个实现，将缺陷降到最低
 * 
 */
package com.effectivejava.chapter04.item21;