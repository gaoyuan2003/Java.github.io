package JAVA基础深化和提高.常用类;

public class TestInteger {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(10);
        int a = i.intValue();
        double d = i.doubleValue();
        Integer m = Integer.valueOf("456");
        System.out.println(Integer.MAX_VALUE);
        //测试自动装箱和拆箱
        Integer s =100;  //Integer s = Integer.valueOf(100);
        int x = s;// int x = s.intValue();
/**
        Integer z = null;
        int z2 = z;  报错 NullPointerException
 */
        //测试缓存问题
        //自动装箱时，[-128,127]之间的数有缓存
        Integer x1 = 100;
        Integer x2 = 100;
        Integer x3 = 1000;
        Integer x4 = 1000;
        System.out.println(x1==x2);
        System.out.println(x3==x4);
        System.out.println(x1.equals(x2));
        System.out.println(x3.equals(x4));
    }
}
