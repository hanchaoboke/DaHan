package QuestionThree;

import org.w3c.dom.ls.LSOutput;

/**
 * @author HanChao
 * @date 2020-03-11 20:30
 * 描述信息：这道题考察的是执行顺序，子类继承父类，执行的时候先执行父类方法，再执行子类方法，所以输出结果为
 * shape draw constructor
 * shape constructor
 * circle draw constructor
 * circle constructor
 */
class Test {
    public static void main(String[] args) {
        new Circle();
    }
}
class Draw {
    public Draw(String type) {
        System.out.println(type+" draw constructor");
    }
}
class Shape {
    private Draw draw = new Draw("shape");
    public Shape(){
        System.out.println("shape constructor");
    }
}
class Circle extends Shape {
    private Draw draw = new Draw("circle");
    public Circle() {
        System.out.println("circle constructor");
    }
}

