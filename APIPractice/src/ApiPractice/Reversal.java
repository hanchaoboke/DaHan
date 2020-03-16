package ApiPractice;
import java.lang.*;

/**
 * @author HanChao
 * @date 2020-03-16 22:12
 * 描述信息：3.将字符串中指定部分进行反转。
 */
public class Reversal {
    public static void main(String[] args) {
        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abcdefghijklmnopqrstuvwxyz");
        StringBuilder stringBuilder1 = new StringBuilder(stringBuilder.subSequence(2,20));
        System.out.println(stringBuilder1.reverse());

        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abcdefghijklmnopqrstuvwxyz");
        StringBuffer stringBuffer1 = new StringBuffer(stringBuffer.substring(2,20));
        System.out.println(stringBuffer1.reverse());
    }
}
