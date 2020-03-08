package 基础练习_3;

/**
 * @author CXY
 * @date 2020-03-08 21:40
 * 描述信息：找出能被5或6整除，但不能被两者同时整除的数
 */
public class CommonDivisor {
    public static void main(String[] args) {
        int n = 999;
        for(int i = 0; i <= n; i++){
            if((i % 5 == 0 & i % 6 != 0) | (i % 6 ==0) & i % 5 != 0){
                System.out.print(i+" ");

            }
        }
    }
}
