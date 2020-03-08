package 基础练习_4;

/**
 * @author CXY
 * @date 2020-03-08 23:29
 * 描述信息：输入10个整数存入数组，然后复制到b数组中输出
 */
public class CopyArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,0};
        int b[] = new int[10];

        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
            System.out.print(b[i]+" ");
        }
    }
}
