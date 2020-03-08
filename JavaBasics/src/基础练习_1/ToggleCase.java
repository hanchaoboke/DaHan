package 基础练习_1;

import java.util.Scanner;

/**
 * @author CXY
 * @date 2020-03-08 17:26
 * 描述信息：给定一个任意的大写字母A~Z，转换为小写字母
 */
public class ToggleCase {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a majuscule：");
        ch = sc.next().charAt(0);
        System.out.println("toupper:"+(char)(ch+32));
    }
}
