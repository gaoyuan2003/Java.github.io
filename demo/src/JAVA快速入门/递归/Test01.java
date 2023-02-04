package 递归;
//递归求n！
public class Test01 {
    public static void main(String[] args) {
        System.out.println("10! = "+factoria(10));
    }
    static long factoria(int n){
        if(n==1){
            return 1;
        }else{
            return n*factoria(n-1);
        }
    }
}
