package JAVA基础深化和提高.容器;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        //实例化HashSet容器
        Set<String> set = new HashSet<>();

        //添加元素
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("78");
        set.add("76");
        //set.add("4"); 提示重复元素

        //删除元素
        set.remove("78");

        //遍历
        for(String str:set){
            System.out.println(str);
        }

        int size = set.size();
        System.out.println(size);

    }

}
