package PracticeTwo.QuestionOne;

import java.util.HashSet;
import java.util.Set;

/**
 * @author HanChao
 * @date 2020-03-19 21:24
 * 描述信息：1.学生类:学号，姓名，所选课程Set<Course>
 */
public class Student {
    private int stuId;
    private String stuName;
    public Set<Course> course;

    public Student() {
    }

    public Student(int stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.course = new HashSet<Course>();
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
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", course=" + course +
                '}';
    }
}
