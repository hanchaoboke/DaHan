package 基础练习_3;

import java.util.Random;
import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-08 22:01
 * 描述信息：6.30以内的随机数,请输入任意一个数,循环10次,求这个数在随机数范围内出现的次数
 */
public class RandNumber {
    public static void main(String[] args) {
        int n = 0;
        int x;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Please enter a number:");
        x = sc.nextInt();
        for(int i = 0; i < 10; i++){
            if(x == rand.nextInt(31)){
                n++;
            }
        }
        System.out.println("times of your enter number "+n);
    }
}
