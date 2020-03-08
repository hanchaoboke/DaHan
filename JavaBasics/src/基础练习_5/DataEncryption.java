package 基础练习_5;

import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-09 00:42
 * 描述信息：数据加密问题
 * 		某个公司采用公用电话传递数据信息，数据是小于8位的整数(默认8位)，为了确保安全，
 * 		在传递过程中需要加密，加密规则如下：
 * 			首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字， 87654321   8+5=13%10=3
 * 			最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
 * 			然后，把加密后的结果在控制台打印出来
 */
public class DataEncryption {
    public static void main(String[] args) {
        int message;
        Scanner sc = new Scanner(System.in);
        int x[] = new int[8];
        int length = 0;
        System.out.print("Please enter Message:");
        message = sc.nextInt();

        for(int i = 0; i < x.length; i++){
            x[i] = message %10;
            message = message / 10;
            length++;
            if(message == 0){
                break;
            }
        }

        for(int i = 0; i <= length; i++){
            x[i] = (x[i] + 5) % 10;
        }

        x[0] = x[0] ^ x[length];
        x[length] = x[length] ^ x[0];
        x[0] = x[0] ^ x[length];

        for(int i = length; i >= 0; i--){
            System.out.print(x[i]);
        }

    }
}
