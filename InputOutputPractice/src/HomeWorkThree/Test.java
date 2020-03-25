package HomeWorkThree;

import java.io.File;
import java.io.FilenameFilter;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author HanChao
 * @date 2020-03-24 23:13
 * 描述信息：
 * 读取目录和子目录下多有.txt后缀名文件
 */
public class Test {
    static String[] str = null;
    static File file = new File("/Users/edz/DaHan");
    public static void main(String[] args) {

        getAllFile(file);
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]+"\n");
        }
    }


    public static void getAllFile(File file){
        File[] file1 = file.listFiles();
        for (int i = 0; i < file1.length; i++){
            if (file1[i].isDirectory()){
                // 递归进入目录
                getAllFile(file1[i]);
            }else{
                getJavaFile(file1[i]);
            }
        }

    }

    public static void getJavaFile(File file){
        str = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".txt")) {
                    return true;
                }
                return false;
            }
        });
    }
}

