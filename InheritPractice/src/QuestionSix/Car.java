package QuestionSix;

/**
 * @author HanChao
 * @date 2020-03-11 22:00
 * 描述信息：小车类Car是Vehicle的子类，其中包含的属性有载人数loader。
 */
public class Car extends Vehicle{
    private int loader;

    public Car(int wheels, int weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public String toString(){
        return super.toString() + "可载人数 " + loader;
    }
}
