package JAVA基础深化和提高.多线程;

class GetName1 extends Thread{
    @Override
    public void run() {
        System.out.println(this.getName());
    }
}

class GetName2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class TestGetName {
    public static void main(String[] args) {
        GetName1 getName1 = new GetName1();
        getName1.start();
        Thread thread = new Thread(new GetName2());
        thread.start();
    }
}
