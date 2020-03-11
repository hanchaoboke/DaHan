import java.util.Random;
import java.util.Scanner;

/**
 * @author HanChao
 * @date 2020-03-10 23:47
 * 描述信息：现有
 * 学生类（编号stuNum,姓名stuName,年级stuGrade,成绩stuScore）
 * 试题类（试题编号number,试题内容title,试题选项 anwserA  anwserB anwserC anwserD  试题答案  Anwser）
 * 要求:
 * 其中一个学生（有6个）登录账号进行考试,在控制台随机显示10个题目,并且输入题目的正确答案才会有分数,
 * 每题10分,现在有30个题目(题目自己出,不做要求)。
 * 求学生考完试在控制台最终得到的分数
 */
public class Test {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //生成随机数，目的作为随机抽出来题目
        int[] randNum = new int[10];

        Student[] students = new Student[6];

        // 录入学生信息
        System.out.println("请录入学生信息：");
        for (int i = 0; i < students.length; i++){
            Student student = new Student();
            System.out.printf("学生编号：");
            student.setStuNum(sc.nextInt());
            System.out.printf("学生姓名：");
            student.setStuName(sc.next());
            System.out.printf("学生年级：");
            student.setStuGrade(sc.nextByte());
            System.out.printf("学生成绩：");
            student.setStuScore(sc.nextInt());
            students[i] = student;
        }

        TestQuestions[] testQuestions = new TestQuestions[30];

        // 录入试题信息
        System.out.println("请录入试题信息");
        for (int i = 0; i < testQuestions.length; i++){
            TestQuestions questions = new TestQuestions();
            System.out.printf("试题编号："+(i + 1));
            questions.setNumber(i);
            System.out.printf("试题内容：");
            questions.setTitle(sc.next());
            System.out.printf("选项A：");
            questions.setAnwserA(sc.next());
            System.out.printf("选项B：");
            questions.setAnwserB(sc.next());
            System.out.printf("选项C：");
            questions.setAnwserC(sc.next());
            System.out.printf("选项D：");
            questions.setAnwserD(sc.next());
            System.out.printf("试题答案");
            questions.setAnwser(sc.next());
            testQuestions[i] = questions;
        }
        // 开始考试,stuCode为学生编号
        boolean stuInfor = true;
        while(true){
            int stuCode;
            System.out.printf("请输入学生编号");
            stuCode = sc.nextInt();
            for(int i  = 0; i < students.length; i++){
                if(stuCode != students[i].getStuNum()) {
                    stuInfor = false;
                    break;
                }
            }

            // 如果学生编号比对错误
            if (stuInfor == false){
                System.out.println("请输入正确的编号！");
            }else{
                // 学生总成绩stuSum
                int stuSum = 0;

                // 随机生成题号
                randomArr(randNum,10);
                for (int j = 0; j < randNum.length; j++){
                    System.out.println(testQuestions[randNum[j]].getTitle());
                    System.out.println(testQuestions[randNum[j]].getAnwserA());
                    System.out.println(testQuestions[randNum[j]].getAnwserB());
                    System.out.println(testQuestions[randNum[j]].getAnwserC());
                    System.out.println(testQuestions[randNum[j]].getAnwserD());
                    System.out.printf("你的答案是");
                    String stuAnswer;
                    stuAnswer = sc.next();

                    // 如果答案正确，不区分大小写
                    if(stuAnswer.equalsIgnoreCase(testQuestions[randNum[j]].getAnwser())){
                        stuSum += 10;
                    }
                    students[stuCode].setStuScore(stuSum);
                    System.out.println("该学生成绩为："+students[stuCode].getStuScore());
                }
            }
        }

    }


    // 生成不重复随机数的封装方法
    public static int[] randomArr(int[] arr,int num) {
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int temp = rd.nextInt(num);//先将随机数赋值给一个中间变量
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == temp) {
                    count++;//在外循环定义一个计数器,在内循环内判断是否重复.否则循环结束
                }
            }if (count>0){//内循环结束,在外循环判断是否计数器>0,如果是,就i--,重新随机.
                i--;
            }else{
                arr[i] = temp;
            }
        }
        return arr;
    }
}
