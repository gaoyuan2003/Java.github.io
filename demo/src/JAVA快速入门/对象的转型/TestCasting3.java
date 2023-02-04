package JAVA快速入门.对象的转型;

/**
 * 向下转型中使用instanceof
 */
public class TestCasting3 {
    public static void main(String[] args) {
        Object obj=new String("北京尚学堂");
        if(obj instanceof String){
            String str=(String)obj;
            System.out.println(str.charAt(0));
        }else if(obj instanceof StringBuffer){
            StringBuffer str=(StringBuffer)obj;
            System.out.println(str.charAt(0));
        }
    }
}
