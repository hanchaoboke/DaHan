package com.banyuan.club.intensiveTraining.PracticeTwo;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author HanChao
 * @date 2020-03-31 00:47
 * 描述信息：
 * 在HashSet集合中添加三个Person对象，把姓名相同的人当做同一个人，禁止重复添加
 */
public class PracticeOne {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();

        hashSet.add(new Person("123","啦啦啦",12));
        hashSet.add(new Person("123","啦啦啦",12));
        hashSet.add(new Person("124","哈哈哈",22));

        Iterator<Person> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person.toString());
        }
    }
}

class Person{
    private String id;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        if(this.name.equalsIgnoreCase(person.name) && this.id.equalsIgnoreCase(person.id) && this.age == person.age) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
