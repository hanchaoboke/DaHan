package QuestionOne;

import java.util.*;

/**
 * @author HanChao
 * @date 2020-03-23 22:04
 * 描述信息：
 *
 * 定义一个泛型Dao<T>，在其中顶一个Map成员变量,Map的键为String类型，值为T类型
 * 分别创建以下方法:
 * public void save(String id,T entity) 保存T乐行的对象到map集合中
 * public T get(String id) 从map中获取id对应的对象
 * public  void update(String id,T entity) 替换map中的key为id的内容
 * public List<T> list()  返回map中所有的 T 对象
 * public  void delete(String id) 删除指定对象
 */
public class Dao<T> {

    Map<String,T> map;

    // 保存T乐行的对象到map集合中
    public void save(String id, T entity){
        map.put(id,entity);
    }

    // 从map中获取id对应的对象
    public T get(String id){
        return map.get(id);
    }

    // 替换map中的key为id的内容
    public  void update(String id, T entity){
        map.put(id, entity);
    }

    // 返回map中所有的 T 对象
    public List<T> list(){
        List<T>  list= new LinkedList<>();
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            list.add(map.get(iterator.next()));
        }
        return list;
    }

    // 删除指定对象
    public void delete(String id){
        map.remove(id);
    }

}
