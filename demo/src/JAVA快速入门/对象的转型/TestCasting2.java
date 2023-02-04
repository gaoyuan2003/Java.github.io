package JAVA快速入门.对象的转型;

/**
 * 类型转换异常
 */
public class TestCasting2 {
    public static void main(String[] args) {
        Object obj=new String("北京尚学堂");
        StringBuffer str =(StringBuffer)obj;
        System.out.println(str.charAt(0));
    }
}
