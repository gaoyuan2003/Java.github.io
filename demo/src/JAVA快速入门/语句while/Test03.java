package 语句while;

/**
 * while与do-while的区别
 *
 */
public class Test03 {
    public static void main(String[] args) {
        //while循环；先判断再执行
        int a=0;
        while(a<0){
            System.out.println(a);
            a++;
        }
        System.out.println("----------");
        //do-while循环，先执行再判断
        a=0;
        do{
            System.out.println(a);
            a++;
        }while (a<0);
    }
}
