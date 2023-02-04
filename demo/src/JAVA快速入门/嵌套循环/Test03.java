package 嵌套循环;

public class Test03 {
    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                count++;
                if(count%2==1){
                    System.out.print("* ");
                }else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
