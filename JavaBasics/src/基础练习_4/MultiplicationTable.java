package 基础练习_4;

import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-08 22:17
 * 描述信息：1.任意输入 n行 n列的乘法口诀表
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter row :");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" x "+i+" = "+i*j+" ");
            }
            System.out.println();
        }
    }


}
