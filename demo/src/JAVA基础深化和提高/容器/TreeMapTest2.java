package JAVA基础深化和提高.容器;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest2 {
    public static void main(String[] args) {
        //实例化TreeMap容器
        Map<Student,String> map = new TreeMap<>(new StudentComparator());

        //Student对象
        Student s = new Student("oldlu",18);
        Student s1 = new Student("sxt",22);
        Student s2 = new Student("admin",22);

        map.put(s,s.getName());
        map.put(s1,s1.getName());
        map.put(s2,s2.getName());

        Set<Student> keySet = map.keySet();
        for(Student key:keySet){
            System.out.println(key+"----"+map.get(key));
        }
    }
}
