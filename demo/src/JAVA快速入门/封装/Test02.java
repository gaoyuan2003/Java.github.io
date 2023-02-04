package JAVA快速入门.封装;

/**
 * 封装的使用
 */
class Person{
    private String name;
    private int age;
    public Person(){}
    public Person(String name,int age){
        this.name=name;
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>130||age<0){
            this.age=18;
        }else{
            this.age=age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name="+name+",age="+age+"]";
    }
}
public class Test02 {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setAge(-24);
        p1.setName("小红");
        System.out.println(p1);
        Person p2=new Person("小白",300);
        System.out.println(p2);
    }
}
