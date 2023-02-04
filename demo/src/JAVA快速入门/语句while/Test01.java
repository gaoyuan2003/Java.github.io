package 语句while;

/**
 * while(表达式){
 *     循环体;
 * }
 */

public class Test01 {
    public static void main(String[] args) {
        /*求1~100之间的累加和*/
        int i=1;
        int sum=0;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println("结果为："+sum);
    }
}
