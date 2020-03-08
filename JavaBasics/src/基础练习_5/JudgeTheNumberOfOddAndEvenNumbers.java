package 基础练习_5;

import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-09 00:33
 * 描述信息：你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。
 * 程序输出读到的数据中的奇数和偶数的个数。
 * 	输入格式:一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。
 * 	输出格式：两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入数据中的偶数的个数。两个整数之间以空格分隔。
 */
public class JudgeTheNumberOfOddAndEvenNumbers {
    public static void main(String[] args) {
        int data[] = new int[100];
        int length = 0;
        int oddNumber = 0;
        int evenNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter numbers:");
        for(int i = 0; i < data.length; i++){
            System.out.print("enter number:");
            data[i] = sc.nextInt();
            length++;
            if(data[i] == -1){
                --length;
                break;
            }
        }

        for(int i = 0; i < length; i++){
            if(data[i] %2 == 0){
                oddNumber += 1;
            }else{
                evenNumber += 1;
            }
        }
        System.out.println("odd number is "+oddNumber);
        System.out.println("even number is "+evenNumber);
    }
}
