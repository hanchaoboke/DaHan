package PracticeTwo.QuestionOne;

/**
 * @author HanChao
 * @date 2020-03-19 21:25
 * 描述信息：所选课程如下： 9527  java基础 ，9768 C# ，9898 javaScript
 */
public class Course {
    int cId;
    String cName;

    public Course() {
    }

    public Course(int cId, String cName) {
        this.cId = cId;
        this.cName = cName;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "课程ID为 "+cId+" , 课程名为 "+cName;
    }
}
