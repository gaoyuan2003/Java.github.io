package 嵌套循环;

/**
 * 九九乘法表
 */
public class Test02 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"  ");
            }
            System.out.println();
        }
    }
}
