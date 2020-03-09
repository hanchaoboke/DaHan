package HomeWorkTwo;

/**
 * @author HanChao
 * @date 2020-03-09 21:02
 * 描述信息：This class named Person means Person'property
 */
public class Person {
    private String name;
    private int age;
    private byte sex;
    private double height;
    private double weight;

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
        if(age >= 0 || age <= 100){
            this.age = age;
        }else{
            System.out.println("error: enter a wrong age");
            this.age = 0;
        }

    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        if(sex == 0 || sex == 1){
            this.sex = sex;
        }else{
            System.out.println("error: enter a wrong sex, default is 0");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // describe methods can describe person' information
    public void describe(){
        System.out.println("This person' information is");
        System.out.println("name is "+getName());
        System.out.println("age is "+getAge());
        System.out.println("sex is "+getSex());
        System.out.println("height is "+getHeight());
        System.out.println("weight is "+getWeight());
    }
}
