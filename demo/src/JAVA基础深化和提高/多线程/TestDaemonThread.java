package JAVA基础深化和提高.多线程;

class Daemon implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TestDaemonThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Daemon(),"Daemon");
        //把用户线程变成辅助线程
        thread.setDaemon(true);
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束");
    }
}
