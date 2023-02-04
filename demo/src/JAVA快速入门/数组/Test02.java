package 数组;

public class Test02 {
    public static void main(String[] args) {
        int[] a=new int[4];

        for(int i=0;i< a.length;i++){
            a[i]=100*i+99;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("**************");
        for(int temp:a){
            System.out.println(temp);
        }
    }
}
