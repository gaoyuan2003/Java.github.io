package 继承;

public class TestInstanceof {
    public static void main(String[] args) {
        Student s1=new Student("小王",129,"c++");
        System.out.println(s1 instanceof Person);
        System.out.println(s1 instanceof Student);
    }
}
