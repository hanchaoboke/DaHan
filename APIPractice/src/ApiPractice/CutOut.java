package ApiPractice;

import java.io.UnsupportedEncodingException;

/**
 * @author HanChao
 * @date 2020-03-16 22:35
 * 描述信息：
 * 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截取的字符串。
 * 但是要保证汉字不被截半个，如“我ABC”4，应该截为“我AB”，输入“我ABC汉DEF”，6，
 * 应该输出为“我ABC”而不是“我ABC+汉的半个”。
 */
public class CutOut {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "我ABCD";
        int len = str.getBytes("utf-8").length;
        byte[] bytes = str.getBytes("utf-8");

        // 汉字是负数编码？
//        for (int i = 0; i <= len - 1; i++){
//            System.out.printf(bytes[i]+" ");
//        }

        // 感觉字节数组能操作一些事情，想不到怎么去用。
    }
}
