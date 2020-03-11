package QuestionSix;

/**
 * @author HanChao
 * @date 2020-03-11 22:03
 * 描述信息：每个类都有构造方法和输出相关数据的方法。最后，写一个测试类来测试这些类的功能
 */
public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4,2);
        System.out.println("车辆信息 " + vehicle.toString());

        Car car = new Car(4,2,5);
        System.out.println("小车信息 " + car.toString());

        Truck truck = new Truck(6,4,5,20);
        System.out.println("卡车信息 "+truck.toString());
    }
}
