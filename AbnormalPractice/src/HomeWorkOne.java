import java.io.IOException;
import java.util.Scanner;

/**
 * @author HanChao
 * @date 2020-03-17 18:31
 * 描述信息：
 * 1.编写程序接收用户输入分数信息，
 * 如果分数在0—100之间，输出成绩。
 * 如果成绩不在该范围内，抛出异常信息，
 * 提示分数必须在0—100之间。
 */
public class HomeWorkOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.printf("请输入分数:");
        score = sc.nextInt();

        try{
            if(score >= 0 && score <= 100){
                System.out.println("成绩为:"+score);
            }else{
                exception("成绩不在范围内");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    static void exception (String message) throws Exception{
        throw new Exception(message);
    }
}
