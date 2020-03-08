package 基础练习_1;

/**
 * @author CXY
 * @date 2020-03-08 15:22
 * 描述信息：10011101  转换成八进制  和十六进制
 */
public class ConversionOfNumber {
    public static void main(String[] args) {
        String a = "1001101";
        int b = Integer.parseInt(a,2);
        System.out.println("8 band is "+Integer.toOctalString(b));
        System.out.println("16 band is "+Integer.toHexString(b));
    }
}
