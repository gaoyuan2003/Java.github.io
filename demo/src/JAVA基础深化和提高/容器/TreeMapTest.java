package JAVA基础深化和提高.容器;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        //实例化TreeMap容器
        Map<Users,String> map = new TreeMap<>();

        //实例化Users
        Users u = new Users("oldlu",18);
        Users u2 = new Users("sxt",22);
        Users u3 = new Users("admin",22);

        //添加元素
        map.put(u,u.getUsername());
        map.put(u2,u2.getUsername());
        map.put(u3,u3.getUsername());

        //获取TreeMap容器中的key
        Set<Users> keySet = map.keySet();
        for(Users key:keySet){
            System.out.println(key+"-----"+map.get(key));
        }
    }
}
