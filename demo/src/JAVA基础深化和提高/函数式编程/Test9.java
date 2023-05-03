package JAVA基础深化和提高.函数式编程;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("old");
        list.add("liu");
        list.add("wang");
        list.add("lid");
        list.stream().limit(2).collect(Collectors.toList()).forEach(System.out::println);
    }
}
