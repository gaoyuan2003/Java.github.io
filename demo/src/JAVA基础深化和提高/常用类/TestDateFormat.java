package JAVA基础深化和提高.常用类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        //new出SimpleDateFormat对象
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd");
        //将时间对象转换成字符串
        String daytime = s1.format(new Date());
        System.out.println(daytime);  //当前时间s1格式
        System.out.println(s2.format(new Date())); //s2 格式
        System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date())); //转成hh:mm:ss
        //将符合指定格式的字符串转换成时间对象.字符串格式需要和指定格式一致
        String time = "2049-10-1";
        Date date = s2.parse(time);  //格式化Fri Oct 01 00:00:00 CST 2049
        System.out.println("date1:"+date);
        time = "2049-10-1 20:15:30";
        date = s1.parse(time);
        System.out.println("date2:"+date);
    }
}
