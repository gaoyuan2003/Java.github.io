package 重写toString方法;

import 继承.Test;

public class Test01 {
    public static void main(String[] args) {
        Person p=new Person();
        p.age=20;
        p.name="李东";
        System.out.println("info:"+p);
        Test t=new Test();
        System.out.println(t);
    }
}
class Person{
    String name;
    int age;
    public String toString(){
        return name+",年龄："+age;
    }
}

