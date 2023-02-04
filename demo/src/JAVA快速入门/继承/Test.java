package 继承;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("小宝", 176, "java");
        s.rest();
        s.study();
    }
}
    class Person{
        String name;
        int height;
        public void rest(){
            System.out.println("休息一会！");
        }
    }
    class Student extends Person{

        String major;
        public void study(){
            System.out.println("学习java");
        }

        public Student(String name,int height,String major){
            this.name=name;
            this.height=height;
            this.major=major;
        }
    }




