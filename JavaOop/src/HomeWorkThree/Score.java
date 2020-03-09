package HomeWorkThree;

/**
 * @author HanChao
 * @date 2020-03-09 21:38
 * 描述信息：This class maned source, include chinese, math, english and science， method is averageScore
 */
public class Score {
    private int chinese;
    private int math;
    private int english;
    private int science;

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }


    public double averageScore(){
        return ((getChinese() + getEnglish() + getMath() + getScience()) / 4.0);
    }
}
