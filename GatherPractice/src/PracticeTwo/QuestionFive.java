package PracticeTwo;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author HanChao
 * @date 2020-03-19 20:14
 * 描述信息：
 * 5.手动输入一行字符串，去掉其中重复字符，打印出不同的那些字符
 */
public class QuestionFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashSet linkedHashSet = new LinkedHashSet();

        System.out.printf("请输入一串字符:");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        for (Object obj: chars){
            linkedHashSet.add(obj);
        }

        for (Object obj:linkedHashSet){
            System.out.print(obj);
        }
    }
}
