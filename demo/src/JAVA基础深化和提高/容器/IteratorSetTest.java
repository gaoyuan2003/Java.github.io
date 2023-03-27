package JAVA基础深化和提高.容器;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorSetTest {
    public static void main(String[] args) {
        //实例化HashSet容器
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        //while循环
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        //for循环
        for(Iterator<String> iterator1 = set.iterator();iterator1.hasNext();){
            String next = iterator1.next();
            System.out.println(next);
        }


    }
}
