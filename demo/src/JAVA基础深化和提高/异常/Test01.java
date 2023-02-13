package JAVA基础深化和提高.异常;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("111");
        try{
            int a=1/0;
        }catch(Exception e){    //抛出异常对象
            e.printStackTrace();  //捕获异常
        }

        int b=0;
        if(b!=0){
            System.out.println(1/b);
        }

        String str=null;
        if (str != null) {
            System.out.println(str.charAt(0));
        }

        String str2="1234ab";
        Pattern p =Pattern.compile("^\\d+$");
        Matcher m=p.matcher(str2);
        if(m.matches()){
            System.out.println(Integer.parseInt(str2));
        }



        System.out.println("222");
    }
}
