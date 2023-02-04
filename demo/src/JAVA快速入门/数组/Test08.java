package 数组;

import java.util.Arrays;

public class Test08 {
    public static void main(String[] args) {
        Object[] a1={1001,"小宝",18,"僵尸",2-14};
        Object[] a2={1002,"小王",19,"讲授",8-14};
        Object[] a3={1003,"小张",28,"瓦匠",2-8};
        Object[][] emps=new Object[3][];
        emps[0]=a1;
        emps[1]=a2;
        emps[2]=a3;
        System.out.println(Arrays.toString(emps[0]));
        System.out.println(Arrays.toString(emps[1]));
        System.out.println(Arrays.toString(emps[2]));
    }
}
