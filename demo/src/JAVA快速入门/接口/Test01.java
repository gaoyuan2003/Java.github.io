package 接口;

/**
 * [访问修饰符] interface 接口名 [extends 父接口1,父接口2,...]{
 *     常量定义
 *     方法定义
 * }
 */

public class Test01 {
    public static void main(String[] args) {
        Volant volant=new Angel();
        volant.fly();
        System.out.println(Volant.FLY_HIGHT);
        Honest honest=new GoodMan();
        honest.helpOther();
    }
}
/**飞行接口*/
interface Volant{
    int FLY_HIGHT=100;//总是：public static final类型的
    void fly();//总是：public abstract void fly();
}
/**善良接口*/
interface Honest{
    void helpOther();
}
/**Angel类实现飞行接口和善良接口*/
class Angel implements Volant,Honest{
    @Override
    public void fly() {
        System.out.println("我是天使,我飞起来了");
    }

    @Override
    public void helpOther() {
        System.out.println("扶老奶奶过马路");
    }
}
class GoodMan implements Honest{
    @Override
    public void helpOther() {
        System.out.println("扶老奶奶过马路");
    }
}
class BirdMan implements Volant{
    @Override
    public void fly() {
        System.out.println("我是鸟人,正在飞！");
    }
}