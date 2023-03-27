package JAVA基础深化和提高.容器;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        //实例化ArrayList容器
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        //对元素进行排序
        Collections.sort(list);
        for(String str:list){
            System.out.println(str);
        }
        System.out.println("---------");
        List<Users> list2 = new ArrayList<>();
        Users u = new Users("oldlu",18);
        Users u2 = new Users("sxt",22);
        Users u3 = new Users("admin",22);

        list2.add(u);
        list2.add(u2);
        list2.add(u3);
        Collections.sort(list2);

        for(Users users:list2){
            System.out.println(users);
        }
        System.out.println("----------");
        List<Student> list3 = new ArrayList<>();
        Student s = new Student("oldlu",18);
        Student s2 = new Student("sxt",20);
        Student s3 = new Student("admin",20);

        list3.add(s);
        list3.add(s2);
        list3.add(s3);
        Collections.sort(list3,new StudentComparator());
        for(Student student:list3){
            System.out.println(student);
        }

        List<String> list4 = new ArrayList<>();
        list4.add("1");
        list4.add("4");
        list4.add("9");
        list4.add("3");
        Collections.shuffle(list4);
        for(String str:list4){
            System.out.println(str);
        }
    }
}
