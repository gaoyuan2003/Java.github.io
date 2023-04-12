package JAVA基础深化和提高.多线程;

//抽烟线程
class FatherSmoking implements Runnable{
    @Override
    public void run() {
        System.out.println("father想抽烟了");
        System.out.println("发现烟没了");
        Thread t = new Thread(new SonBuySmoking());
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("father出门找儿子");
            System.exit(1);
        }
        System.out.println("father拿过烟，抽了起来");
    }
}


//儿子买烟线程
class SonBuySmoking implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(1000);
            System.out.println("儿子拿到money去买烟");
            Thread.sleep(500);
            System.out.println("进入超市");
            Thread.sleep(500);
            for(int i=1;i<=10;i++){
                System.out.println("第"+i+"分钟");
                Thread.sleep(1000);
            }
            System.out.println("拿烟给钱");
            Thread.sleep(500);
            System.out.println("回家");
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

public class TestJoinDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new FatherSmoking());
        System.out.println("抽烟的故事");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("故事结束了");
    }
}
