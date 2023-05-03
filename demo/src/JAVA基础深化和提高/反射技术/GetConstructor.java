package JAVA基础深化和提高.反射技术;

import java.lang.reflect.Constructor;

public class GetConstructor {
    public static void main(String[] args) {
        Class clazz = Users.class;
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c:declaredConstructors
             ) {
            System.out.println(c);
        }
    }
}
