package QustionTwo;

/**
 * @author HanChao
 * @date 2020-03-11 20:27
 * 描述信息：执行结果是1. 子类继承父类，调用父类方法，没有重写操作，所以i的值为1
 */
class A {
    int i = 1;
    void print() {
        System.out.println(i);
    }
}
public class B extends A {

    static int i = 2;

    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}
