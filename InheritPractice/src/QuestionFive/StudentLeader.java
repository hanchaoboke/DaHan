package QuestionFive;

/**
 * @author HanChao
 * @date 2020-03-11 21:21
 * 描述信息：根据学生类，创建一个学生干部类 StudentLeader
 * 增加属性：职务job； 增加方法：开会meeting。 编写测试类分别对上述3类具体人物进行测试。
 */
public class StudentLeader extends Student{
    private String job;

    public StudentLeader(String name, int gender, int age, String nationality, String school, int stuNumber) {
        super(name, gender, age, nationality, school, stuNumber);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String meeting(){
        return "在开会";
    }
}
