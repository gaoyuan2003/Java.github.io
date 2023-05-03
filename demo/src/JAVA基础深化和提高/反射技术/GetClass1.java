package JAVA基础深化和提高.反射技术;

public class GetClass1 {
    public static void main(String[] args) {
        //通过getClass()方法获取该类的Class对象
        Users users = new Users();
        Class clazz = users.getClass();
        System.out.println(clazz);
        System.out.println(clazz.getName());
    }
}
