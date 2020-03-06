/**
 * int x = 4;
    int y =(x++)+(++x)+(x*10);
System.out.println("x="+x+",y="+y);        
求出x  y的值
 */
/**
 * basics2
 */
public class basics2 {

    public static void main(String[] args) {
        int x = 4;
        int y =(x++)+(++x)+(x*10);
        System.out.println("x="+x+",y="+y);        
    }
}

// x的值为6，y的值为70
// x++ 表示x先参与运算，再自增； ++x 表示x先自增，再参与运算；
// 所以y = 4 + 6 + 6 * 10 = 70;x = 6