package JAVA基础深化和提高.反射技术;

import java.lang.reflect.Field;

public class GetField {
    public static void main(String[] args) {
        Class clazz = Users.class;
        Field[] arr = clazz.getDeclaredFields();
        for (Field field:arr
             ) {
            System.out.println(field);
            System.out.println(field.getName());
        }
    }
}
