package 语句if;

import javax.crypto.spec.PSource;

/**
 * if(布尔表达式）{
 *     语句块
 * }
 */

public class Test01 {
    public static void main(String[] args) {
        int i = (int)(6 *Math.random())+1;  //Math.random()获取随机数字
        int j=(int)(6 *Math.random())+1;
        int k=(int)(6 *Math.random())+1;
        int count = i + j + k;
        if(count > 15){
            System.out.println("今天手气不错！");
        }else if(count >= 10 && count <= 15){
            System.out.println("今天手气一般！");
        }else {
            System.out.println("今已按手气不好");
        }
        System.out.println("first: "+i);
        System.out.println("second: "+j);
        System.out.println("third: "+k);
        System.out.println("得了"+count+"分");
    }
}
