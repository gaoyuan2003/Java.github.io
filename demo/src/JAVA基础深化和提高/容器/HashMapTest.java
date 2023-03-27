package JAVA基础深化和提高.容器;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        //实例化HashMap容器
        Map<String,String> map = new HashMap<>();

        //添加元素
        String put1 = map.put("a", "A");
        String put2 = map.put("b", "B");
        String put3 = map.put("c", "C");
        String put4 = map.put("a", "AA");
        System.out.println(put1+"\t"+put2+"\t"+put3+"\t"+put4);

        //获取容器中元素的个数
        int size = map.size();
        System.out.println(size);

        //获取容器中的元素
        //方式一
        String v = map.get("a");
        System.out.println(v);

        //方式二
        Set<String> keys = map.keySet();
        for (String key:keys
             ) {
            String value = map.get(key);
            System.out.println(key+"-------"+value);
        }

        //方式三
        //Map.Entry就是一个键值对
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //遍历Set获取每一个键值对
        for (Map.Entry<String, String> entry:entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-----"+value);
        }

        //Map容器的并集操作
        Map<String,String> map2 = new HashMap<>();
        map2.put("f","F");
        map2.put("c","CC");
        map.putAll(map2);
        Set<String> keys2 = map.keySet();
        for (String key:keys2
        ) {
            String value = map.get(key);
            System.out.println(key+"-------"+value);
        }

        //删除元素
        String a = map.remove("a");
        System.out.println(a);

        //判断key是否存在
        boolean b = map.containsKey("b");
        System.out.println(b);
        
        //判断value是否存在
        boolean cc = map.containsValue("CC");
        System.out.println(cc);
    }
}
