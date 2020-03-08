package 基础练习_2;

import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-08 21:15
 * 描述信息：编写Java程序，实现判断变量x是奇数还是偶数。
 */
public class JudgeOddEvenNumber {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter value of x :");
        x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("x is odd");
        }else{
            System.out.println("x is even");
        }

    }
}
