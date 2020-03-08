package 基础练习_3;

import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-08 21:19
 * 描述信息：从键盘输入一个班5个学生的分数，求和并输出
 */
public class SumOfSource {
    public static void main(String[] args) {
        int a,b,c,d,e;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the one student'source:");
        a = sc.nextInt();
        System.out.print("Please enter the two student'source:");
        b = sc.nextInt();
        System.out.print("Please enter the three student'source:");
        c = sc.nextInt();
        System.out.print("Please enter the four student'source:");
        d = sc.nextInt();
        System.out.print("Please enter the five student'source:");
        e = sc.nextInt();

        sum = a + b + c + d + e;
        System.out.println("sum of five student'source is "+ sum);
    }
}
