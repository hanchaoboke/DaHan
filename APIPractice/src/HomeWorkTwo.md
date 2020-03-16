### String, StringBuffer和StringBuilder总结

String是字符串常量，属于引用数据类型，其值无法发生改变，
每次操作String都会生成新的String堆积在内存之中，
如果出现需要大量操作字符串，比如在规模很大的循环中使用String操作字符串
，会对空间造成极大的浪费。为了应对大规模处理字符串，出现了字符串变量

StringBuffer与StringBuilder

最先出现的是StringBuffer，操作字符串不会生成大量无用内容堆积在内存中
，不会产生新的未使用的对象。随后出现了StringBuilder，和StringBuffer非常类似，
拥有很多共同体的地方，均为字符串变量，都不会浪费大量内存，新生成无用对象

三者区别与联系

* 三者均存储字符串
* String是字符串常量
* StringBuffer于StringBuilder是字符串变量
* StringBuffer效率略低，但线程安全
* StringBuilder效率略高，速度略快，但线程不安全

使用情况

不会大量操作字符串推荐String

大量操作字符串，需要线程安全，推荐StringBuffer

大量操作字符串，优先处理速度，不考虑线程安全，推荐StringBuilder
