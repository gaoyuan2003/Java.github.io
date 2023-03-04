package JAVA基础深化和提高.常用类;

public class TestString1 {
    public static void main(String[] args) {
        String s1 = new String("abcdef");
        String s2 = s1.substring(2,4);
        System.out.println(s2); //打印cd
        System.out.println(Integer.toHexString(s1.hashCode()));
        System.out.println(Integer.toHexString(s2.hashCode()));
        //s1和s2不是同一个对象，s2需要重新创建一个对象
    }
}
