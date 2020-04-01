#### 创建线程的两种方式分别是什么？各有什么优缺点？  

第一种方法继承Thread类，重写run()方法。
该方法的方法体就代表了线程需要完成的任务。
调用线程对象的start（）方法来启动该线程。

第二种方法实现Runnable接口创建线程类。
重写run（）方法。
创建Runnable实现类的实例，并以此作为Thread的target来创建对象，该对象才是真正的线程对象。

两种方法都能实现多线程，使用实现Runnable接口的方法可以再继承其他的类。
多个线程可以共享一个target对象，
所以非常适合多个相同线程来处理同一份资源的情况。继承Thread类的方法。不能继承其他父类。
编写简单，如果需要访问当前线程，直接使用this即可获得当前线程。

#### 请你简述sleep( )和wait( )有什么区别？

调用sleep方法，线程进入休眠，但不会释放对象锁，当休眠时间结束继续执行。
调用wait方法，线程放弃对象锁，进入等待状态，只有遇到对象的notify方法，
重新进入就绪状态，等待调用。

#### Java中实现线程通信的三个方法及其作用？

线程通信的三种方法都只能在同步方法或同步代码块中执行。
wait方法表示线程进入等待状态，等待时间结束或者其他等待其他线程调用。
notify方法，确切的唤醒某一等待的线程，具体哪一个线程由JVM决定。
notifyAll方法，唤醒一个对象里所有等待状态的线程。让其自由竞争资源。

#### 现在有线程 T1、T2 和 T3。你如何确保 T2 线程在 T1 之后执行，并且 T3 线程在 T2 之后执行？ 

可以设置休眠时间，T2的休眠时间大于T1休眠时间，T3休眠时间大于T2休眠时间。
可以确定T2 线程在 T1 之后执行，并且 T3 线程在 T2 之后执行。
也可以使用join方法。

#### Java 中新的 Lock 接口相对于同步代码块（synchronized block）有什么优势？如果让你实现一个高性能缓存，支持并发读取和单一写入，你如何保证数据完整性。

多线程和并发编程中使用 lock 接口的最大优势是它为读和写提供两个单独的锁。
synchronized是java的一个关键字，内置对象，lock是一个类。但是采用synchronized关键字来实现同步的话，就会导致一个问题：
如果多个线程都只是进行读操作，所以当一个线程在进行读操作时，其他线程只能等待无法进行读操作。
因此就需要一种机制来使得多个线程都只是进行读操作时，线程之间不会发生冲突，通过Lock就可以办到。
synchronized既可以加在方法上，也可以加载特定的代码块上，括号中表示需要锁的对象。而Lock需要显示地指定起始位置和终止位置。synchronzied是托管给jvm执行的，Lock锁定是通过代码实现的。

#### 如何在 Java 中编写代码解决生产者消费者问题

它描述是有一块缓冲区作为仓库，生产者可以将产品放入仓库，
消费者则可以从仓库中取走产品。
wait()方法：当缓冲区已满/空时，生产者/消费者线程停止自己的执行，放弃锁，使自己处于等等状态，让其他线程执行。
notify()方法：当生产者/消费者向缓冲区放入/取出一个产品时，向其他等待的线程发出可执行的通知，同时放弃锁，使自己处于等待状态。

#### 写一段死锁代码。你在 Java 中如何解决死锁？

死锁代码
```
public class LockThread extends Thread {
    private Lock lock1;
    private Lock lock2;
 
    public LockThread(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }
 
    @Override
    public void run() {
        synchronized (lock1) {
            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + "先拿" + lock1.getName() + "，然后尝试获取锁" + lock2.getName());
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "获取到锁" + lock2.getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
 
        }
    }
}
```
测试代码
```
        Thread thread1 = new DeadLockThread(lock1, lock2);
        thread1.setName("<线程1>");
        Thread thread2 = new DeadLockThread(lock2, lock1);
        thread2.setName("<线程2>");
        thread1.start();
        thread2.start();
```

解决方法就是顺序获得锁
```
Thread thread1 = new DeadLockThread(lock1, lock2);
        thread1.setName("<线程1>");
        Thread thread2 = new DeadLockThread(lock1, lock2);
        thread2.setName("<线程2>");
        thread1.start();
        thread2.start();
```

#### 什么是原子操作？Java 中有哪些原子操作

原子操作意为”不可被中断的一个或一系列操作” 。比较常见的有
AtomicBoolean：原子更新布尔类型。 
AtomicInteger：原子更新整型。
AtomicLong：原子更新长整型等。 

#### 既然 start() 方法会调用 run() 方法，为什么我们调用 start() 方法，而不直接调用 run() 方法

直接调用run方法时直接调用类里面的run方法，没有启动线程。调用start方法指启动线程，再调用run方法。
