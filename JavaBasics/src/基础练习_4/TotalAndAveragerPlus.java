package 基础练习_4;

import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-08 23:35
 * 描述信息：声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分
 */
public class TotalAndAveragerPlus {
    public static void main(String[] args) {
        int source[] = new int[8];
        Scanner sc = new Scanner(System.in);
        int total = 0;
        double average;

        System.out.println("Please enter source");
        for(int i = 0; i < 8; i++){
            System.out.print("This student' source is ");
            source[i] = sc.nextInt();
            total += source[i];
        }
        average = total / 8.0;
        System.out.println("This class' total is "+total);
        System.out.println("This class' average is "+average);

        int min = 0, max = 0;
        source[min] = source[0];
        source[max] = source[0];
        for(int i = 0; i < source.length; i++){
            if(source[i] > source[max]){
                source[max] = source[i];
            }
            if(source[i] < source[min]){
                source[min] = source[i];
            }
        }
        System.out.println("The max number is "+source[max]);
        System.out.println("The min number is "+source[min]);
    }
}
