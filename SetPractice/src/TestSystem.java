import java.util.Objects;

/**
 * @author HanChao
 * @date 2020-03-22 11:34
 * 描述信息：
 */
public interface TestSystem {
    // 学生添加
    abstract void studentAdd();
    // 试卷添加
    abstract void testPaperAdd();
    // 验证学生信息,返回学生学号,没有此学生返回-1
    abstract  int verify(Student o);
    // 回答试卷
    abstract void answerPapers(Student stu);
}
