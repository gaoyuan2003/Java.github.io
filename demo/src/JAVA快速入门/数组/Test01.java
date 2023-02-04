package 数组;
//数组的初始化
public class Test01 {
    public static void main(String[] args) {
        int [] a={1,2,3};
        Man[] man={new Man(1,1),new Man(2,2)};
        int[] a1=new int[2];
        a1[0]=1;
        a1[1]=2;
        int[] a2=new int[2];
        boolean[] b=new boolean[2];
        String[] s=new String[2];
    }

}
class Man{
    int age;
    int size;

    public Man(int age, int size) {
        this.age = age;
        this.size = size;
    }
}