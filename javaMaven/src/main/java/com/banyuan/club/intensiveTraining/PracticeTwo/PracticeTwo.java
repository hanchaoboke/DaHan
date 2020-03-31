package com.banyuan.club.intensiveTraining.PracticeTwo;

import java.util.*;

/**
 * @author HanChao
 * @date 2020-03-31 01:57
 * 描述信息：
 * 选择合适的Map集合保存5位学员的学号和姓名，然后按学号的自然顺序的倒序将这些键值对一一打印出来
 */
public class PracticeTwo {
    public static void main(String[] args) {
        Map map = new TreeMap(new MyCompaarator());

        map.put("1","张三");
        map.put("3","张四");
        map.put("2","张五");
        map.put("4","张六");

        for (Object key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }


    }

    static class MyCompaarator implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            String id1 = (String) o1;
            String id2 = (String) o2;
            return id1.compareTo(id2);
        }
    }
}


