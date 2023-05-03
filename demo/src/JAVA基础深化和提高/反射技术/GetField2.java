package JAVA基础深化和提高.反射技术;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class GetField2 {
    public static void main(String[] args) throws Exception{
        Class clazz = Users.class;
        Constructor constructor = clazz.getConstructor(String.class,int.class);
        Users u = (Users) constructor.newInstance("old",18);
        //System.out.println(u.age);
        Field age = clazz.getField("age");
        age.set(u,22);
        System.out.println(age.get(u));
    }
}
