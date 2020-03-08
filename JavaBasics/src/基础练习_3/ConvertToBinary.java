package 基础练习_3;

import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-08 21:23
 * 描述信息：从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。
 */
public class ConvertToBinary {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter x'number :");
        x = sc.nextInt();
        System.out.println("x'Binary is "+Integer.toBinaryString(x));
    }
}
