package JAVA基础深化和提高.多线程;

public class TestSetThread {
    public static void main(String[] args) {
        SetName1 setName1 = new SetName1("setName1");
        setName1.start();
        Thread thread = new Thread(new SetName2());
        thread.setName("setName2");
        thread.start();
    }
}

class SetName2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class SetName1 extends Thread{
    public SetName1(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.getName());
    }
}