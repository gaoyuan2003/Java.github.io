package JAVA快速入门.对象的转型;

public class TestCasting {
    public static void main(String[] args) {
        Object obj=new String("北京尚学堂");
        String str =(String)obj;
        System.out.println(str.charAt(0));
        System.out.println(obj==str);
    }
}
