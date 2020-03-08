package 基础练习_1;

/**
 * @author CXY
 * @date 2020-03-08 15:17
 * 描述信息：求BCD+2F的值
 */
public class SumOf16Band {
    public static void main(String[] args) {
        int a = 0xBCD;
        int b = 0x2F;
        int sum = a + b;
        System.out.println("0xBCD + 0x2F = "+sum);
    }
}
