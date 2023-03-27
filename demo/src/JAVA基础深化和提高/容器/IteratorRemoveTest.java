package JAVA基础深化和提高.容器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveTest {
    public static void main(String[] args) {
        //实例化ArrayList容器
        List<String> list = new ArrayList<>();

        //添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for(Iterator<String> it = list.iterator();it.hasNext();){
            it.remove();
            it.next();
        }
        for (String str:list
             ) {
            System.out.println(str);
        }
    }
}
