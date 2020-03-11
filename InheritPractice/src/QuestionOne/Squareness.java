package QuestionOne;

/**
 * @author HanChao
 * @date 2020-03-11 19:48
 * 描述信息：定义一个类，描述一个矩形，包含有长、宽两种属性，和计算面积方法。
 */
public class Squareness {
    private int length;
    private int weght;

    public Squareness(int length, int weght) {
        this.length = length;
        this.weght = weght;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeght() {
        return weght;
    }

    public void setWeght(int weght) {
        this.weght = weght;
    }

    public int calculateArea(){
        return (length * weght);
    }
}
