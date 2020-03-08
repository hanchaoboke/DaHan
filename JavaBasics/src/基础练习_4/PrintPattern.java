package 基础练习_4;

/**
 * @author CXY
 * @date 2020-03-08 23:04
 * 描述信息：打印出下面的图案
 * 54321
 * 5432
 * 543
 * 54
 * 5
 */
public class PrintPattern {
    public static void main(String[] args) {
        int a = 0;
        for(int i = 5; i > 0; i--){
            for(int j = 5; j > a; j--){
                System.out.print(j);
            }
            a++;
            System.out.println();
        }
    }
}
