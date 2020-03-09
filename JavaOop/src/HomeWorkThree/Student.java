package HomeWorkThree;

/**
 * @author HanChao
 * @date 2020-03-09 21:33
 * 描述信息：This class named Student, include scource and name
 */
public class Student {
    private String name;
    private Score score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Score getScore() {
        return score;
    }

    public void setSource(Score score) {
        this.score = score;
    }
}
