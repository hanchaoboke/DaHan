package ProgrammingExercises;

/**
 * @author HanChao
 * @date 2020-03-15 08:30
 * 描述信息：随着该公司的业务扩展，该公司决定自己生产首饰，该公司多了一种新的类型的员工，
 * 首饰工人。
 * 定义首饰工人类，实现员工接口：
 * 属性
 * 生产首饰的数量
 * 方法
 * 1  设置生产首饰的数量
 * 2  重写计算工资的方法
 * 工资  ==  设置生产首饰的数量  *50；
 * 8） 在main 函数中多生成一个首饰工人对象，生产首饰的数量30；
 * 将该对象加入公司对象中，
 * 然后调用输出所有员工工资和的方法，查看该公司该月应该发的工资总和。
 */
public class Jeweler implements EmployeeInterface {
    private String name;
    private int number;

    public Jeweler() {
    }

    public Jeweler(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Jeweler{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public String GetName(){
        return name;
    }
    @Override
    public double GetSalary(){
        return (number * 50);
    }
}
