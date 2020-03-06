/**
 * byte b = 10;
b++;          
b = b + 1;   
求出b的值？
 */
/**
 * basics3
 */
public class basics3 {

    public static void main(String[] args) {
        byte b = 10;
        b++;
        //b = b + 1;
        System.out.println(b);
    }

    private static String getType(Object a) {
        return a.getClass().toString();
    }
    
}

/**
 * Type mismatch: cannot convert from int to byteJava(16777233)
 * 这样的错误信息
 * 类型不匹配，无法从int转换成为byte
 * 为了探究原因，写了一个查看目标数据类型的函数getType，查看数据类型
 * 初始化b时为byte型
 * b++为语句执行过程中，隐式赋值，类型不变，执行成功
 * 当执行b = b + 1时，1 默认为int型，b + 1 执行时，b 自动向上转型成int，b + 1 为int，但是b是byte型，数据类型不能向下转型，int型不能转为byte型，所以报错
 */