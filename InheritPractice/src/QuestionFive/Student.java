package QuestionFive;

/**
 * @author HanChao
 * @date 2020-03-11 21:11
 * 描述信息：根据人类，创建一个学生类Student
 * 增加属性：学校school、学号stuNumber； 重写工作方法（学生的工作是学习）
 */
public class Student extends Person{
    private String school;
    private int stuNumber;

    public Student(String name, int gender, int age, String nationality, String school, int stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public String work(){
        return "正在学习";
    }
}
