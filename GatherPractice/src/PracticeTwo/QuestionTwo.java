package PracticeTwo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

/**
 * @author HanChao
 * @date 2020-03-19 20:24
 * 描述信息：
 * 2.某班级有 40 个学生，学号为 180201-180240，全部参加 Java 集合阶段检测，给出所有同学的成绩（可随机产生，范围为 50-100），
 * 请编写程序将本班各位同学成绩从高往低排序打印输出，
 * 注：成绩相同时学号较小的优先打印要求：打印的信息包含学号、姓名（姓名统一为“同学 J”[J=10,11,12。。。]）和成绩
 */
public class QuestionTwo {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList linkedList = new LinkedList();

        // 40名学生信息录入
        for (int i = 0, j = 10; i < 40; i++){
            int stuId = 180201 + i;
            String stuName = "J" + j++;
            int score = random.nextInt(51) + 50;
            linkedList.add(new StudentInfo(stuId,stuName,score));
        }

        //指定排序规则，排序
        Comparator<StudentInfo> comparator = new Comparator<StudentInfo>() {
            @Override
            public int compare(StudentInfo o1, StudentInfo o2) {
                if (o2.getScore() > o1.getScore()){
                    return 1;
                }else if (o2.getScore() < o1.getScore()){
                    return -1;
                }else {
                    return 0;
                }
            }
        };
        Collections.sort(linkedList,comparator);

        // 输出最终结果
        for (int i = 0; i < 40; i++){
            System.out.println(linkedList.get(i).toString());
        }
    }
}


/**
 * 学生信息
 * */
class StudentInfo{
    private int stuId;
    private String stuName;
    private int score;

    public StudentInfo() {
    }

    public StudentInfo(int stuId, String stuName, int score) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.score = score;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", score=" + score +
                '}';
    }
}
