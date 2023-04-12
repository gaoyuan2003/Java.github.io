package JAVA基础深化和提高.多线程;

import java.io.IOException;

public class TestStopThread implements Runnable {
    //生死牌
    private boolean flag = true;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始");
        int i=0;
        while(this.flag){
            System.out.println(Thread.currentThread().getName()+" "+i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"线程结束");
    }
    public void stop(){
        this.flag = false;
    }

    public static void main(String[] args) {
        System.out.println("主线程开始");
        TestStopThread tst = new TestStopThread();
        Thread t = new Thread(tst);

        t.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        tst.stop();
        System.out.println("主线程结束");
    }
}
