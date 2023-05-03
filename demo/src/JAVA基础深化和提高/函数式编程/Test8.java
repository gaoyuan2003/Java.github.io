package JAVA基础深化和提高.函数式编程;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("old");
        list.add("liu");
        list.add("wang");
        list.add("lid");
        list.stream().filter(ele->ele.startsWith("o")).filter(ele->ele.endsWith("d")).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("---------");
        Predicate<String> predicate = ele->ele.startsWith("o");
        Predicate<String> predicate1 = ele->ele.endsWith("d");
        list.stream().filter(predicate.or(predicate1)).collect(Collectors.toList()).forEach(System.out::println);
    }
}
