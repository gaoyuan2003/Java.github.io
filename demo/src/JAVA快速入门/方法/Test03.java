package 方法;

/**
 * 定义一个方法处理迟到问题
 * （1）输入参数：迟到时间，月薪
 * （2）处理逻辑:迟到1——10分钟，警告
 * 迟到11——20分钟，罚款100元
 * 迟到21——30分钟，罚款200元
 * 迟到大于30分钟，罚款1000元
 * （3）输出罚款金额
 */

public class Test03 {
    public static void fine(int minuter){
        if(minuter<=10){
            System.out.println("警告！不许迟到！");
        }else if(minuter<=20){
            System.out.println("罚款100元");
        }else if(minuter<31){
            System.out.println("罚款200元");
        }else{
            System.out.println("罚款1000元");
        }
    }

    public static void main(String[] args) {
        fine(24);
        System.out.println("运行结束");
    }
}
