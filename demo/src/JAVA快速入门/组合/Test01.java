package 组合;

public class Test01 {
    public static void main(String[] args) {
        Student s=new Student("小张",167,"Java");
        s.person.rest();
        s.study();
    }
}

class Person{
    String name;
    int height;
    public void rest(){
        System.out.println("休息一下");
    }
}
class Student{
    Person person=new Person();
    String major;
    public Student(String name,int height,String major) {
        this.person.name = name;
        this.person.height = height;
        this.person.rest();
        this.major = major;
    }
        public void study(){
            System.out.println("学习");
            person.rest();
            System.out.println(this.person.name);

    }
}