package 递归;



//使用循环求n！
public class Test02 {
    public static void main(String[] args) {
        int a=10;
        int result=1;
        while(a>1){
            result*=a*(a-1);
            a-=2;
        }
        System.out.println("10! = "+result);
    }

}
