package JAVA基础深化和提高.函数式编程;

public class Test2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        ReturnOneParam returnOneParam = test2::addTwo;
        int method = returnOneParam.method(10);
        System.out.println(method);
    }
    public static int doubleNum(int a){
        return 2*a;
    }
    public int addTwo(int a){
        return a+2;
    }
}
