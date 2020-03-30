package com.banyuan.club.ThreadPracticeNew;

/**
 * @author HanChao
 * @date 2020-03-29 23:53
 * 描述信息：
 *
 * 一个账户 1000块钱 :两个人 A B 分别在柜台和ATM机 取钱 A每次取钱100 B每次取200 最终在控制台输出每个人取钱数
 */
public class HomeWorkThree {
    static Object obj = new Object();
    private static int money = 10000;

    static class GuiTai extends Thread{
        public GuiTai(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (money >= 100){
                synchronized (obj){
                    money = money - 100;
                    System.out.println("A取走了100元，还剩下"+money);
                }
            }
        }
    }

    static class ATM extends Thread{
        public ATM(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (money >= 200){
                synchronized (obj){
                    money = money - 200;
                    System.out.println("B取走了200元，还剩下"+money);
                }
            }
        }
    }

    public static void main(String[] args) {
        GuiTai guiTai = new GuiTai("线程1--");
        ATM atm = new ATM("线程2--");

        guiTai.start();
        atm.start();
    }
}
