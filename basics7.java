/**
 * System.out.println(6 & 3);    
System.out.println(6 & 2);    

System.out.println(6 | 3);   
System.out.println(6 | 2);    

System.out.println(6 ^ 3);   
System.out.println(6 ^ 2);    

System.out.println(~6);  
 */
/**
 * basics
 */
public class basics7 {

    public static void main(String[] args) {
        System.out.println(6 & 3);    
        System.out.println(6 & 2);    

        System.out.println(6 | 3);   
        System.out.println(6 | 2);    

        System.out.println(6 ^ 3);   
        System.out.println(6 ^ 2);    

        System.out.println(~6);
        System.out.println(Integer.toBinaryString(-7));  
    }
    private static String getType(Object a) {
        return a.getClass().toString();
    }
}

/**
 * 位运算
 * & 表示与运算
 * | 表示或运算
 * ^ 表示异或运算
 * ~ 表示取反运算  计算机存储的所有二进制都是以补码的形式存储
 */