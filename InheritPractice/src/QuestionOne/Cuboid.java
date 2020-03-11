package QuestionOne;

/**
 * @author HanChao
 * @date 2020-03-11 20:07
 * 描述信息：编写一个类，继承自矩形类，同时该类描述长方体，具有长、宽、高属性，和计算体积的方法。
 */
public class Cuboid extends Squareness{

    private int height;

    public Cuboid(int length, int weght, int height) {
        super(length, weght);
        this.height = height;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateTheVolume(){
        return (super.calculateArea() * height);
    }

}
