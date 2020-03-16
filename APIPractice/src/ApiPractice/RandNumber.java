package ApiPractice;

import java.util.Random;
import java.util.Scanner;

/**
 * @author HanChao
 * @date 2020-03-16 21:32
 * 描述信息：1:需求：请设计一个方法，可以实现获取任意范围内的随机数。
 */
public class RandNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;

        while (true) {
            System.out.printf("请输入起始值");
            a = sc.nextInt();
            System.out.printf("请输入结束值");
            b = sc.nextInt();

            if (a == b) {
                System.out.println("请重新输入");
                continue ;
            }else if(a > b){
                int temp = 0;
                temp = a;
                a = b;
                b =temp;
            }
            Rand rand = new Rand(a,b);
            System.out.println(rand.toString());
        }
    }
}

// 范围随机数程序
class Rand{
    Random random = new Random();
    private int starNumber;
    private int endNumber;

    public Rand(int starNumber, int endNumber) {
        this.starNumber = starNumber;
        this.endNumber = endNumber;
    }

    @Override
    public String toString() {
        return "Rand{" +
                "starNumber=" + starNumber +
                ", endNumber=" + endNumber +
                ", randNumber=" + (random.nextInt(endNumber + 1) + starNumber) +
                '}';
    }
}
