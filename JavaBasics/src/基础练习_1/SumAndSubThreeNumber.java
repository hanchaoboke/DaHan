package 基础练习_1;

import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-08 11:56
 * 描述信息：手动输入任意三个数，求三个数的和，差
 */
public class SumAndSubThreeNumber {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number:");
        a = sc.nextInt();
        System.out.print("Please enter the second number:");
        b = sc.nextInt();
        System.out.print("Please enter the third number:");
        c = sc.nextInt();
        sum(a, b, c);
        sub(a, b, c);
    }
    /**
     * sum of three number
     */
    public static void sum(int a, int b, int c){
        int sum = a + b + c;
        System.out.println("sum of three number is "+ sum);
    }
    /**
     * sub of three number
     */
    public static void sub(int a, int b, int c){
        int SubPossibleOne = a - b - c;
        int SubPossibleTwo = b - a - c;
        int SubPossibleThree = c - a - b;
        System.out.println("sub of three number has three possible");
        System.out.println("Possible one is "+SubPossibleOne);
        System.out.println("Possible two is "+SubPossibleTwo);
        System.out.println("Possible three is "+SubPossibleThree);
    }
}
