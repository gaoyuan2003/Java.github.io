package 接口;


public class Test02 {
    public static void main(String[] args) {
        A a=new Test_A();
        a.moren();
        a.moren2();
    }
}
interface A{
    void moren2();
    default void moren(){
        System.out.println("我是接口A中的默认方法");
    }
}
class Test_A implements A{
    @Override
    public void moren2() {
        System.out.println("抽象方法");
    }
}