package JAVA基础深化和提高.多线程;

public class TestThread extends Thread {
    //线程方法，该方法不能直接调用，而是通过Thread类中的start方法来启动
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(this.getName()+" : "+i);
        }
    }
    //主线程
    public static void main(String[] args) {
        //创建线程对象
        TestThread th = new TestThread();
        th.start();
        TestThread th2 = new TestThread();
        th2.start();
        TestThread th3 = new TestThread();
        th3.start();
    }
}
