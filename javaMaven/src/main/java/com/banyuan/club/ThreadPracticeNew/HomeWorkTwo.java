package com.banyuan.club.ThreadPracticeNew;

/**
 * @author HanChao
 * @date 2020-03-29 18:59
 * 描述信息：
 *
 * 有四个线程,其中A,B线程对i加1操作，C,D线程每次对i减1操作
 * 凉凉，有一些部分有问题，可能是思路的问题。没想明白逻辑
 */
public class HomeWorkTwo {
    private static Object obj = new Object();

    private static int i = 0;

    private static int history1 = 0;
    private static int history2 = 0;

    static class MyTreadA extends Thread{
        public MyTreadA(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (true){
                synchronized (obj){
                    if (history1 == 0 & history2 == 1 || history1 == 1 & history2 == 0 || history1 == 0 & history2 ==0){
                        System.out.println(Thread.currentThread().getName()+"---"+(i++));
                        history2 = history1;
                        history1 = i;
                    }else {
                        break;
                    }
                }
            }
        }
    }

    static class MyTreadB extends Thread{
        public MyTreadB(String name) {
            super(name);
        }
        @Override
        public void run() {
            while (true){
                synchronized (obj){
                    if (history1 == 0 & history2 == 1 || history1 == 1 & history2 == 0 || history1 == 0 & history2 ==0){
                        System.out.println(Thread.currentThread().getName()+"---"+(i++));
                        history2 = history1;
                        history1 = i;
                    }else {
                        break;
                    }
                }
            }
        }
    }

    static class MyTreadC extends Thread{
        public MyTreadC (String name) {
            super(name);
        }
        @Override
        public void run() {
            while (true){
                synchronized (obj){
                    if (history1 == 2 & history2 == 1 || history1 == 1 & history2 == 2){
                        System.out.println(Thread.currentThread().getName()+"---"+(i--));
                        history2 = history1;
                        history1 = i;
                    }else {
                        break;
                    }
                }
            }
        }
    }

    static class MyTreadD extends Thread{
        public MyTreadD (String name) {
            super(name);
        }
        @Override
        public void run() {
            while (true){
                synchronized (obj){
                    if (history1 == 2 & history2 == 1 || history1 == 1 & history2 == 2){
                        System.out.println(Thread.currentThread().getName()+"---"+(i--));
                        history2 = history1;
                        history1 = i;
                    }else {
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        MyTreadA myTreadA = new MyTreadA("线程A");
        MyTreadA myTreadB = new MyTreadA("线程B");
        MyTreadA myTreadC = new MyTreadA("线程C");
        MyTreadA myTreadD = new MyTreadA("线程D");

        myTreadA.start();
        myTreadB.start();
        myTreadC.start();
        myTreadD.start();
    }
}
