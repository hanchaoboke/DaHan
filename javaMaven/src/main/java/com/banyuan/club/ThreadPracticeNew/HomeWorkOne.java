package com.banyuan.club.ThreadPracticeNew;

/**
 * @author HanChao
 * @date 2020-03-29 18:46
 * 描述信息：
 *
 * 现在有三个线程,如何保持三个线程按照顺序执行
 */
public class HomeWorkOne {
        static class MyThread1 extends Thread{
            public MyThread1(String name) {
                super(name);
            }

            @Override
            public void run() {
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("----"+Thread.currentThread().getName());
            }
        }
        static class MyThread2 extends Thread{
            public MyThread2(String name) {
                super(name);
            }

            @Override
            public void run() {
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("----"+Thread.currentThread().getName());
            }
        }
        static class MyThread3 extends Thread{
            public MyThread3(String name) {
                super(name);
            }

            @Override
            public void run() {
                try {
                    sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("----"+Thread.currentThread().getName());
            }
        }

    public static void main(String[] args) {
        Thread thread1 = new MyThread1("线程1");
        Thread thread2 = new MyThread2("线程2");
        Thread thread3 = new MyThread3("线程3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
