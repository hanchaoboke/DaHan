/**
 * @author HanChao
 * @date 2020-03-10 23:42
 * 描述信息：编号stuNum,姓名stuName,年级stuGrade,成绩stuScore
 */
public class Student {
    private int stuNum;
    private String stuName;
    private byte stuGrade;
    private int stuScore;

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public byte getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(byte stuGrade) {
        this.stuGrade = stuGrade;
    }

    public int getStuScore() {
        return stuScore;
    }

    public void setStuScore(int stuScore) {
        this.stuScore = stuScore;
    }
}
