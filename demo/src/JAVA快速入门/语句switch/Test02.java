package 语句switch;



public class Test02 {
    public static void main(String[] args) {
        int month=2;
        if(month==1||month==2||month==3){
            System.out.println("春季");
        }else if(month==4||month==5||month==6){
            System.out.println("夏季");
        }else if(month==7||month==8||month==9){
            System.out.println("秋季");
        }else if(month==10||month==11||month==12){
            System.out.println("冬季");
        }else{
            System.out.println("输入错误");
        }

        System.out.println("=========使用switch修改=========");

        switch(month){
            case 1:
            case 2:
            case 3:
                System.out.println("春季");break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季");break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季");break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬季");break;
            default:
                System.out.println("输入错误");
        }
    }
}
