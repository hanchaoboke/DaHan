package HomeWorkTwo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HanChao
 * @date 2020-03-24 21:28
 * 描述信息：
 */
public class Test {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("张三",23));
        list.add(new Person("张四",26));
        list.add(new Person("张五",29));


        File file = new File("read.md");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        FileOutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(file,true);
            for (Person p : list) {
                outputStream.write(p.toString().getBytes());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        InputStream inputStream =null;
        try {
            inputStream = new FileInputStream(file);
            byte[] bt = new byte[(int)file.length()];
            inputStream.read(bt);
            String str = new String(bt,0,bt.length);
            System.out.println(""+str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
