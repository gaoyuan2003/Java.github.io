package JAVA基础深化和提高.反射技术;

public class GetClassInfo {
    public static void main(String[] args) {
        Class clazz = Users.class;
        System.out.println("类名"+clazz.getName());
        System.out.println("包名"+clazz.getPackageName());
        System.out.println("超类"+clazz.getSuperclass().getName());
    }
}
