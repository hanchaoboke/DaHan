package HomeWorkThree;

import java.util.Scanner;

/**
 * @author HanChao
 * @date 2020-03-09 21:47
 * 描述信息：作业3：现在有五个学生,每个学生有4门课程  语文  数学 英语  理科综合,还有姓名属性
 * 要求:1.求出平均分最高的人的所有信息
 *     2.找出理科成绩最高的人
 *     遇到困难，未完成
 */
public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student studentOne = new Student();
        Student studentTwo = new Student();
        Student studentThree = new Student();
        Student studentFour = new Student();
        Student studentFive = new Student();

        Score scoreStudentOne = new Score();
        Score scoreStudentTwo = new Score();
        Score scoreStudentThree = new Score();
        Score scoreStudentFour = new Score();
        Score scoreStudentFive = new Score();

        System.out.println("Please enter five students' score");

//        // 尝试循环输入，可惜没找到String转换成自定义类型的方法
//        for(int i = 1; i <= 5; i++){
//            Object obj = "scoreStudent" + i;
//            System.out.println("enter the "+i+" student's score");
//            System.out.printf("score of chinese is ");
//      }

        System.out.println("enter the first student's name and score");
        System.out.printf("name is ");
        studentOne.setName(sc.nextLine());
        System.out.print("chinese is ");
        scoreStudentOne.setChinese(sc.nextInt());
        System.out.printf("math is ");
        scoreStudentOne.setMath(sc.nextInt());
        System.out.printf("english is ");
        scoreStudentOne.setEnglish(sc.nextInt());
        System.out.printf("science is ");
        scoreStudentOne.setScience(sc.nextInt());
        studentOne.setSource(scoreStudentOne);

        System.out.println("enter the second student's name and score");
        System.out.printf("name is ");
        studentTwo.setName(sc.nextLine());
        System.out.print("chinese is ");
        scoreStudentTwo.setChinese(sc.nextInt());
        System.out.printf("math is ");
        scoreStudentTwo.setMath(sc.nextInt());
        System.out.printf("english is ");
        scoreStudentTwo.setEnglish(sc.nextInt());
        System.out.printf("science is ");
        scoreStudentTwo.setScience(sc.nextInt());
        studentTwo.setSource(scoreStudentTwo);


        System.out.println("enter the thrid student's name and score");
        System.out.printf("name is ");
        studentThree.setName(sc.nextLine());
        System.out.print("chinese is ");
        scoreStudentThree.setChinese(sc.nextInt());
        System.out.printf("math is ");
        scoreStudentThree.setMath(sc.nextInt());
        System.out.printf("english is ");
        scoreStudentThree.setEnglish(sc.nextInt());
        System.out.printf("science is ");
        scoreStudentThree.setScience(sc.nextInt());
        studentThree.setSource(scoreStudentThree);


        System.out.println("enter the fourth student's name and score");
        System.out.printf("name is ");
        studentFour.setName(sc.nextLine());
        System.out.print("chinese is ");
        scoreStudentFour.setChinese(sc.nextInt());
        System.out.printf("math is ");
        scoreStudentFour.setMath(sc.nextInt());
        System.out.printf("english is ");
        scoreStudentFour.setEnglish(sc.nextInt());
        System.out.printf("science is ");
        scoreStudentFour.setScience(sc.nextInt());
        studentFour.setSource(scoreStudentFour);


        System.out.println("enter the fifth student's name and score");
        System.out.printf("name is ");
        studentFive.setName(sc.nextLine());
        System.out.print("chinese is ");
        scoreStudentFive.setChinese(sc.nextInt());
        System.out.printf("math is ");
        scoreStudentFive.setMath(sc.nextInt());
        System.out.printf("english is ");
        scoreStudentFive.setEnglish(sc.nextInt());
        System.out.printf("science is ");
        scoreStudentFive.setScience(sc.nextInt());
        studentFive.setSource(scoreStudentFive);


        // 写到这里发现如果不能发String转换成自定义类型，难度非常大。等研究明白再写


    }
}
