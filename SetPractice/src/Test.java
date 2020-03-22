import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author HanChao
 * @date 2020-03-21 22:25
 * 描述信息：
 * 现有两个数据存储容器,存储学生和存储考试试题,学生需要登录考试系统才能进行考试,每答对一题加十分,如果答错没有分
 * 现在有一个学生进行考试,请在控制台输出这个学生的考试成绩
 */
public class Test implements TestSystem {
    static Scanner sc = new Scanner(System.in);

    // 创建链表，存储学生信息
    static LinkedList<Student> linkStudent = new LinkedList<Student>();
    Student student = null;

    // 创建链表，存储试卷信息
    static LinkedList<TestPaper> linkTestPaper = new LinkedList<TestPaper>();
    TestPaper testPaper = null;

    public static void main(String[] args) {

        Test test = new Test();
        test.studentAdd();
        test.testPaperAdd();
        test.answerPapers();

        for (Student stu : linkStudent) {
            System.out.println(stu.toString());
        }

    }


    @Override
    public void studentAdd() {
        // 初始化学生信息
        student = new Student(1111, "小明", 123456);
        linkStudent.add(student);
        student = new Student(student.getStuId() + 1, "小红", 123456);
        linkStudent.add(student);
        student = new Student(student.getStuId() + 1, "小绿", 123456);
        linkStudent.add(student);
        student = new Student(student.getStuId() + 1, "小粉", 123456);
        linkStudent.add(student);
        student = new Student(student.getStuId() + 1, "小紫", 123456);
        linkStudent.add(student);
    }

    @Override
    public void testPaperAdd() {
        // 初始化试卷信息
        testPaper = new TestPaper(110, "彩虹有几个颜色", "6", "7", "8", "9", "B");
        linkTestPaper.add(testPaper);
        testPaper = new TestPaper(testPaper.getTestId() + 1, "羊有几条腿", "2", "3", "4", "5", "C");
        linkTestPaper.add(testPaper);
        testPaper = new TestPaper(testPaper.getTestId() + 1, "小汽车有几个轮子", "1", "2", "3", "4", "D");
        linkTestPaper.add(testPaper);
    }

    @Override
    public void answerPapers() {
        // 输入学号和密码，匹配成功后开始答题
        int stuId = 0;
        int stuPwd = 0;
        String answer = "";

        loop:
        for (int i = 0; i < 10; i++) {
            System.out.printf("请输入学号：");
            stuId = sc.nextInt();
            System.out.printf("请输入密码：");
            stuPwd = sc.nextInt();

            for (Student stu : linkStudent) {
                if (stu.getStuId() == stuId & stu.getStuPwd() == stuPwd) {
                    System.out.println("学号" + stu.getStuId() + "，姓名" + stu.getStuName() + "，请开始答题");

                    // 答题
                    for (TestPaper test : linkTestPaper) {
                        System.out.println(test.toString());
                        System.out.printf("请输入你的答案：");
                        answer = sc.nextLine();
                        System.out.println();

                        // 判断对错
                        if (test.getTestAnswer().equalsIgnoreCase(answer)) {
                            stu.setStuScore(stu.getStuScore() + 10);
                        }
                    }
                    System.out.println("答题结束");
                    System.out.println(stu.toString());
                }else {
                    System.out.println("错误，请重新输入");
                    break loop;
                }
            }
        }
    }
}
