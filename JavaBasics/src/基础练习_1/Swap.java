package 基础练习_1;

/**
 * @author CXY
 * @date 2020-03-06 16:34
 * 描述信息：已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序
 * int   a=2;
 * int  b=3;
 *
 */
public class Swap {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("交换过后：");
        swapOne(a,b);
        swapTwo(a,b);
        swapThree(a,b);
    }

    /**
     * 第一种交换方法
     */
    public static void swapOne(int a, int b){
        System.out.println("第一种方法");
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("x = "+a+", y = "+b);
    }
    /**
     * 第二种交换方法
     */
    public static void swapTwo(int a, int b){
        System.out.println("第二种方法");
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("x = "+a+", y = "+b);
    }
    /**
     * 第三种交换方法
     */
    public static void swapThree(int a, int b){
        System.out.println("第三种方法");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("x = "+a+", y = "+b);
    }
}
