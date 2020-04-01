package com.banyuan.club.intensiveTraining.PracticeTwo;

import java.util.LinkedList;

/**
 * @author HanChao
 * @date 2020-03-31 08:05
 * 描述信息：
 *
 * 3.请使用LinkedList来模拟一个队列(先进先出的特性)
 * 3.1 拥有放入对象的方法void put(Object o)
 * 3.2 取出对象的方法Object get()
 * 3.3 判断队列当中是否为空的方法booleanisEmpty()；并且，编写测试代码，验证你的队列是否正确？
 */
public class PractiveThree {
    public static void main(String[] args) {
        MyQueue<Student> myQueue = new MyQueue<>();
        myQueue.put(new Student("123","张三"));
        myQueue.put(new Student("124","张四"));
        myQueue.put(new Student("125","张五"));
        myQueue.put(new Student("126","张六"));

        if (myQueue.isEmpty()){
            System.out.println("======队列为空");
        }

        System.out.println(myQueue.get());


}
}

// 模拟队列
class MyQueue<T>{
    private int size = 0;
    LinkedList<T> linkedList = new LinkedList<>();

    // 模拟put
    public void put(T t){
        linkedList.addFirst(t);
        size++;
    }

    // 模拟get
    public T get(){
        return linkedList.getFirst();
    }

    // 判空
    boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}

class Student{
    private String id;
    private String name;

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
