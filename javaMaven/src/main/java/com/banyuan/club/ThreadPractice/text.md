## 什么是进程什么是线程，他们之间有什么关系
进程是系统中正在运行的一个程序，一般情况下，一个进程无法访问另一个进程的变量和数据结构。  
线程是进程的一个实体，一个进程可以有多个线程。  
一个程序至少一个进程，一个进程至少一个线程，进程中的多个线程是共享进程的资源。  
进程是操作系统资源分配的基本单位；线程是任务调度和执行的基本单位。

## 什么是线程调度，java的线程调度采用的是什么策略？
以某种顺序在单个CPU上执行多个线程称为调度。有两个策略，一个是
抢占模式，一个是协同模式，抢占模式就是系统可以任意切换线程，协同模式就是指某一线程执行完成后主动通知系统切换到另一个线程上执行