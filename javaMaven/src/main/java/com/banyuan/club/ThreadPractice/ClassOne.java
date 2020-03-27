package com.banyuan.club.ThreadPractice;

import java.lang.*;

/**
 * @author HanChao
 * @date 2020-03-27 07:07
 * 描述信息：
 * 有三个线程,输出200到400之间所有的数据,如果是奇数那么就输出当前线程的名称
 */
public class ClassOne {
    static int [] Number = new int[202];
    static {
        for (int i = 200; i <= 401 ; i++) {
            Number[i - 200] = i;
        }
    }

    static class T1 extends Thread{
        @Override
        public void run() {
            super.run();
            for (int i = 0; i <200 ; i++) {
                System.out.println("   "+Number[i]);
            }
        }
    }

    static class T2 extends Thread{
        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 200; i++) {
                if (Number[i] % 2 != 0){
                    System.out.println("奇数为"+Number[i]+T3.currentThread().getName());
                }
            }
        }
    }

    static class T3 extends Thread{
        @Override
        public String toString() {
            return ""+Thread.currentThread().getName();
        }

        @Override
        public void run() {
            super.run();
        }
    }

    public static void main(String[] args) throws InterruptedException {

         T1 t1 = new T1();
         T2 t2 = new T2();
         T3 t3 = new T3();

         t1.start();
         t1.join();
         t2.start();
         t2.join();
         t3.start();

    }
}
