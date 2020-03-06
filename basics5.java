/**
 * int x = 5, y = 6, z;
   A.z = ++x + y++;
  B.z = ++x + x++;
   C.x = ++x + x++；
  D.z = x > y ? ++x : y++; 
输出ABCD题目中x、y、z的值
 */
/**
 * basics5
 */
public class basics5 {

    public static void main(String[] args) {
        int x = 5, y = 6, z;
        // // question A
        // z = ++x + y++;
        // System.out.println(z);
        // // question B
        // z = ++x + x++;
        // System.out.println(z);
        // // question C
        // x = ++x + x++;
        // System.out.println(x);
        // question D
        z = x > y ? ++x : y++;
        System.out.println(z);
    }
}
/**
 * question A’answer is 12
 * x先自增再运算，y先运算再自增
 * question B’answer is 12
 * x先自增再运算，x先运算再自增
 * question C’answer is 12
 * x先自增再运算，x先运算再自增
 * question D’answer is 6
 * 三目运算符，x > y == true,执行++x,否则执行y++
 */