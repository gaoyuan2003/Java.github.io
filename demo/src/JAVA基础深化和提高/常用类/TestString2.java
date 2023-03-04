package JAVA基础深化和提高.常用类;

public class TestString2 {
    public static void main(String[] args) {
        String str1 = "hello"+" java";  //相当于str = "hello java"
        //编译器做了优化，直接在编译阶段进行拼接
        String str2 = "hello java";
        System.out.println(str1==str2);

        String str3 = "hello";
        String str4 = " java";
        String str5 = str3 + str4;
        System.out.println(str5==str2);
    }
}
