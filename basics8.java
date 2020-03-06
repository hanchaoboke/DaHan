/**
 * Int count=0;
For(int i=0;i<100;i++){
count=count++;
}
 */
/**
 * basics8
 */
public class basics8 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            count = count++;
            if(i == 99)
                System.out.println(count);
        }
        System.out.println(count);
    }
}
/**
 * 和前面的题一样，需要注意count++是先运算，count一直都是零
 */