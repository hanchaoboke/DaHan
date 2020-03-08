package 基础练习_4;

/**
 * @author CXY
 * @date 2020-03-08 23:19
 * 描述信息：定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出
 */
public class FindMaxNumber {
    public static void main(String[] args) {
        int num[] = {1,4,5,6,7,3,4,6,9,2};
        int max = 0;
        num[max] = num[0];
        for(int i = 0; i < 10; i++){
            if(num[i] > num[max]){
                num[max] = num[i];
                max = i;
            }
        }
        System.out.println("max number is "+num[max]);
        System.out.println("max sub is "+max);
    }
}
