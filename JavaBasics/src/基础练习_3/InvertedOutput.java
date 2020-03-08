package 基础练习_3;

import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-08 22:10
 * 描述信息：输入一个正整数，将该数的各位左右反转输出，即输入123，输出321。（使用while循环实现）
 */
public class InvertedOutput {
    public static void main(String[] args) {
        int x, y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number: ");
        x = sc.nextInt();
        while(x != 0){
            int temp = x % 10;
            y = y * 10 + temp;
            x = x / 10;
        }
        System.out.println("Result is "+y);
    }
}
