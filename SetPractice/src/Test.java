import java.util.*;

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

        System.out.println("按0退出系统");
        while (true) {

            int stuId = 0;
            int stuPwd = 0;
            System.out.printf("请输入学号：");
            stuId = sc.nextInt();
            if (stuId == 0) {
                System.exit(0);
            }
            System.out.printf("请输入密码：");
            stuPwd = sc.nextInt();
            if (stuPwd == 0) {
                System.exit(0);
            }

            // 验证学生信息，不存在返回-1
            int limits = test.verify(new Student(stuId,stuPwd));
            if (limits == -1){
                System.out.println("信息错误，请重新输入");
            }else {
                test.answerPapers(linkStudent.get(limits));
            }
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
    public int verify(Student o) {
        // 验证学生信息
        for (Student s : linkStudent) {
            if (s.getStuId() == o.getStuId() & s.getStuPwd() == o.getStuPwd()) {
                return linkStudent.indexOf(s);
            }
        }
        return -1;
    }

    @Override
    public void answerPapers(Student stu) {
        // 答题
        String answer;
        for (TestPaper test : linkTestPaper) {
            System.out.println(test.toString());
            System.out.printf("请输入你的答案：");
            answer = sc.next();
            System.out.println();

            // 判断对错
            if (test.getTestAnswer().equalsIgnoreCase(answer)) {
                stu.setStuScore(stu.getStuScore() + 10);
            }
        }
        System.out.println("答题结束");
        System.out.println(stu.toString());
        System.out.println();
    }
}
