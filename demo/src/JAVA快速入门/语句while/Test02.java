package 语句while;

/**
 *  do{
 *      循环体;
 *  }while(布尔表达式);
 */
public class Test02 {
    public static void main(String[] args) {
        int i=0;
        int sum =0;
        do{
            sum+=i;
            i++;
        }while(i<=100);
        System.out.println("Sum = "+sum);
    }
}
