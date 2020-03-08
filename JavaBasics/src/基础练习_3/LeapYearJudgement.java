package 基础练习_3;

import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-08 21:50
 * 描述信息：5.请输入一个任意年份,判断是否是闰年
 */
public class LeapYearJudgement {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a year :");
        year = sc.nextInt();

        if(year % 100 == 0 & year % 400 == 0){
            System.out.println("This year is leap year");
        }else if(year % 100 != 0 & year % 4 == 0){
            System.out.println("This year is leap year");
        }else {
            System.out.println("This year is not leap year");
        }

    }
}
