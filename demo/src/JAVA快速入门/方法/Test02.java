package 方法;

/**
 * 方法的重载
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(add(3,5));//8
        System.out.println(add(3.3,5));//8.3
        System.out.println(add(3,5.2));//8.2
        System.out.println(add(1,2,5));//8
    }
    //求和
    public static int add(int n1,int n2){
        int sum =n1+n2;
        return sum;
    }
    //方法名相同，参数个数不同，构成重载
    public static int add(int n1,int n2,int n3){
        int sum=n1+n2+n3;
        return sum;
    }
    //方法名相同，参数类型不同，构成重载
    public static double add(double n1,int n2){
        double sum=n1+n2;
        return sum;
    }
    //方法名相同，参数顺序不同，构成重载
    public static double add(int n1,double n2){
        double sum=n1+n2;
        return sum;
    }
}
