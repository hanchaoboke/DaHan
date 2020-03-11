package QuestionFive;

/**
 * @author HanChao
 * @date 2020-03-11 21:23
 * 描述信息：自己出题:
 * 有一名美国24岁男子Tom，白天吃饭工作，晚上睡觉。
 * 后来在家里蹲学校里上学，白天吃饭，晚上睡觉。意外做了一名学生干部，毕业后当一名工人盖起来房子
 * 请描述他的人生轨迹
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("Tom",1,24,"美国");
        System.out.println("日常生活");
        System.out.println(person.eat() + person.sleep() + person.work());

        System.out.println("上学生活");
        StudentLeader stu = new StudentLeader("Tom", 1,25,"美国","家里蹲",12345);
        System.out.println(stu.eat() + stu.sleep() + stu.work());
        System.out.println("意外做了学生干部");
        stu.setJob("班长");
        System.out.println(stu.meeting());

        System.out.println("工作生活");
        Worker worker = new Worker("Tom",1,29,"美国","工地",1);
        System.out.println(worker.eat() + worker.sleep() + worker.work());



    }
}
