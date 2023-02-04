package 抽象方法和抽象类;

//抽象类
abstract class Animal{
    abstract public void shout();//抽象方法
}
class Dog extends Animal{
    //子类必须实现父类的抽象方法，否则编译错误

    @Override
    public void shout() {
        System.out.println("汪汪汪...");
    }
    public void seeDoor(){
        System.out.println("看门中...");
    }
}
//测试抽象类
public class TestAbstract {
    public static void main(String[] args) {
        Dog a=new Dog();
        a.shout();
        a.seeDoor();
    }
}
