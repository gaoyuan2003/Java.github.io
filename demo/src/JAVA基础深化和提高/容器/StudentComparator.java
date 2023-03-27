package JAVA基础深化和提高.容器;

import java.util.Comparator;

/**
 * 定义比较器
 */

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()>o2.getAge()){
            return 1;
        }
        if(o1.getAge()==o2.getAge()){
            return o1.getName().compareTo(o2.getName());
        }
        return -1;
    }
}
