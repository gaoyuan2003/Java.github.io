package JAVA基础深化和提高.容器;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {
    public static void main(String[] args) {
        //实例化TreeSet容器
        Set<Users> set = new TreeSet<>();

        //实例化Users
        Users u1 = new Users("oldlu",18);
        Users u2 = new Users("admin",12);
        Users u3 = new Users("sxt",22);

        //添加到容器中
        set.add(u1);
        set.add(u2);
        set.add(u3);

        for (Users u:set
             ) {
            System.out.println(u);
        }
    }
}
