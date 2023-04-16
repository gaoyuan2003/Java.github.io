package JAVA基础深化和提高.多线程;

//定义馒头类
class ManTou{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

//定义缓冲区
class SyncStack{
    private ManTou[] mt = new ManTou[10];
    private int index;
    public synchronized void push(ManTou manTou){
        while (this.mt.length == this.index){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        this.mt[this.index] = manTou;
        this.index++;
    }
    public synchronized ManTou pop(){
        while (this.index == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        this.index--;
        return this.mt[this.index];
    }
}

class SheChanZhe extends Thread{
    private SyncStack ss;
    public SheChanZhe(SyncStack ss){
        this.ss = ss;
    }

    @Override
    public void run() {
        for(int i = 0;i<20;i++){
            ManTou mt = new ManTou();
            mt.setId(i);
            System.out.println("生产馒头："+mt.getId());
            this.ss.push(mt);
        }
    }
}

class xiaFei extends Thread{
    private SyncStack ss;
    public xiaFei(SyncStack ss){
        this.ss = ss;
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            ManTou mt = this.ss.pop();
            System.out.println("消费馒头："+mt.getId());
        }
    }
}

public class TestProduceThread {
    public static void main(String[] args) {
        SyncStack syncStack = new SyncStack();
        new SheChanZhe(syncStack).start();
        new xiaFei(syncStack).start();
    }
}
