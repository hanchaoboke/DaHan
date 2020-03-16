import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * @author HanChao
 * @date 2020-03-16 19:24
 * 描述信息：
 */
public class HomrWorkOne {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // 1.将 byte [] by={65,67,68,97,98,101}  转换成字符串输出
        byte[] by = {65,67,68,97,98,101};
        String str = new String(by);
        System.out.println(str);

        // 将上诉字节数组  从指定的位置开始到结束转换成字符串输出
        System.out.println(str.substring(2,4));
        System.out.println("-----------");

        // 2.同样的自定义一个字符数组用字符串的方式输出
        char[] arr = {'a','b','c','d','e'};
        String arr1 = String.valueOf(arr);
        System.out.println(arr1);
        System.out.println("------------");

        // 3."abcdw" "ABCDw" 比较两个字符串是否相等  忽略大小写
        if("abcdw".equalsIgnoreCase("ABCDw")){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
        System.out.println("--------------");

        // 4."我是你的谁,我是你的剑" 判断是否包含 "剑"
        if("我是你的谁,我是你的剑".indexOf("剑") == -1){
            System.out.println("不包含");
        }else{
            System.out.println("包含");
        }
        System.out.println("--------------");

        // 5.第四题字符串判断是否以"我开头",判断是否以"剑"结尾
        if ("我是你的谁,我是你的剑".startsWith("我") & "我是你的谁,我是你的剑".endsWith("剑")){
            System.out.println("正确");
        }else{
            System.out.println("错误");
        }
        System.out.println("---------------");

        // 6.String   str=""和 String  str2=null; 判断他们是否为空
        str = "";
        String str2 = null;
        if (str == null){
            System.out.println("str为空");
        }
        if (str2 == null){
            System.out.println("str2为空");
        }
        System.out.println("----------------");

        // 7.找到此字符串"我是你的小宝贝"的 "我" 进行输出
        if ("我是你的小宝贝".indexOf("我") != -1){
            System.out.println("我");
        }else{
            System.out.println("不存在");
        }
        System.out.println("---------------");

        // 8.找出 "我是你的谁,我是你的剑" 里面的 "你" 第一次出现的位置
        System.out.println("我是你的谁,我是你的剑".indexOf("你"));
        System.out.println("-------------------");

        // 9.找到上面 8 题的 最后一次出现 "你" 的位置,然后再从 第4个位置开始找  第一次出现的"你"
        System.out.println("我是你的谁,我是你的剑".lastIndexOf("你"));
        System.out.println("我是你的谁,我是你的剑".indexOf("你",4));
        System.out.println("--------------------");

        // 10."我是你的谁,我是你的剑"  从指定位置开始截取长度;从指定位置开始截取到指定位置结束长度的字符串
        System.out.println("我是你的谁,我是你的剑".substring(3));
        System.out.println("我是你的谁,我是你的剑".substring(2,8));
        System.out.println("---------------------");

        // 11." 我是你的谁,我是你的剑 " 去除字符串左右空格
        System.out.println(" 我是你的谁,我是你的剑 ".trim());
        System.out.println("----------------------");

        // 12. "我是你的谁,我是你的剑"  替代字符串里面的"谁",改为"被子"
        System.out.println("我是你的谁,我是你的剑".replace("谁","被子"));
        System.out.println("---------------------");

        // 13."我是你的谁,我是你的剑"  替换该字符串的所有的 "你" 改为 "哈"
        System.out.println("我是你的谁,我是你的剑".replaceAll("你","哈"));
        System.out.println("----------------------");

        // 14. 比较 "avabc" 和 "avab" 字符串
        System.out.println("avabc" == "avab");
        System.out.println("avabc".equals("avab"));
        System.out.println("avabc".equalsIgnoreCase("avab"));
        System.out.println("-----------------------");

        // 15. 将字符数组转换成 字符串输出
        char[] ch = {'a','b','c','d','e'};
        String ch1 = String.valueOf(ch);
        System.out.println(ch1);
        System.out.println("------------");

        // 16. 将字节数组以指定的编码格式转换成字符串，再转换后的字符串以指定的编码格式转换成字节数组
        byte[] bytes = {2,23,56,43,23,5};
        String strings = new String(bytes,"UTF-8");
        System.out.println(strings);
        strings.getBytes("UTF-8");



    }
}
