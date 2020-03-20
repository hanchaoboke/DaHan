package PracticeOne;

/**
 * @author HanChao
 * @date 2020-03-19 19:40
 * 描述信息：学生信息
 */
public class StudentInfor {
    private int stuId = 0;
    private String stuName;

    public StudentInfor() {
    }

    public StudentInfor(int stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
    }

    public StudentInfor(String stuName) {
        this.stuName = stuName;
        this.stuId = getStuId() + 1;
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

    @Override
    public String toString() {
        return "学号为："+stuId+" ,姓名为："+stuName;
    }
}
