package 接口;

public class Test03 {
    public static void main(String[] args) {
        B.staticMethod();
        Test_B.staticMethod();
    }
}
interface B{
    public static void staticMethod(){
        System.out.println("B.staticMethod");
    }
}
class Test_B implements B{
    public static void staticMethod(){
        System.out.println("Test_B.staticMethod");
    }
}