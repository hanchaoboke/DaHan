package QuestionFour;

/**
 * @author HanChao
 * @date 2020-03-11 20:42
 * 描述信息：看不明白了，不明白为什么main函数里输出的shape.name是父类的shape而不是子类的circle
 */
public class Test {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println("1"+shape.name);
        shape.printType();
        Shape.printName();
    }
}
class Shape {
    public String name = "shape";
    public Shape(){
        System.out.println("shape constructor");
    }
    public void printType() {
        System.out.println("this is shape");
    }
    public static void printName() {
        System.out.println("shape");
    }
}
class Circle extends Shape {
    public String name = "circle";
    public Circle() {
        System.out.println("circle constructor");
    }
    @Override
    public void printType() {
        System.out.println("this is circle");
    }
    public static void printName() {
        System.out.println("circle");
    }
}