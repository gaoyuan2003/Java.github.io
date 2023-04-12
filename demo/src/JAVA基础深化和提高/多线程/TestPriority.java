package JAVA基础深化和提高.多线程;

class Priority implements Runnable{
    private int num = 0;
    private boolean flag = true;

    @Override
    public void run() {
        while(this.flag){
            System.out.println(Thread.currentThread().getName()+" "+num++);
        }
    }

    public void stop(){
        this.flag = false;
    }
}

public class TestPriority {
    public static void main(String[] args) {
        Priority priority = new Priority();
        Priority priority1 = new Priority();
        Thread thread = new Thread(priority);
        Thread thread1 = new Thread(priority1);
        thread.setName("线程1");
        thread1.setName("线程2");
        System.out.println(thread.getName()+" "+thread.getPriority());
        System.out.println(thread1.getName()+" "+thread1.getPriority());
        thread.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(thread.getName()+" "+thread.getPriority());
        System.out.println(thread1.getName()+" "+thread1.getPriority());
        thread.start();
        thread1.start();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        priority.stop();
        priority1.stop();
    }
}
