package PracticeOne;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author HanChao
 * @date 2020-03-19 17:55
 * 描述信息：
 * 9.有一个学生类Student   学生编号，学生姓名，现在对学生仓库做增删改查操作 学生每次被添加
 * 该学生的学号自加1   如 9527   9528  等等
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<StudentInfor> linkedList = new LinkedList<StudentInfor>();
        System.out.println("");

        int stuId;
        String stuName = "";

        StudentInfor stu = new StudentInfor();

        System.out.println("请输入学号和姓名，按0退出");
        while(true){

            // 如果键入的姓名为0，则终止输入
            if (stuName.equals("0")){
                linkedList.removeLast();
                break;
            }

            // 第一次输入需要设置学号和姓名
            if(stu.getStuId() == 0){
                System.out.printf("第一次输入请输入学号：");
                stuId = sc.nextInt();
                System.out.printf("请输入姓名：");
                stuName = sc.next();
                stu = new StudentInfor(stuId, stuName);
                linkedList.add(stu);
            }

            // 第二次开始则不需要填写学号，自动自增
            System.out.printf("请输入姓名：");
            stuName = sc.next();
            stu = new StudentInfor(stu.getStuId() + 1, stuName);
            linkedList.add(stu);
        }

        // 输出输入的学生信息
        for (StudentInfor studentInfor : linkedList){
            System.out.println(studentInfor.toString());
        }
        System.out.println();

        // 添加学生

        System.out.printf("请输入要添加学生的名字:");
        stuName = sc.next();
        stu = new StudentInfor(stu.getStuId() + 1, stuName);
        linkedList.add(stu);

        // 输出输入的学生信息
        for (StudentInfor studentInfor : linkedList){
            System.out.println(studentInfor.toString());
        }
        System.out.println();

        // 通过名字查找学生详细信息
        System.out.printf("请输入要查找的学生姓名");
        stuName = sc.next();
        for (StudentInfor studentInfor : linkedList){
            if (studentInfor.getStuName().equalsIgnoreCase(stuName)){
                System.out.println(studentInfor.toString());
            }
        }

        System.out.println();
        // 通过名字修改信息
        System.out.printf("请输入要修改的学生姓名");
        stuName = sc.next();
        for (StudentInfor studentInfor : linkedList){
            if (studentInfor.getStuName().equalsIgnoreCase(stuName)){
                System.out.println(studentInfor.toString());
                System.out.printf("请输入学号");
                stuId = sc.nextInt();
                System.out.printf("请输入姓名");
                stuName = sc.next();
                studentInfor.setStuId(stuId);
                studentInfor.setStuName(stuName);
            }
        }
        for (StudentInfor studentInfor : linkedList){
            System.out.println(studentInfor.toString());
        }
        System.out.println();

        // 通过名字删除信息
        System.out.printf("请输入要删除的学生名字：");
        stuName = sc.next();
        for (StudentInfor studentInfor : linkedList){
            if (studentInfor.getStuName().equalsIgnoreCase(stuName)){
                linkedList.remove(studentInfor);
                System.out.println("已删除");
            }
        }
        for (StudentInfor studentInfor : linkedList){
            System.out.println(studentInfor.toString());
        }
    }
}
