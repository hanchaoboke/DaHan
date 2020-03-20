package PracticeTwo;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @author HanChao
 * @date 2020-03-19 19:49
 * 描述信息：
 * 3.在一个列表中存储以下元素：apple,grape,banana,pear
 *   返回集合中的最大的和最小的元素
 *   将集合进行排序，并将排序后的结果打印在控制台上
 */
public class QuestionThree {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("apple");
        linkedList.add("grape");
        linkedList.add("banana");
        linkedList.add("pear");
        System.out.println("最大的元素为"+Collections.max(linkedList));
        System.out.println("最小的元素为"+Collections.min(linkedList));

        Collections.sort(linkedList);
        for(Object obj :linkedList){
            System.out.println(obj);
        }
    }
}
