package JAVA基础深化和提高.容器;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {
    public static void main(String[] args) {
        //实例化HashSet容器
        Set<Users> set = new HashSet<>();

        //实例化Users
        Users u1 = new Users("name1",18);
        Users u2 = new Users("name1",18);
        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u1.equals(u2));

        //添加到容器中
        set.add(u1);
        set.add(u2);

        //遍历容器
        for(Users u:set){
            System.out.println(u);
        }
    }
}
