package PracticeTwo.QuestionOne;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author HanChao
 * @date 2020-03-19 21:14
 * 描述信息：
 * 1.模拟在校学生选课系统,使用集合完成
 * 要求：1.学生类:学号，姓名，所选课程Set<Course>
 * 学生可以对课程做增删改查操作
 * 2.课程类：编号 课程名称
 * 3.学生选课清单类
 * 完成:有n个人 显示出每个人所选的课程信息
 * 如：姓名：张三:    所选课程如下： 9527  java基础 ，9768 C# ，9898 javaScript 等
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 选课初始化
        LinkedList courseLink = new LinkedList();
        courseLink.add(new Course(9527,"java基础"));
        courseLink.add(new Course(9768,"C#"));
        courseLink.add(new Course(9898,"javaScript"));
        courseLink.add(new Course(9998,"jQuery"));
        courseLink.add(new Course(9099,"计算机组成原理"));

        // 选课名单
        System.out.println("可选的课有:");
        for (Object obj : courseLink){
            System.out.println(obj.toString());
        }

        System.out.println();

        // 学生选课
        Student stu1 = new Student(100,"小明");
        System.out.println("欢迎 "+stu1.getStuName()+" 同学选课");
        for (int i = 0; i < 3; i++){
            System.out.printf("请输入课程号：");
            int choiceCourseId = sc.nextInt();
            for (Course course: stu1.course){
                if (course.cId == choiceCourseId){
                    stu1.course.add(course);
                }
            }
        }
        for (Course course:stu1.course){
            System.out.println(course.getcId()+course.getcName());
        }
    }
}
