package 基础练习_4;

import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-08 22:52
 * 描述信息：输入三个班，每班10个学生的成绩，求每个班的总分和平均分
 */
public class TotalAndAverage {
    public static void main(String[] args) {
        int classOne[] = new int[10];
        int classTwo[] = new int[10];
        int classThree[] = new int[10];
        int totalOne = 0, totalTwo = 0, totalThree = 0;
        double averageOne , averageTwo, averageThree;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter class one'source");
        for(int i = 0; i < 10; i++){
            System.out.print("This student' source is ");
            classOne[i] = sc.nextInt();
            totalOne += classOne[i];
        }
        averageOne = totalOne / 10.0;
        System.out.println("This class' total is "+totalOne);
        System.out.println("This class' average is "+averageOne);

        System.out.println("Please enter class two'source");
        for(int i = 0; i < 10; i++){
            System.out.print("This student' source is ");
            classTwo[i] = sc.nextInt();
            totalTwo += classTwo[i];
        }
        averageTwo = totalTwo / 10.0;
        System.out.println("This class' total is "+totalTwo);
        System.out.println("This class' average is "+averageTwo);

        System.out.println("Please enter class Three'source");
        for(int i = 0; i < 10; i++){
            System.out.print("This student' source is ");
            classThree[i] = sc.nextInt();
            totalThree += classThree[i];
        }
        averageThree = totalThree / 10.0;
        System.out.println("This class' total is "+totalThree);
        System.out.println("This class' average is "+averageThree);
    }
}
