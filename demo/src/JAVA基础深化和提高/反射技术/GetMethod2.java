package JAVA基础深化和提高.反射技术;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class GetMethod2 {
    public static void main(String[] args) throws Exception{
        Class clazz = Users.class;
        Method suiBia = clazz.getDeclaredMethod("SuiBia");
        Constructor constructor = clazz.getConstructor(null);
        Users u = (Users) constructor.newInstance();
        suiBia.invoke(u);
    }
}
