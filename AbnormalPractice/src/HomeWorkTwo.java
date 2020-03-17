import java.util.Scanner;

/**
 * @author HanChao
 * @date 2020-03-17 19:33
 * 描述信息：
 * 2.写一个方法void isTriangle(int a,int b,int c)，判断三个参数是否能构成一个三角形，
 * 如果不能则抛出异常IllegalArgumentException，显示异常信息 “a,b,c不能构成三角形”，
 * 如果可以构成则显示三角形三个边长，在主方法中得到命令行输入的三个整数， 调用此方法，并捕获异常。
 */
public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0, c = 0;

        System.out.printf("请输入a：");
        a = sc.nextInt();
        System.out.printf("请输入b：");
        b = sc.nextInt();
        System.out.printf("请输入c：");
        c = sc.nextInt();

        isTriangle(a,b,c);

    }

    // 判断是否能成三角形
    public static void isTriangle(int a, int b, int c){
        try{
            if((a + b) > c & (b + c) > a & (a + c) > b){
                System.out.println("能构成三角形"
                                    + "\na =" + a
                                    + "\nb =" + b
                                    + "\nc =" + c);
            }else{
                throw new IllegalArgumentException("a,b,c不能构成三角形");
            }
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

}


