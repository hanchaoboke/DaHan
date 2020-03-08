package 基础练习_3;

import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-08 21:27
 * 描述信息：输入一批整数，使用循环求出最大值与最小值，输入0时结束。
 */
public class OutputMaxAndMin {
    public static void main(String[] args) {
        int num[] = new int[100];
        int n = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++){
            System.out.print("enter number :");
            num[i] = sc.nextInt();
            n++;
            if(num[i] == 0) {
                n--;
                break;
            }
        }

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i; j++){
                if(num[j] > num[j+1]){
                    num[j] = num[j] ^ num[j+1];
                    num[j+1] = num[j+1] ^ num[j];
                    num[j] = num[j] ^ num[j+1];
                }
            }
        }
        System.out.println("min number is"+num[0]);
        System.out.println("max number is"+num[n]);
    }
}
