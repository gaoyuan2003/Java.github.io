package JAVA基础深化和提高.反射技术;

import java.lang.reflect.Method;

public class GetMethod {
    public static void main(String[] args) throws Exception{
        Class clazz = Users.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method:methods
             ) {
            System.out.println(method.getName());
        }
        Method suiBia = clazz.getDeclaredMethod("SuiBia");
        System.out.println(suiBia.getName());
    }
}
