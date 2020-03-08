package 基础练习_4;

import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-08 23:46
 * 描述信息：定义一个长度为10的整型数组，循环输入10个整数。 然后将输入一个整数，查找此整数，找到 输出下标，没找到给出提示。
 */
public class GetNumber {
    public static void main(String[] args) {
        int num[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        for(int i = 0; i < num.length; i++){
            System.out.print("enter number:");
            num[i] = sc.nextInt();
        }

        int x;
        x = sc.nextInt();

        for(int i = 0; i < num.length; i++){
            if(num[i] == x){
                System.out.println("sub is "+i);
            }
            if(i == num.length){
                System.out.println("don't hava this number");
            }
        }
    }
}
