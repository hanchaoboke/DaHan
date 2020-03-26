package com.banyuan.club.csv;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.*;
import java.nio.charset.Charset;
import java.util.LinkedList;

/**
 * @author HanChao
 * @date 2020-03-25 16:50
 * 描述信息：
 *
 * 1.判断有没有test.csv文件，没有就创建一个，向其中插入3条数组并在控制台输出
 * 2.向test.csv文件中追加三条数据，并在控制台输出
 */
public class Demo1 {
    static LinkedList<String[]> linkedList = new LinkedList<>();
    static File file = new File("test.csv");


    public static void main(String[] args) throws IOException {

        // 1.判断有没有test.csv文件，没有就创建一个，向其中插入3条数组并在控制台输出

        if (!file.exists()){
            file.createNewFile();
        }

        linkedList.add(new String[]{"1","张三","27"});
        linkedList.add(new String[]{"2","张四","29"});
        linkedList.add(new String[]{"3","张五","21"});

        // 写入
        csvAdd(file,linkedList);
        linkedList.clear();
        // 读取
        getAll(file);

        System.out.println("-----------------");

        // 2.2.向test.csv文件中追加三条数据，并在控制台输出

        linkedList.add(new String[]{"4","啦啦","16"});
        linkedList.add(new String[]{"5","帆帆","18"});
        linkedList.add(new String[]{"6","憨憨","19"});

        // 追加
        csvAddTo(file,linkedList);
        linkedList.clear();
        // 读取
        getAll(file);
    }

    // 写入
    public static void csvAdd(File file, LinkedList linkedList) throws IOException{
        CsvWriter csvWriter = new CsvWriter(file.toString(),',',Charset.forName("utf-8"));
        for (int i = 0; i < linkedList.size(); i++) {
            csvWriter.writeRecord((String[]) linkedList.get(i));
        }
        csvWriter.close();
    }

    // 追加
    public static void csvAddTo(File file,LinkedList linkedList) throws IOException{
        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(file.getName(),true),"utf-8"));
        CsvWriter csvWriter = new CsvWriter(bufferedWriter,',');
        for (int i = 0; i < linkedList.size(); i++){
            csvWriter.writeRecord((String[]) linkedList.get(i));
        }
        bufferedWriter.close();
        csvWriter.close();
    }

    // 读取
    public static void getAll(File file) throws IOException {
        CsvReader csvReader = new CsvReader(file.getName(),',',Charset.forName("utf-8"));

        while (csvReader.readRecord()){
            System.out.println(csvReader.getRawRecord());
        }
        csvReader.close();
    }
}
