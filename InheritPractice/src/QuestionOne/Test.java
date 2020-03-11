package QuestionOne;

/**
 * @author HanChao
 * @date 2020-03-11 20:10
 * 描述信息：编写一个测试类，对以上两个类进行测试，创建一个长方体，定义其长、宽、高，输出其底面积和体积
 */
public class Test {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(3, 4, 5);
        System.out.println("其底面积为："+cuboid.calculateArea());
        System.out.println("其体积为："+cuboid.calculateTheVolume());


    }

}
