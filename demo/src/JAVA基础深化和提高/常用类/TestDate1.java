package JAVA基础深化和提高.常用类;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class TestDate1 {
    public static void main(String[] args) {
        long nowNum = System.currentTimeMillis();  //当前时间对应的毫秒数

        Date d = new Date();  //当前时刻的对象
        System.out.println(d.getTime()); //返回时间对应的毫秒数

        Date d2 = new Date(1000L*3600*24*365*150); //距离1970年150年
        System.out.println(d2);
    }

}
