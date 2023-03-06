package JAVA基础深化和提高.常用类;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        //随机生成[0,1)之间的double类型的数据
        System.out.println(rand.nextDouble());
        //随机生成int允许范围内整型数据
        System.out.println(rand.nextInt());
        //float类型
        System.out.println(rand.nextFloat());
        //boolean
        System.out.println(rand.nextBoolean());
        //[0,10)之间整数
        System.out.println(rand.nextInt(10));
        //[20,30)之间整数
        System.out.println(20 + rand.nextInt(10));
    }
}
