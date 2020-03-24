package QuestionTwo;

/**
 * @author HanChao
 * @date 2020-03-24 08:04
 * 描述信息：
 */
public class Number<T> {
    private T minNmber;
    private T maxNumber;
    private T avgNumber;

    public Number() {
    }

    public Number(T minNmber, T maxNumber, T avgNumber) {
        this.minNmber = minNmber;
        this.maxNumber = maxNumber;
        this.avgNumber = avgNumber;
    }

    public T getMinNmber() {
        return minNmber;
    }

    public void setMinNmber(T minNmber) {
        this.minNmber = minNmber;
    }

    public T getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(T maxNumber) {
        this.maxNumber = maxNumber;
    }

    public T getAvgNumber() {
        return avgNumber;
    }

    public void setAvgNumber(T avgNumber) {
        this.avgNumber = avgNumber;
    }

    @Override
    public String toString() {
        return "Number{" +
                "minNmber=" + minNmber +
                ", maxNumber=" + maxNumber +
                ", avgNumber=" + avgNumber +
                '}';
    }
}
