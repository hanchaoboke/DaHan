package 基础练习_4;

/**
 * @author CXY
 * @date 2020-03-08 23:43
 * 描述信息：在一个数组中找出最大和最小值，并输出它们的位置
 */
public class FindMaxAndMinNumber {
    public static void main(String[] args) {
        int source[] = {1,3,4,6,7,4,2,4,5,678};

        int min = 0, max = 0;
        source[min] = source[0];
        source[max] = source[0];
        for(int i = 0; i < source.length; i++){
            if(source[i] > source[max]){
                source[max] = source[i];
            }
            if(source[i] < source[min]){
                source[min] = source[i];
            }
        }
        System.out.println("The max number is "+source[max]);
        System.out.println("The min number is "+source[min]);
    }
}
