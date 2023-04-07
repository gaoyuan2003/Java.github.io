package JAVA基础深化和提高.多线程;

public class TestThread2 implements Runnable {
    //线程方法
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new TestThread2());
        t.start();
        Thread t2 = new Thread(new TestThread2());
        t2.start();
    }
}
