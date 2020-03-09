package HomeWorkTwo;

import java.util.Scanner;

/**
 * @author HanChao
 * @date 2020-03-09 21:02
 * 描述信息：作业2:
 * 实现封装的具体步骤如下：
 * 1.修改属性的可见性来限制对属性的访问，一般设为 private。
 * 2.为每个属性创建一对赋值（setter）方法和取值（getter）方法，一般设为 public，用于属性的读写。
 * 3.在赋值和取值方法中，加入属性控制语句（对属性值的合法性进行判断
 */
public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter person' information, sex is 1 or 2, default of sex is 1 ");
        System.out.printf("person' name is ");
        person.setName(sc.nextLine());
        System.out.printf("person' age is ");
        person.setAge(sc.nextInt());
        System.out.printf("person' sex is ");
        person.setSex(sc.nextByte());
        System.out.printf("person' height is ");
        person.setHeight(sc.nextDouble());
        System.out.printf("person' weight is ");
        person.setWeight(sc.nextDouble());

        person.describe();
    }
}
