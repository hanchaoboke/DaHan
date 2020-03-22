/**
 * @author HanChao
 * @date 2020-03-21 22:21
 * 描述信息：试题类：试题编号（自增长）,试题名称,试题选项（四个 A B C D）,试题答案
 */
public class TestPaper {
    private int testId;
    private String testName;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private String testAnswer;

    public TestPaper() {
    }

    public TestPaper(int testId, String testName, String choiceA, String choiceB, String choiceC, String choiceD, String testAnswer) {
        this.testId = testId;
        this.testName = testName;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.choiceD = choiceD;
        this.testAnswer = testAnswer;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB;
    }

    public String getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC;
    }

    public String getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD;
    }

    public String getTestAnswer() {
        return testAnswer;
    }

    public void setTestAnswer(String testAnswer) {
        this.testAnswer = testAnswer;
    }

    @Override
    public String toString() {
        return testId + " "+ testName+"\n A "+choiceA+"\n B "+choiceB+"\n C "+choiceC+"\n D "+choiceD;
    }
}
