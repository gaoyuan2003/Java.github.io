package JAVA基础深化和提高.常用类;

import java.util.Arrays;

//自定义包装类
public class MyInteger {
    private final int value;

    private static MyInteger[] cache;
    private static final int LOW = -128;
    private static final int HIGH = 127;
    static {
        cache = new MyInteger[HIGH-LOW+1];
        for(int i=LOW;i<=HIGH;i++){
            cache[i-LOW] = new MyInteger(i);
        }
        //System.out.println(Arrays.toString(cache));
    }

    @Override
    public String toString() {
        return value+"";
    }

    public MyInteger(int value){
        this.value = value;
    }

    public static MyInteger valueOf(int value){
        if(value>=LOW&&value<=HIGH){
            return cache[value-LOW];
        }
        return new MyInteger(value);
    }

    public int intValue(){
        return value;
    }

    public static void main(String[] args) {
        MyInteger a = new MyInteger(10);
        MyInteger b = MyInteger.valueOf(100);
        MyInteger b2 = MyInteger.valueOf(100);
        MyInteger b3 = MyInteger.valueOf(1000);
        MyInteger b4 = MyInteger.valueOf(1000);

        System.out.println(b==b2);
        System.out.println(b3==b4);

        int c = b.intValue();
    }
}
