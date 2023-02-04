package 语句switch;

/**
 * switch(表达式){
 *     case 值1:
 *          语句块1;
 *          [break];
 *     case 值2:
 *          语句块2;
 *          [break];
 *          ······
 *     [default:
 *          默认语句块;]
 * }
 */

public class Test01 {

    public static void main(String[] args) {
        int grade = 3;
        if (grade == 1) {
            System.out.println("大学一年级，可以放松一下");
        } else if (grade == 2) {
            System.out.println("大学二年级，少玩点游戏，不慌嘛？");
        } else if (grade == 3) {
            System.out.println("大学三年级，专业课开始了，好好学，找份工作");
        } else {
            System.out.println("大四了，要毕业了.");
        }


        switch (grade) {
            case 1:
                System.out.println("大学一年级");
                break;
            case 2:
                System.out.println("大学二年级");
                break;
            case 3:
                System.out.println("大学三年级");
                break;
            default:
                System.out.println("大四了，要毕业了");
                break;
        }
    }
}
