package JAVA基础深化和提高.容器;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
    public static void main(String[] args) {
        //并集操作：将另一个容器中的元素添加到当前容器中
        List<String> a = new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");

        List<String> b = new ArrayList<>();
        b.add("5");
        b.add("6");
        b.add("7");
        b.add("8");

        //a并b
        a.addAll(b);
        for(String str:a){
            System.out.println(str);
        }

        System.out.println("-------------------");
        //b并a,经过上一次并集操作，此时a为12345678,b为5678,输出567812345678
        b.addAll(a);
        for (String str1:b){
            System.out.println(str1);
        }

        //交集操作：保留相同的，删除不同的
        List<String> a1 = new ArrayList<>();
        a1.add("1");
        a1.add("2");
        a1.add("3");
        a1.add("4");

        List<String> b1 = new ArrayList<>();
        b1.add("3");
        b1.add("4");
        b1.add("5");
        b1.add("6");

        System.out.println("--------------");

        //交集操作
        a1.retainAll(b1);
        for(String str1:a1){
            System.out.println(str1);
        }

        System.out.println("---------------");

        //差集操作，保留不同的，删除相同的
        List<String> a2 = new ArrayList<>();
        a2.add("1");
        a2.add("2");
        a2.add("3");
        a2.add("4");

        List<String> b2 = new ArrayList<>();
        b2.add("3");
        b2.add("4");
        b2.add("5");
        b2.add("6");

        a2.removeAll(b2);
        for(String str1:a2){
            System.out.println(str1);
        }

    }
}
