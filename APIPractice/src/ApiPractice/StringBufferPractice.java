package ApiPractice;
import java.lang.StringBuffer;

/**
 * @author HanChao
 * @date 2020-03-16 21:58
 * 描述信息：
 * 2.定义一个StringBuffer类对象，
 * 1）使用append方法向对象中添加26个字母，并倒序遍历输入
 * 2）删除前五个字符
 */
public class StringBufferPractice {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println("倒序输出");
        System.out.println(buffer.reverse());

        // 删除前五个字符
        buffer.reverse();
        buffer.delete(0,5);
        System.out.println(buffer);

    }
}
