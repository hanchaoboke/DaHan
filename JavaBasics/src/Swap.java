/**
 * @author CXY
 * @date 2020-03-06 16:34
 * 描述信息：
 */
public class Swap {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("交换过后：");
        swapOne(x,y);
        swapTwo(x,y);
        swapThree(x,y);
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
