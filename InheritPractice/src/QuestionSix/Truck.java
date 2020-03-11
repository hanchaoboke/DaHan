package QuestionSix;

/**
 * @author HanChao
 * @date 2020-03-11 22:01
 * 描述信息：卡车类Truck是Car类的子类，其中包含的属性有载重量payload。
 */
public class Truck extends Car{
    private int payload;

    public Truck(int wheels, int weight, int loader, int payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public String toString(){
        return super.toString() + "载重量 " + payload;
    }
}
