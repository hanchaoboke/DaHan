/**
 * int a = 10;
    int b = 10;
    int c = 10;
    a = b++;    
    c = --a;    
    b = ++a;    
    a = c--;    
System.out.println("a="+a+",b="+b+",c="+c);
求出a  b  c的值
 */
/**
 * basics1
 */
public class basics1 {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        a = b++;
        c = --a;
        b = ++a;
        a = c--;
        System.out.println("a = "+a+ ",b = "+b+",c = "+c);
    }
    
}

/**
 * b++ 表示b先参与运算再自增，--a 表示a先自减再参与运算，运算过程如下
 * a = b++;     a = 10 , b = 11 , c = 10
 * c = --a;     a = 9 ,  b = 11 , c = 9 
 * b = ++a;     a = 10 , b = 10 , c = 9
 * a = c--;     a = 9  , b = 10 , c = 8
 * 同时注意到每个变量在有初始值以后，每次赋值都会覆盖该变量之前的赋值
 */