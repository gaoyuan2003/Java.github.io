package JAVA基础深化和提高.容器;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorMapTest {
    public static void main(String[] args) {
        //实例化HasMap容器
        Map<String,String> map = new HashMap<>();
        //添加元素
        map.put("a","A");
        map.put("b","B");
        map.put("c","C");
        map.put("d","D");

        //方式一：通过keySet方法获取所有的key
        Set<String> keySet = map.keySet();
        //获取迭代器
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key+"-----"+map.get(key));
        }

        //方式二：通过Map.entry方法获取所有的Map.Entry对象
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for(Iterator<Map.Entry<String, String>> iterator1 = entrySet.iterator();iterator1.hasNext();){
            Map.Entry<String, String> entry = iterator1.next();
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }
    }
}
