package QuestionTwo;

import java.util.ArrayList;

/**
 * @author HanChao
 * @date 2020-03-24 10:39
 * 描述信息：
 */
public class Test {
    static Dao<Integer> dao = new Dao<>();

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(8);
        Number number = dao.minMaxAvg(arrayList);

        System.out.println(number.getMinNmber());
        System.out.println(number.getMaxNumber());

    }
}
