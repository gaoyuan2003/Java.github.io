package JAVA基础深化和提高.函数式编程;

import java.util.ArrayList;
import java.util.List;



public class Test5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.forEach((a)-> System.out.println(a+" Lambda"));
        //list.forEach(System.out::println);
    }
}
