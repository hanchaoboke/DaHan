package QuestionFive;

/**
 * @author HanChao
 * @date 2020-03-11 21:07
 * 描述信息：姓名name、性别gender、年龄age、国籍nationality； 方法：吃饭eat、睡觉sleep，工作work。
 */
public class Person {
    private String name;
    private int gender;
    private int age;
    private String nationality;

    public Person(String name, int gender, int age, String nationality) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String eat(){
        return "能吃饭";
    }

    public String sleep(){
        return "能睡觉";
    }

    public String  work(){
        return "在工作";
    }
}
