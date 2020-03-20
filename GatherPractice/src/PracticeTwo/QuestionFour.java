package PracticeTwo;

import java.util.HashSet;
import java.util.Random;

/**
 * @author HanChao
 * @date 2020-03-19 20:00
 * 描述信息：
 * 4.产生10个1~20之间的随机数，要求随机数不能重复
 */
public class QuestionFour {
    public static void main(String[] args) {
        Random random = new Random();

        HashSet set = new HashSet();

        while(set.size() < 10){
            set.add(random.nextInt(20) + 1);
        }

        for (Object obj: set) {
            System.out.printf(obj + " ");
        }


    }
}
