####Java中synchronized 和 ReentrantLock 有什么不同？

都是加锁方式同步，而且都是阻塞式的同步，
Synchronized来说，它是java语言的关键字，是原生语法层面的互斥，需要jvm实现。而ReentrantLock它是JDK 1.5之后提供的API层面的互斥锁，
需要lock()和unlock()方法配合try/finally语句块来完成。