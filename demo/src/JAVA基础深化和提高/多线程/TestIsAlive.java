package JAVA基础深化和提高.多线程;

class IsAlive implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(true){
            System.out.println(Thread.currentThread().getName() +" "+i++);
            System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().isAlive());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i == 5){
                break;
            }
        }
    }
}

public class TestIsAlive {
    public static void main(String[] args) {
        Thread thread = new Thread(new IsAlive());
        thread.setName("childThread");
        System.out.println(thread.getName()+" "+thread.isAlive());
        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName()+" "+thread.isAlive());
    }
}
