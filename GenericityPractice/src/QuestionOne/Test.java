package QuestionOne;

import java.util.HashMap;
import java.util.Map;

/**
 * @author HanChao
 * @date 2020-03-23 22:46
 * 描述信息：
 * 定义一个测试类 分别对上述方法进行测试
 */
public class Test {

    public static void main(String[] args) {
        Dao<User> userDao = new Dao<>();
        userDao.map = new HashMap<String, User>();
        Test test = new Test();

        // 保存T乐行的对象到map集合中
        userDao.save("a",new User(1,"张一"));
        userDao.save("b",new User(2,"张二"));
        userDao.save("c",new User(3,"张三"));
        userDao.save("d",new User(4,"张四"));
        userDao.save("e",new User(5,"张五"));
        for (User u : userDao.list()){
            System.out.println(u.toString());
        }
        System.out.println("===========================");

        // 从map中获取id对应的对象
        System.out.println(userDao.get("a"));
        System.out.println(userDao.get("c"));

        // 替换map中的key为id的内容
        userDao.update("b",new User(99,"小明"));
        for (User u : userDao.list()){
            System.out.println(u.toString());
        }
        System.out.println("===========================");

        // 删除指定对象
        userDao.delete("a");
        for (User u : userDao.list()){
            System.out.println(u.toString());
        }

    }



}
