package JAVA基础深化和提高.反射技术;

import java.lang.reflect.Constructor;

public class GetConstructor2 {
    public static void main(String[] args) throws Exception{
        Class clazz = Users.class;
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        Object old = constructor.newInstance("old", 18);
        Users u = (Users) old;
        System.out.println(u);
    }
}
