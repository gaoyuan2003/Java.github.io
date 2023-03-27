package JAVA基础深化和提高.容器;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //实例化TreeSet容器
        Set<String> set = new TreeSet<>();

        //添加元素
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        //获取元素
        for(String str:set){
            System.out.println(str);
        }
    }
}
