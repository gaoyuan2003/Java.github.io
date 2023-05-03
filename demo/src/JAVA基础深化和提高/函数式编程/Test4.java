package JAVA基础深化和提高.函数式编程;

public class Test4 {
    public static void main(String[] args) {
        final int num = 10;
        NoReturnNoParam noReturnNoParam = () -> System.out.println(num);
        noReturnNoParam.method();
    }
}
