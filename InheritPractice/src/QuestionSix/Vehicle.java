package QuestionSix;

/**
 * @author HanChao
 * @date 2020-03-11 21:57
 * 描述信息：设计一个汽车类Vehicle，包含的属性有车轮个数wheels和车重weight
 */
public class Vehicle {
    private int wheels;
    private int weight;

    public Vehicle(int wheels, int weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "汽车轮子有 "+wheels+" 车重 "+weight;
    }
}
