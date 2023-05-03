package JAVA基础深化和提高.反射技术;

public class GetClass3 {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("JAVA基础深化和提高.反射技术.Users");
            System.out.println(aClass);
            System.out.println(aClass.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
