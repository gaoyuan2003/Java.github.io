package 语句switch;

public class Test03 {
    public static void main(String[] args) {
        String str="audi";
        switch(str){
            case "audi":
                System.out.println("我买了一个奥迪车");break;
            case "benz":
                System.out.println("我买了一个奔驰");break;
            default:
                System.out.println("比亚迪，挺好！");
        }
    }
}
