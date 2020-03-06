/**
 * 
String a ="aa";  
int c = 555;  
String b = a+"bbb"+c;  
double d = 5.66600;  
int e = (int) d;  
int f = 3;  
double g = 3.53; 
float h = 1.7f;  
int i = 1;  
System.out.println(b); 
System.out.println(e);  
System.out.println( f/i );  
System.out.println( g/f);  
System.out.println( h/f );
System.out.println(  9.5<8 );  
System.out.println( (int)'a' +  (int)'z' );  
System.out.println("A~Z："+((int)'A')+"~"+((int)'Z'));  
System.out.println("'A' < 'a':"+('A' < 'a'));
 */
/**
 * basics6
 */
public class basics6 {

    public static void main(String[] args) {
        String a ="aa";  
        int c = 555;  
        String b = a+"bbb"+c;  
        double d = 5.66600;  
        int e = (int) d;  
        int f = 3;  
        double g = 3.53; 
        float h = 1.7f;  
        int i = 1;  
        System.out.println(b); 
        System.out.println(e);  
        System.out.println( f/i );  
        System.out.println( g/f);  
        System.out.println( getType(h/f) );
        System.out.println(  9.5<8 );  
        System.out.println( (int)'a' +  (int)'z' );  
        System.out.println("A~Z："+((int)'A')+"~"+((int)'Z'));  
        System.out.println("'A' < 'a':"+('A' < 'a'));
    }
    private static String getType(Object a) {
        return a.getClass().toString();
    }
}

/**
 * 数据类型之间的转换是低精度向高精度转换，小范围向大范围转换
 * 字符之间的运算都是先转换成为ASII值再运算
 */