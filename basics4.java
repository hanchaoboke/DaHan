/**
 * public static void main(String[] args) {
          int i = 0;
          test(i);
          i = ++i;
         System.out.println("----" + i);
         i = i++;
         System.out.println("****" + i);         
     }
     
     public static void test(int i){
         i++;
         System.out.println("++++" + i);
     }
 */
/**
 * basics4
 */
public class basics4 {

    public static void main(String[] args) {
        int i = 0;
        test(i);
        i = ++i;
        System.out.println("----" + i);
        i = i++;
        System.out.println("****" + i);         
    }
     
    public static void test(int i){
        i++;
        System.out.println("++++" + i);
    }
}

/**
 * 程序是从main函数楷书顺序执行
 * 先执行test函数，输出++++1
 * 然后输出----1，原因在于变量的作用域不同，函数里的变量仅仅在函数内有效，所以没有改变值
 * 前面三道题练习过++i 和 i++的区别，所有三次输出，i都是1
 */