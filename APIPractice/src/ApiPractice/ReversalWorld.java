package ApiPractice;
import java.lang.*;

/**
 * @author HanChao
 * @date 2020-03-16 22:23
 * 描述信息：
 * 4. 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
 * “To be or not to be"，将变成"oT eb ro ton ot eb."。
 */
public class ReversalWorld {
    public static void main(String[] args) {
        String str = "To be or not to be";
        String[] strArr = str.split(" ");

        for(int i = 0; i < strArr.length; i++){
            StringBuffer stringBuffer = new StringBuffer(strArr[i]);
            stringBuffer = stringBuffer.reverse();
            System.out.printf(stringBuffer+" ");
        }
    }
}
