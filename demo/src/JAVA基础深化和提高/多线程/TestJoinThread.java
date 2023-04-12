package JAVA基础深化和提高.多线程;

class A implements Runnable{
    private Thread b;
    public A(Thread b){
        this.b=b;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" A "+i);
            if(i==5){
                try {
                    this.b.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class B implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+" B "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TestJoinThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new B());
        Thread t = new Thread(new A(t1));

        t.start();
        t1.start();
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i==2){
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
