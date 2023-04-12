package JAVA基础深化和提高.多线程;

public class TestYieldThread implements Runnable {
    @Override
    public void run() {
        for (int i =0;i<30;i++){
            if ("Thread-0".equals(Thread.currentThread().getName())){
                if (i==0){
                    Thread.yield();
                }
            }
            System.out.println(Thread.currentThread().getName()+" "+i);

        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TestYieldThread());
        Thread t2 = new Thread(new TestYieldThread());
        t1.start();
        t2.start();
    }
}
