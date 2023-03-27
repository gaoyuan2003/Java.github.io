package JAVA基础深化和提高.容器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorListTest {
    public static void main(String[] args) {
        //实例化ArrayList容器
        List<String> list = new ArrayList<>();

        //添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        //方式一：在迭代器中，通过while循环获取元素
        //获取迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println(value);
        }

        System.out.println("--------");

        //方式二：在迭代器中，通过for循环获取元素
        for(Iterator<String> it2 = list.iterator();it2.hasNext();){
            String next = it2.next();
            System.out.println(next);
        }
    }
}
