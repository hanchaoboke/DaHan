import java.util.Scanner;

/**
 * @author HanChao
 * @date 2020-03-17 19:58
 * 描述信息：
 * 3.编写一个计算N个整数平均值的程序。程序应该提示用户输入N的值，如何必须输入所有N个数。
 * 如果用户输入的值是一个负数，则应该抛出一个异常并捕获，提示“N必须是正数或者0”。并提示用户再次输入该数
 */
public class HomeWorkThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 0;

        System.out.printf("请输入N的值:");
        N = sc.nextInt();

        try {
            if(N < 0){
                throw new exception("N必须是正数或者0");
            }
        }catch (exception e){
            e.printStackTrace();
        }

        int[] num = new int[N];
        double sum = 0;

        for (int i = 0; i < num.length; i++){
            System.out.printf("请输入值");
            num[i] = sc.nextInt();
            sum += num[i];
        }

        System.out.println("平均数为:" + (sum / N));

    }
}

class exception extends Exception{
    public exception() {
    }

    public exception(String message) {
        super(message);
    }
}
