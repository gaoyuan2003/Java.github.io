package JAVA基础深化和提高.函数式编程;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("d");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("----------");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
