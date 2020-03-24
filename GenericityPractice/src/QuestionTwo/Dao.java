package QuestionTwo;

import java.util.ArrayList;

/**
 * @author HanChao
 * @date 2020-03-24 08:03
 * 描述信息：
 * 定义泛型类，成员变量是Number类或其子类对象的数组，
 * 成员方法有：求数组元素最小值、最大值和平均值。创建泛型类对象，分别求Integer和Double型数组的最小最大、平均值
 */
public class Dao<T> {
    ArrayList<Number> number = new ArrayList<>();

    //求数组元素最小值、最大值和平均值.
    public Number<T> minMaxAvg(ArrayList<Number> number){
        if (number == null || number.size() == 0){
            return null;
        }
        T min = (T)number.get(0);
        T max = (T)number.get(0);
        Double result = 0.0;
        byte by = 0;
        for (int i = 0; i < number.size(); i++){
            if (min.toString().compareTo(number.get(i).toString()) > 0){
                min = (T)number.get(i);
            }
            if (max.toString().compareTo(number.get(i).toString()) < 0){
                max = (T)number.get(i);
            }
            by += number
        }
        // 有错误，不会写了


    }

}
