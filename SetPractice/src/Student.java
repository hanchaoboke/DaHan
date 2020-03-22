/**
 * @author HanChao
 * @date 2020-03-21 22:17
 * 描述信息：学生类,学生编号,学生姓名,学生密码,学生成绩
 */
public class Student {
    private int stuId;
    private String stuName;
    private int stuPwd;
    private int stuScore = 0;

    public Student() {
    }

    public Student(int stuId, String stuName, int stuPwd) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuPwd = stuPwd;
    }

    public Student(int stuId, int stuPwd) {
        this.stuId = stuId;
        this.stuPwd = stuPwd;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuPwd() {
        return stuPwd;
    }

    public void setStuPwd(int stuPwd) {
        this.stuPwd = stuPwd;
    }

    public int getStuScore() {
        return stuScore;
    }

    public void setStuScore(int stuScore) {
        this.stuScore = stuScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuPwd=" + stuPwd +
                ", stuScore=" + stuScore +
                '}';
    }
}
