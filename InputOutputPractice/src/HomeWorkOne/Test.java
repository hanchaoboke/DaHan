package HomeWorkOne;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author HanChao
 * @date 2020-03-24 20:40
 * 描述信息：返回后缀名.java的文件
 */
public class Test {
    public static void main(String[] args) {
        File file = new File("/Users/edz/DaHan");
        String[] str = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".java")) {
                    return true;
                }
                return false;
            }
        });

        for (String s: str) {
            System.out.println(""+s);
        }

    }
}
