package 接口;

public class Test04 {
    public static void main(String[] args) {
        C c=new Test_C();
        c.moren3();
    }
}
interface C{
    public static void staticMethod(){
        System.out.println("C.staticMethod");
    }
    public default void moren3(){
        staticMethod();
        System.out.println("C.moren3");
    }
}
class Test_C implements C{
    public static void staticMethod(){
        System.out.println("Test_A.staticMethod");
    }
}