package JAVA基础深化和提高.函数式编程;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("d");
        list.add("a");
        list.add("c");
        list.sort(String::compareTo);
        list.forEach(System.out::println);
    }
}
